class EvenOddinArr{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Odd numbers are :");
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                 sum=sum+arr[i];
             System.out.println(arr[i]);   
            }
        }
       System.out.println("Even numbers are:");
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               System.out.println(arr[i]);
           }
       }
    }
}