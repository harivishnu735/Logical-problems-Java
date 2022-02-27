class Occurance{
    public static void main(String args[]){
        int arr[]={12,34,12,22,22,12,55};
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0){
            System.out.println(arr[i]+" :"+count);
            }
            count=1;
         }
    
    } 
}