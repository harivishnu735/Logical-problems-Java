import java.util.Scanner;
class StrongNumberinWhile{
    public static void main(String args[]){
        int num,temp,reminder,sum=0,i,fact;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            fact=1;
            i=1;
            reminder=temp%10;
        while(i<=reminder){
            fact=fact*i;
            i++;
        }
        System.out.println("The Factorial of "+reminder+ " = "+fact);
        sum=sum+fact;
        temp=temp/10;
        }
        System.out.println("The sum of Factorial of given number :"+num+" = "+sum);
        if(num==sum){
            System.out.println("\n"+num+" is a Strong number");
        }
        else{
            System.out.println("\n"+num+" is not a Strong number ");
        }
    }
}