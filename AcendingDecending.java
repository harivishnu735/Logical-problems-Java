import java.util.Scanner;
class AcendingDecending{
    public static void main(String args[]){
        int start=0,stop=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and stop values :");
        start=sc.nextInt();
        stop =sc.nextInt();
        
        if(start<stop){
            for(int i=start;i<=stop;i++){
                System.out.print(i+" ");
            }
        }
        if(start>stop){
            for(int i=start;i>=stop;i--){
                System.out.println(i+" ");
            }
        }
    }
}