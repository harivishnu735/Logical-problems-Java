import java.util.Scanner;
class NumbersReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n=sc.nextInt();
        int i=0;
        for(i=n;i>=1;i--)
        System.out.print(i+" ");
    }
}