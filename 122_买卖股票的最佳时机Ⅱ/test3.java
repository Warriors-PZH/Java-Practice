package practice;

public class test3 {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int salary = 0;
		for(int i = 0;i < prices.length - 1;i++){
			if(prices[i] < prices[i + 1]){
				salary += (prices[i + 1] - prices[i]);
			}
		}
		System.out.println(salary);
	}
}
