public class ForceConvert{
	public static void main(String[] args) {
		int A1 = (int)1.9;
		System.out.println("A1=" + A1);
		
		int A2 = 1000;
		byte A3 = (byte)A2;
		System.out.println("A3=" + A3);
		
		int B1 = (int)(10*3.3+3/4.1);
		System.out.println(B1);
		
		char C1 = 200;
		int C2 = 300;
//		char C3 = C2;
		char C4 = (char)C2;
		System.out.print(C4);
		
		char D1 = 1;
		byte D2 = 2;
		short D3 = 2;
		int D4 = D1 + D2 + D3;
		System.out.println(D4);
		
		short E1 = 10;
		E1 = (short)(E1 - 3);
		System.out.println(E1);
	}
}