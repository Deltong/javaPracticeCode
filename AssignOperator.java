public class AssignOperator{
	public static void main(String[] args) {
		//赋值运算符
		int A = 1;
		A += 2;
		System.out.println(A);
		A /= 2;
		System.out.println(A);
		
		//赋值运算符强制转换
		byte B = 10;
		B += 2000;//B = (byte)(B + 2000);
		B++;
		System.out.println(B);
	}
}