public class RelationalOperator{
	public static void main(String[] args) {
		int A = 10;
		int A1 = 9;
		System.out.println(A > A1);
		System.out.println(A >= A1);
		System.out.println(A < A1);
		System.out.println(A <= A1);
		System.out.println(A == A1);
		System.out.println(A != A1);
		//关系表达式
		boolean Flag = A == A1;
		System.out.println("Flag=" + Flag);
	}
}