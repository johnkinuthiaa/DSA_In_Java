package searching;
public class LinearSearch{
    public static int linearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {20,1,6,8,4,5,9,2,4,6,97,53,23,46,45,61};
        int target = 97;
        int result = linearSearch(arr,target);
        if(result !=-1){
            System.out.println("target found at index:"+result);
        }
        else{
            System.out.println("target not found");
        }
    }

}
