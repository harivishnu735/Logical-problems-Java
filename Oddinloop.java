import java.util.Scanner;
class Oddinloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n=sc.nextInt();
        System.out.println("Odd numbers are :");
        for(int i=1;i<=n;i=i+2)
        System.out.print(i+" ");
    }
}