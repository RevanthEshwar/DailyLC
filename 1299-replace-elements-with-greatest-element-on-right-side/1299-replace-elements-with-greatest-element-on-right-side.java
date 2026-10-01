class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;


        //gpt
        // int max=-1;

        // for(int i=arr.length-1;i>=0;i--){
        //     int curr=arr[i];

        //     arr[i]=max;

        //     if(curr>max){
        //         max=curr;
        //     }
        // }
        // return arr;
    }
}