import java.util.Scanner;
class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<=11;i++){
            System.out.println(i+"*"+ n +"*"+n*i);
        }
    }
}