/*
1. WAP to read basic salary and find gross salary.
gs= hra+da+bs;
hra is 56% on basic
da is 90% on basic*/
import java.util.Scanner;
public class Salary{
    public static void main(String args[]){
    float bs,gs,hra,da;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter basic salary:");
    bs=sc.nextFloat();
    System.out.println("Enter the HRA amount :");
    float hra1=sc.nextFloat();
    System.out.println("Enter the DA amount :");
    float da1=sc.nextFloat();
    hra=(hra1 *bs)%56;
    da=(da1 *bs)%90;
    gs=hra+da+bs;
    System.out.println("The Gross salary is :"+gs);
    
   }   
}