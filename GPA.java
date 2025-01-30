import java.util.*;
public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("1.GPA\n2.CGPA\n3.SGPA\n4.Stop\nSelect one:");
            int opt = sc.nextInt();
    
            if (opt == 1){
                System.out.print("Enter total marks: ");
                int totmarks = sc.nextInt();
                System.out.print("Enter your marks: ");
                int marks = sc.nextInt();
                float percentile = ((float) marks / totmarks) * 100;
                float GPA = percentile / 10;
                System.out.printf("Your marks: %d\nPercentage: %.2f\nGPA: %.2f\n", marks, percentile, GPA);
            }else if(opt == 2){
                System.out.print("Enter number of semesters: ");
                int semesters = sc.nextInt();
                double totalGPA = 0;
        
                for (int i = 1; i <= semesters; i++) {
                    System.out.print("Enter GPA for semester " + i + ": ");
                    double gpa = sc.nextDouble();
                    totalGPA += gpa;
                }
        
                double cgpa = totalGPA / semesters;
                System.out.printf("Your CGPA is: %.2f\n", cgpa);
        
            }else if(opt == 3){
                System.out.print("Enter number of subjects in the current semester: ");
                int numSubjects = sc.nextInt();
                double totalGradePoints = 0;
                double totalCredits = 0;
    
                for (int i = 1; i <= numSubjects; i++) {
                    System.out.print("Enter grade points for subject " + i + ": ");
                    double gradePoints = sc.nextDouble();
                    System.out.print("Enter credits for subject " + i + ": ");
                    double credits = sc.nextDouble();
                    totalGradePoints += gradePoints * credits;
                    totalCredits += credits;
                }
    
                double sgpa = totalGradePoints / totalCredits;
                System.out.printf("Your SGPA is: %.2f\n", sgpa);
            }else if(opt == 4){
                break;
            }else{
                System.out.println("Invalid option");
            }
 
        }
         sc.close();
    }
}
