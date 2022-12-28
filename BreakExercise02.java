import java.util.Scanner;

public class BreakExercise02{
	public static void main(String[] args) {
		//3次登陆机会
		Scanner myScanner = new Scanner(System.in);
		int chance = 3;
		for(int i = 1 ;i <= 3 ;i++) {
			System.out.println("输入账号");
			String user = myScanner.next();
			System.out.println("输入密码");
			String passWord = myScanner.next();
			if("张三".equals(user) && "123".equals(passWord)) {
				System.out.println("登陆成功");
				break;
			}
			if(chance - i == 0) {
				System.out.println("没有机会了！！！登陆失败");
				break;
			}
			System.out.println("错误！！！还有" + (chance - i) + "次机会");
		}
	}
}