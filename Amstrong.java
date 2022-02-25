class Amstrong{
    public static void main(String args[]){
       
        int num=153;
       int sum=0,a,temp;
        temp=num;
        while(num >0){
            a=num%10;
            num=num/10;
            sum=sum+(a*a*a);
        }
        if(temp==sum)
        System.out.println(temp+" Is amstrong number :");
        else
        System.out.println(temp+" Is not amstrong number :");
        
    }
}