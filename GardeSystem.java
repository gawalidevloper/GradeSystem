import java.util.Scanner;
public class GardeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator.");
        System.out.print("Enter the number of subjects: ");
        int num_subject = sc.nextInt();
        int Total_marks = 0;
        for (int i = 1; i <= num_subject; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();
            Total_marks += marks;
        }
        double Percentage = (double) Total_marks / num_subject;
        System.out.println();
        System.out.println("Total marks obtained in all Subjects is "+ Total_marks);
        System.out.println("Your Percentage is " + Percentage+"%");
        if (Percentage>89) {
            System.out.println("Grade : A+(Outstanding)");
        }else if (Percentage<90 && Percentage>79) {
            System.out.println("Grade : A(Excellent)");
        }else if (Percentage<80 && Percentage>69) {
            System.out.println("Grade :B+(very Good)");
        }else if (Percentage<70 && Percentage>59){
            System.out.println("Grade : B(Good)");
        }else if (Percentage<60 && Percentage>49){
            System.out.println("Grade : C(Average)");
        }else if (Percentage<50 && Percentage>39){
            System.out.println("Grade : p(pass)");
        }else{
            System.out.println("Grade : F(Fail)");
        }
        System.out.println();
    }
}