public class InsertionSort {
    public static void main(String []args){
        int[] nums={3,1,5,7,9,4,2,5};
        int size =nums.length;
        int minIndex =-1;
        int temp =0;

        for (int num :nums){
            System.out.print(num+" ");
        }
//        first for loop
        for(int i=0;i<size-1;i++){
            minIndex =i;
//            second for loop
            for (int j =i;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex =j;
                }
            }
            temp =nums[minIndex];
            nums[minIndex] =nums[i];
            nums[i]=temp;
        }
        System.out.println();
        for (int num :nums){
            System.out.print(num+" ");
        }

    }
}
