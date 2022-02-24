import java.util.*;
class EvenOddInWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int num=sc.nextInt();
        int i=0;
        while(i<=num){
             if(i%2==0){
            System.out.print(i+" ");
             }
            i=i+2;
      }
      System.out.println();
       i=1;
      while(i<=num){
          if(i%2!=0){
         System.out.print(i+" ");
              
          }
            i=i+2;
      }
    }
}