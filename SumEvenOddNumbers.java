import java.util.Scanner;
class SumEvenOddNumber{
    public static void main(String args[]){
        int n,sum=0,obj=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements array :");
        n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the elements of array :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
            if(a[i]%2 ==0){
                sum=sum+a[i];
            }
            else{
               obj=obj+a[i];
            }
        }
        System.out.println("Sum of even numbers :"+sum);
        System.out.println("Sum of even numbers :"+obj);
        
    }
}