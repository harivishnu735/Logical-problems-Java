import java.util.Scanner;
class Primenumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("It is a Prime number :");
        }
        else{
            System.out.println("It is not a Prime number ");
        }
    }
}