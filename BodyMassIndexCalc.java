import javax.swing.JOptionPane;
public class BodyMassIndexCalc {
    public static double calculateBMI(double heightInches, double weightPounds){
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter your height in inches: ");
        String weightInput = JOptionPane.showInputDialog("Enter your weight in pounds: ");
        
        double height = Double.parseDouble(heightInput);
        double weight = Double.parseDouble(weightInput);
        
        double bmi = calculateBMI(height, weight);
        
        JOptionPane.showMessageDialog(null,"Height: " + height
                + "\nWeight: " + weight +
                "\nBMI: " + bmi);
    }
}
