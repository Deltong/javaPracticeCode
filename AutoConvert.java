public class AutoConvert{
	public static void main(String[] args) {
		int A = 'a';
		double B = 70;
		System.out.println(A);
		System.out.println(B);
		
		int C = 10;
		float D = C + 1.1F;
		double E = C + 1.1;
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		
		byte G = 10;
		int F = 1;
//		byte G = F;
		System.out.println(G);
		
		byte H = 1;
		char I = 2;
		short J = 2;
		int K = H + I + J;
		System.out.println(K);
		
//		boolean 不参与类型自动转换
		
		byte L = 100;
		short M = 2;
		int N = 666;
		float O = 90.0F;
		double P = L + M + N + O;
		System.out.println(P);
	}
}