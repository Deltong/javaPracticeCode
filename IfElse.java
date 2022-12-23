import java.util.Scanner;
public class IfElse{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("门禁身份识别");
		System.out.println("请输入年龄");
		byte age = myScanner.nextByte();
		if(age > 18) {
			System.out.println("请输入ID");
			int ID = myScanner.nextInt();
			if(ID == 20010918) {
				System.out.println("尊贵的VIP请");
			}else {
				System.out.println("非VIP禁止进入");
			}
			
		}else {
			System.out.println("未成年禁止进入");
		}
	}
}