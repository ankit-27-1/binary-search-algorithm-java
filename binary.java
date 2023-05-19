public class binary {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int target=3;
        System.out.println(index(arr,target));
    }
    static int index(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                start++;
                end=arr[mid-1];
            }
            else if(arr[mid]<target){
                end--;
                start=arr[mid+1];
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
