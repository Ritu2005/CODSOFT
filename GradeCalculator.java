import java.util.Scanner;
import java.io.*;
class gradecalculator
{
    String grade(double avg)
    {

        if (avg >= 9 && avg<=10) {
            return "A+";
        } else if (avg >= 8 && avg<=9) {
            return "A";
        } else if (avg >= 7 && avg<=8) {
            return "B+";
        } else if (avg >= 6 && avg<=7) {
            return "B";
        } else if(avg >= 5 && avg<=6) {
            return "C";
        } else{
            return "F";
        }
    }         

    void main()
    {
        gradecalculator ob=new gradecalculator();
        double tmark=0,avg=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of subjects and sum of the full marks of the total subjects");
        int subno=sc.nextInt();
        double fullmarks=sc.nextInt();
        for(int i=1;i<=subno;i++)
        {
            System.out.println("Enter the mark of the subject: "+ i);            
            tmark+=sc.nextInt();
        }
        avg=(tmark/fullmarks)*10;
        String grade=ob.grade(avg);
        avg=(tmark/fullmarks)*100;
        System.out.printf("\nTotal: %f%nAverage: %f%%%nGrade: %s", tmark, avg, grade);
    }
}
