import java.util.Scanner;
public class Switch01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入字符");
		char week = myScanner.next().charAt(0);
		switch(week) {
		case 'a':
			System.out.println("星期一");
			break;
		case 'b':
			System.out.println("星期二");
			break;
		default:
			System.out.println("错误");

		}
	}
}