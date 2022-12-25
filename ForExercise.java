public class ForExercise{
	public static void main(String[] args) {
		//打印XX--XX之间X的倍数的整数 统计个数并求和
		int A = 0;
		int sum = 0;
		int stat = 4;
		int end = 987;
		int X = 11;
		for(int i = stat; i <= end ;i++) {
			if(i % X == 0) {
				System.out.println("i=" + i);
				A++;
				sum += i;
			}
		}
		System.out.println("A=" + A);
		System.out.println("sum=" + sum);
	}
}