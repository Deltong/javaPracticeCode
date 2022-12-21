public class TernaryOperator{
	public static void main(String[] args) {
		//三元运算符 一真
		int A = 10;
		int B = 10;
		//if(C = A)C = A++;
		//else C = B--;
		int C = A > B ? A++ : B--;
		System.out.println(C);
		
		int A1 = 11,A2 = 222,A3 = 3;
		int Max1 = A1 > A2 ? A1 : A2;
		int Max2 = Max1 > A3 ? Max1 : A3;
		System.out.println("最大值=" + Max2);
		
		int Max = (A1 > A2 ? A1 : A2) > A3 ? (A1 > A2 ? A1 : A2) : A3;
		System.out.println("最大值=" + Max);
		
	}
}