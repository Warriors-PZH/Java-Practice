package practice;

public class test1 {

	public static void main(String[] args) {
		int[] nums={0,0,0,1,1,2,3,3,3,4,5,5,5,7,8}; 

		int index = 0;
		for(int i = 1;i < nums.length;i++){
			if(nums[index] != nums[i]){
				nums[++index] = nums[i];
			}
		}
		for(int i:nums){
			System.out.println(i);
		}

	}

}
