import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        int sum = 0;

        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] grades = new int[n];

        System.out.println("Enter the grades:");
        for(int i = 0; i < n; i++) {
            grades[i] = input.nextInt();
            sum += grades[i];
        }
        input.close();

        double average = (double) sum / n;

        int max = grades[0];
        int min = grades[0];
        System.out.println("----Grades----" + "\n");
        for(int i = 0; i < n; i++) {
            if(max < grades[i]) {
                max = grades[i];
            }else if(min > grades[i]) {
                min = grades[i];
            }
            System.out.println("Student " + (i+1) + " scored: " + grades[i] + "%");
        }

        System.out.println("The average grade is: " + average);
        System.out.println("The highest grade is: " + max);
        System.out.println("The lowest grade is: " + min);
    }
}
