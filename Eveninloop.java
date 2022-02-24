import java.util.Scanner;
class Eveninloop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers :");
        int n=sc.nextInt();
        System.out.println("Even numbers are :");
        for(int i=0;i<=n;i=i+2)
        System.out.print(i+" ");
    }
}