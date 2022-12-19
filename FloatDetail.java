public class FloatDetail{
	public static void main(String[] args) {
//		float A = 1.1;
		float A = 1.1F;
		double B = 1.1;
		double C = 1.1f;
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		double D = .123;
		System.out.println(D);
		
		double E = 2.123456789;
		float F = 2.123456789F;
		System.out.println(E);
		System.out.println(F);
		
		double G = 2.7;
		double H = 8.1 / 3;
		System.out.println(G);
		System.out.println(H);
		if(G == H) {
			System.out.println("相等");
		}
		double I = G - H;
		System.out.println(I);
		if(Math.abs(I) < 0.0000001) {
			System.out.println("差值非常小，认为相等");
		}
	}
}