import java.util.Scanner;
class NumberStarting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        System.out.print(i+" ");
    }
}