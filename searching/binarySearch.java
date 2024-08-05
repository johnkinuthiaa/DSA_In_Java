package searching;
class Main{
    public static int binarySearch(int[] nums,int target){
        int left =0;
        int right =nums.length-1;
        while (left<=right) {
            int mid =(left+right)/2;
            if (nums[mid] ==target) {
                return mid;
            }else if (nums[mid]<target) {
                left =mid +1;
            }else{
                right =mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // a sorted array
        int[] nums ={2,3,4,5,6,7,8,9};
        int target =7;
        int result = binarySearch(nums, target);
        if(result !=-1){
            System.out.println("target found at index:"+result);
        }
        else{
            System.out.println("target not found");
        }
    }
}