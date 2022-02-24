import java.util.Scanner;
class Countnumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int count=1;
       for(int i=1;i<=num;i++) {
          num=num/10;
          ++count;
        }
        System.out.println("The number of digits are :"+count);
    }
}