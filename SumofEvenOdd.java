import java.util.Scanner;
class SumofEvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int esum=0,osum=0,i;
        i=1;
        while(i<=num){
           if(i%2==0){
               esum=esum+i;
           }
           else{
               osum=osum+i;
           }
           i++;
        }
        System.out.println("Sum even numbers upto "+num+" = " +esum);
         System.out.println("Sum odd numbers upto "+num+" = " +osum);
    } 
}