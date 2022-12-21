public class ArithmeticOperator{
	public static void main(String[] args) {
		//除
		System.out.println(10 / 4); //2
		System.out.println(10.0 / 4); //2.5
		double A = 10 / 4;
		System.out.println(A); //2.0
		
		//取余 A % B = A - A / B * B
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1
		
		//自增
		int B = 12;
		B = B++;
//		System.out.println("B = " + B +"\t"+ "C = " + C);
		System.out.println("B = " + B);
		
		//Exercise
		int D = 10;
		int D1 = 20;
		int D2 = D++;
		System.out.println("D2=" + D2);
		System.out.println("D1=" + D1);
		System.out.println("D=" + D);
		D2 = --D1;
		System.out.println("D2=" + D2);
		System.out.println("D1=" + D1);
	}
}