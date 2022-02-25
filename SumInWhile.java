import java.util.Scanner;
class SumInWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int sum=0,reminder=0;
        while(num>0){
            reminder=num%10;
            sum=sum+reminder;
            num=num/10;
        }
        System.out.println("Sum of the digits of given number :"+sum);
    } 
}