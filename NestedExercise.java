import java.util.Scanner;
public class NestedExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("出票系统");
		System.out.println("请输入月份");
		byte month = myScanner.nextByte();
		if(month >= 1 && month <= 12) {
			if(month >= 4 && month <= 10) {
				System.out.println("请输入年龄");
				byte age = myScanner.nextByte();
				if(age >= 18 && age <= 60) {
					System.out.println("成人票\t票价为60");
				}else if(age < 18 && age > 0) {
					System.out.println("儿童票\t票价为" + (60 / 2));
				}else if(age > 60 && age <= 80) {
					System.out.println("老人票\t票价为" + (60 / 3));
				}else {
					System.out.println("年龄不符合规定~禁止进入!!!");
				}
			}else {
				System.out.println("请输入年龄");
				byte age = myScanner.nextByte();
				if(age >= 18 && age <= 80) {
					System.out.println("成人票\t票价为40");
				}else if(age < 18 && age > 0) {
					System.out.println("儿童票\t票价为20");
				}else {
					System.out.println("年龄不符合规定~禁止进入!!!");
				}
			}
		}else {
			System.out.println("输入月份有误～ 请输入1-12!!!");
		}
	}
}