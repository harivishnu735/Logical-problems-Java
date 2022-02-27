class ArrSum{
    public static void main(String args[]){
        int arr[]={12,34,56,22,66,16,55};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all the elements is :"+sum);
    } 
}