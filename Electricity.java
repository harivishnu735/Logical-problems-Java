import java.util.Scanner;
public class Electricity{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double units,gst,bill,finalbill;
      System.out.println("Enter the number of units :");
      units=sc.nextFloat();
      bill=(units*34.50);
      gst=(bill*18)/100;
      finalbill=bill+gst;
      System.out.println("The bill amount "+bill);
      System.out.println("The GSt amount "+gst);
      System.out.println("Enter the Final bill :"+finalbill);
    }
}