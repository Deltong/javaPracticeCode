public class StringToBasic{
	public static void main(String[] args) {
//		基本数据类型 -> string
		float A = 1.1F;
		double A1 = 1;
		int A2 = 1;
		boolean A3 = true;
		String A4 = A + "";
		String A5 = A1 + "";
		String A6 = A2 + "";
		String A7 = A3 + "";
		System.out.println(A4 + " " + A5 + " " + A6 + " " +A7);
		
//		String -> 基本数据类型
		String B = "130";
		int B1 = Integer.parseInt(B);
//		byte B2 = Byte.parseByte(B);
		short B3 = Short.parseShort(B);
		long B4 = Long.parseLong(B);
		float B5 = Float.parseFloat(B);
		double B6 = Double.parseDouble(B);
		boolean B7 = Boolean.parseBoolean("true");
		System.out.println("========================");
		System.out.println(B1);
//		System.out.println(B2);
		System.out.println(B3);
		System.out.println(B4);
		System.out.println(B5);
		System.out.println(B6);
		System.out.println(B7);
		System.out.println(B.charAt(2));
		
		
	}
}