import java.util.Scanner;
public class MethodsGame {
    public static boolean switchPlanet(int n){
        boolean isTrue;
        switch (n){
            case 1:
                System.out.println("The Earth is the densest planet in the Solar System.");
                isTrue = true;
                break;
            case 2:
                System.out.println("Jupiter has a persistent storm known as the Great Red Spot.");
                isTrue = true;
                break;
            case 3:
                System.out.println("Venus rotates in the opposite direction compared to most planets.");
                isTrue = true;
                break;
            case 4:
                System.out.println("Mercury has no natural moons.");
                isTrue = true;
                break;
            case 5:
                System.out.println("Mars is the hottest planet in the Solar System.");
                isTrue = false;
                break;
            case 6:
                System.out.println("Neptune has some of the fastest winds in the Solar System.");
                isTrue = true;
                break;
            case 7:
                System.out.println("Saturn is a terrestrial (rocky) planet.");
                isTrue = false; 
                break;
            case 8:
                System.out.println("Jupiter is smaller than Earth.");
                isTrue = false; 
                break;
            case 9:
                System.out.println("Uranus is the closest planet to the Sun.");
                isTrue = false; 
                break;
            case 10:
                System.out.println("Pluto is classified as a gas giant.");
                isTrue = false;
                break;
            default:
                System.out.println("Unknown planet fact.");
                isTrue = false;
        }
        return isTrue;
    }
    public static void compare(boolean correctAnswer, String userAnswer){
        if (userAnswer == null){
            System.out.println("Incorrct");
            return;
        }
        String norm = userAnswer.trim().toLowerCase();
        Boolean userBool = null;
        if(norm.equals("true") || norm.equals("t")){
            userBool = true;
        }else if(norm.equals("false") || norm.equals("f")){
            userBool = false;
        }
        
        if(userBool == null){
            System.out.println("Incorrect");
            return;
        }
        
        if (userBool== correctAnswer){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playing = true;
       
        while(playing){
            int n = (int)(Math.random() * 10) + 1;
            boolean factIsTrue = switchPlanet(n);
            
            System.out.println("True or False? ");
            String userAnswer = in.nextLine();
            
            compare(factIsTrue, userAnswer);
            System.out.println("Play again?");
            String again = in.nextLine().trim().toLowerCase();
            if(!(again.equals("yes") || again.equals("y"))){
                playing = false;
            }
            System.out.println();
        }
        in.close();
    }
}
