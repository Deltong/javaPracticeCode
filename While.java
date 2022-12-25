public class While{
	public static void main(String[] args) {
		int A = 1;
		while(A <= 10) {
			System.out.println("Deltong" + A);
			A++;
		}
		System.out.println("==================================");
		int stat = 1;
		int B = stat;
		int end = 100;
		int X = 3;
		while(B <= end) {
			if(B % X == 0) {
				System.out.println(B);
			}
			B++;
		}
		System.out.println("==================================");
		int C = 40;
		int endNum = 200;
		while(C <= endNum) {
			if(C % 2 == 0) {
				System.out.println(C);
			}
			C++;
		}
	}
}