import java.util.Scanner;
public class Day{
    public static void  main(String args[]){
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Day :");
        day=sc.nextInt();
        if(day<=1){
            System.out.println("It is Sunday ");
            
        }
        else if(day<=2){
             System.out.println("It is monday ");
        }
        else if(day<=3){
             System.out.println("It is Tuesday ");
        }
        else if(day<=4){
             System.out.println("It is wednsday ");
        }
        else if(day<=5){
             System.out.println("It is Thursday ");
        }
        else if(day<=6){
             System.out.println("It is friday ");
        }
        else if(day<=7){
             System.out.println("It is Saturday ");
        }
        else{
             System.out.println("It is invalid");
        }
    }
}