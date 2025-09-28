import java.util.Scanner;

public class RandomCulculations {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.println("Choose opperation: add, subtract, multiply, divide");
        String op = input.nextLine().trim().toLowerCase();
        
        System.out.println("Enter lower bond: ");
        int lower = input.nextInt();
        System.out.println("Enter upper bond: ");
        int upper = input.nextInt();
        
        int r1 = generateRandomNum(lower, upper);
        int r2 = generateRandomNum(lower, upper);
        
        double result;
        
        switch (op){
            case "add":
                result = add(r1, r2);
                break;
            case "subtract":
                result = subtract(r1, r2);
                break;
            case "multiply":
                result = multiply(r1, r2);
                break;
            case "divide":
                result = divide(r1, r2);
                break;
            default:
                System.out.println("Invalid opperation.");
                input.close();
                return;
        }
        
        System.out.println("Result = " +result);
        input.close();
    }
    public static int generateRandomNum(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    
    public static double add(double x, double y){
        return x + y;
    }
    
    public static double subtract(double x, double y){
        return x - y;
    }
    
    public static double multiply(double x, double y){
        return x * y;
    }
    
    public static double divide(double x, double y){
        if(y == 0){
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return x / y;
    }
}
