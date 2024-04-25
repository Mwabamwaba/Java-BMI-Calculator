//Welcome to my BMI Calculator, Hope you enjoy
import java.util.Scanner;
import javax.swing.JOptionPane;

public class bmi {
    public static void main (String[]args){
        Scanner quetion = new Scanner (System.in);
        float weight = Float.parseFloat(JOptionPane.showInputDialog(null, "What is your Weight(kg)?")); 
        float height = Float.parseFloat(JOptionPane.showInputDialog(null, "What is your Height(m)?")); 
        
   //FORMULA FOR BODY MASS INDEX
   float bmi = weight / (height * height); 

   // If  HEIGHT & WEIGHT are positive
if(weight >= 0 && height >= 0){
   JOptionPane.showMessageDialog(null, "Your Body Mass Index(BMI) is:\n"+bmi + "\n Click the OK button for Your Healthtip :)", "Body Mass Index Checker", JOptionPane.INFORMATION_MESSAGE);
     
    //Tips according to inputs comments of BMI
    if ( bmi < 16){
        JOptionPane.showMessageDialog(null, "My friend find some appetite pills and make yourself a health meal");
        }
    else if (bmi  < 18){
        JOptionPane.showMessageDialog(null, "My friend Find something health to eat");
    }
    else if (bmi >= 18.0 && bmi <= 24.0){
        JOptionPane.showMessageDialog(null, "Normal weight \n Continue doing what you do :)");
    }
    else if (bmi  < 29){
        JOptionPane.showMessageDialog(null, "According to BMI You are Overweight Please consider seeking medical advice");
    }
    else if (bmi  > 35){
        JOptionPane.showMessageDialog(null, "According to BMI You are too fat my friend Please seek medical advice NOW :( ");
    }
    else{
        JOptionPane.showMessageDialog(null, "Visit www.mwabahealthcare.com :( ");
    }
    
}
// ERROR POPUPS IF BOTH HEIGHT & WEIGHT IS NEGATIVE
else{
JOptionPane.showMessageDialog(null, "ERROR!\nWeight or Height cannot be less than 0 \n Please start again.", "ERROR MESSAGE!!", JOptionPane.ERROR_MESSAGE);
}



quetion.close();

    }

}