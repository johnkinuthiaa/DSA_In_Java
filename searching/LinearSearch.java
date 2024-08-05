package searching;
public class LinearSearch{
    public static int LinearSearching(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums ={2,3,4,5,6,7,7,8,9,12,13,14,65,35,34,98};
        int target =34;
        int result =LinearSearching(nums, target);
        if(result !=-1){
            System.out.println("target found at index: "+result);
        }
        else{
            System.out.println("target not found!");
        }
    }
}
