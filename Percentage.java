/* 2. WAP read employee salary and 3 shopping bills.and find total shopping amount, and find how much % of amount he/she spent on shopping on his/her salary.

 Salary: 200000
s1 : 23000
s2 : 7000
s3 : 20000

 total shopping amount: 50000
25%  */
import java.util.Scanner;
public class Percentage{
    public static void main(String args[]){
     float salary,s1,s2,s3,total,percentage;
     Scanner sc=new Scanner(System.in );
     System.out.println("Enter the employee salary :");
     salary=sc.nextFloat();
     System.out.println("Enter s1 bill :");
     s1=sc.nextFloat();
     System.out.println("Enter s2 bill :");
     s2=sc.nextFloat();
     System.out.println("Enter s3 bill :");
     s3=sc.nextFloat();
     total=s1+s2+s3;
     percentage=(total *100)/salary;
     System.out.println("Total % on he/she spent on his/her salary is :"+percentage+"%");
     
    }

}