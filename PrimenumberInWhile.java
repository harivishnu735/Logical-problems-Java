class PrimenumberInWhile{
    public static void main(String args[]){
        int checknum;
        int i,num=1,count;
        System.out.println("Prime numbers from 1 to n are:");
        while(num<=50){
          count=0;  
               i=2;
        while(i<=num/2){
            if(num % i==0){
                count++;
                break;
            }
            i++;
        }
        if(count==0&&num !=1){
            System.out.print(num +" ");
        }
        num++;
      }
    }
}