import java.util.Scanner;
class Factors{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factors");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("factors of given numbers "+n+"is "+count);
    } 
}