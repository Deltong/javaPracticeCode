import java.util.Scanner;

public class IfExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("求和");
		System.out.println("输入第一个double值");
		double A = myScanner.nextDouble();
		System.out.println("输入第二个double值");
		double B = myScanner.nextDouble();
		double AB = A + B;
		if(A > 10.0) {
			if(B < 20.0) {
				System.out.println("A + B =" + AB);
			}
		}else {
			System.out.println("else语句");
		}
		
		System.out.println("\n");
		System.out.println("求和可不可以被3和5整除");
		System.out.println("输入第一个int值");
		int C = myScanner.nextInt();
		System.out.println("输入第二个int值");
		int D = myScanner.nextInt();
		int E = C + D;
		if(E % 3 == 0 && E % 5 == 0) {
			System.out.println(E + "可以被3和5整除");
		}else {
			System.out.println(E + "不可以被3和5整除");
		}
		
		System.out.println("\n");
		System.out.println("求是不是闰年");
		System.out.println("输入年份");
		int year = myScanner.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "是闰年");
		}else {
			System.out.println(year + "非闰年");
		}
	}
}