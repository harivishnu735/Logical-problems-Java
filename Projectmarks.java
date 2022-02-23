import java.util.Scanner;
public class Projectmarks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter project marks:");
        int pmarks=sc.nextInt();
        System.out.println("Enter External marks :");
        int emarks=sc.nextInt();
        System.out.println("Enter Internal Marks :");
        int imarks=sc.nextInt();
        int total=0;
        if(pmarks>=50 &&emarks>=50&&imarks>=50){
            total=(pmarks*70)/100+(emarks*20)/100+(imarks*10)/100;
            System.out.println("total Marks :"+total);
            if(total>=90){
                System.out.println(" A Grade :");
            }
             if(total>=75){
                System.out.println(" B Grade :");
            }
             else{
                System.out.println(" C Grade :");
            }
        }
        else{
         if(pmarks<50){
                System.out.println("You got failed in Project and score is: "+pmarks);
            }
            if(emarks<50){
                System.out.println("You got failed in External and score is: "+emarks);
            }
            if(imarks<50){
                System.out.println("You got failed in Internal and score is: "+imarks);
            }
            
        }    
    }
}