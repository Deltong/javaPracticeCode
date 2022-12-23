import java.util.Scanner;
public class If{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		byte age = myScanner.nextByte();
		if(age > 18) {
			System.out.println("if语句");
		}
		System.out.println("继续执行");
	}
}