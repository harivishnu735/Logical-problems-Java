import java.util.*;
public class Mobilenumber{
    public static void main(String args[]){
        String mobileNum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter mob number :");
        mobileNum=s.nextLine();
        int n =mobileNum.length();
        if(n ==10){
            System.out.println("Mobile number is Valid");
            for(int i=0;i<n;i++){
                if(i<6){
                    System.out.print("*");
                }
                else{
                    System.out.print(mobileNum.charAt(i));
                }
            }
        }
        else{
            System.out.println("Mobile Number is not valid");
        }
    }
}