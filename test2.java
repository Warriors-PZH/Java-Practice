package practice;

public class test2 {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		int i = 0,j = 0;
		int min = 0,max = 0;
		int salary = 0;
		//找第一个最小的
		while(i < prices.length - 1){
			for(;i < prices.length - 1;i++){
				if(prices[i] < prices[i + 1]){
					min = i;
					break;
				}else if(i == prices.length - 2){
					i = prices.length - 1;
					min = prices.length - 1;
					max = prices.length - 1;
					break;
				}
			}
			for(j = min;j < prices.length - 1;j++){
				if(prices[j] > prices[j + 1]){
					max = j;
					break;
				}else if(j >= prices.length - 2){
					max = prices.length - 1;
					break;
				}
			}
			i = j + 1;
			salary += (prices[max] - prices[min]);
		}
		
		System.out.println(salary);
		
	}
}
