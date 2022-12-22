//接收用户输入
import java.util.Scanner;
public class Input{
	public static void main(String[] args) {
		//new 创建一个对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		//接收用户输入
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double salary = myScanner.nextDouble();
		System.out.println("姓名\t年龄\t薪水" + "\n" + name + "\t" + age + "\t" + salary);
	}
}