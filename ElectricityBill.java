import java.util.Scanner;
class ElectricityBill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double amt=0;
        System.out.println("Enter the Electricity Bill :");
        int bill=sc.nextInt();
         if(bill<=50)
        {
             amt=bill*0.50;
                
         }
        else if(bill<=150)
        {
            amt=(50*0.50)+((bill-50)*0.75);
        }
         else if(bill<=250){
             amt=(50*0.50)+(100*0.75)+((bill-150)*1.25);
             }
        else{
             amt=(50*0.50)+(100*0.75)+(100*1.25)+((bill-250)*2.25);
        } 
       double gst=(amt*18)/100;
            
        System.out.println("The electricity bill is :"+amt);
        System.out.println("The gst bill is :"+gst);
        amt=amt+gst;
        System.out.println("Final Bill is:"+amt);
    }
}