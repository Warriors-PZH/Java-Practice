public class text2 {
	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		int result = x ^ y;
		byte[] bytes = Integer.toBinaryString(result).getBytes();
		result = 0;
		
		for(int i = 0;i < bytes.length;i++) {
			if((char)bytes[i] == '1') {
				result++;
			}
		}
		 
	}
}
