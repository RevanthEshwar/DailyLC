class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int a=0;
        int b=0;
        boolean fo1=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1] ){
                
                a++;
            }else{
                break;
            }
           
        }

        boolean fo2=false;
        for(int i=a;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                
                b++;
            }else{
                break;
            }
        }
        
        if(a==0 || b==0){
            return false;
        }

        if(a+b !=n-1){
            return false;
        }
        return true;


    }
}