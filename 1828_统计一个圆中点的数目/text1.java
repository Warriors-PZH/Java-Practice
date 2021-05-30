package warriors;

public class text1 {

	public static void main(String[] args) {
		int[][] points = {{1,1},{2,2},{3,3},{4,4},{5,5}};
		int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
		int[] answer = new int[queries.length];
		int size = 0;

		for(int i = 0;i < queries.length;i++) {
			for(int j = 0;j < points.length;j++) {
				size = (points[j][0] - queries[i][0]) * (points[j][0] - queries[i][0])
						+ ((points[j][1] - queries[i][1]) * (points[j][1] - queries[i][1]));
				if(size <= (queries[i][2] * queries[i][2])) {
					answer[i]++;
				}
			}
		}
		
		for(int n : answer) {
			System.out.print(n+" ");
		}
	}

}
