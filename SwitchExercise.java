import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("char型小写转为大写");
		System.out.println("输入小写类型(a-e)");
		char conversion = myScanner.next().charAt(0);
		switch(conversion) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
		default:
			System.out.println("other");
		}
		
		System.out.println("考试成绩是否合格");
		System.out.println("输入考试成绩");
		double score = myScanner.nextDouble();
		if(score <= 100 && score >= 0) {
			switch((int)(score / 60)) {
			case 0:
				System.out.println("成绩不及格");
				break;
			case 1:
				System.out.println("成绩合格");
				break;
			}
		}else {
			System.out.println("输入成绩0-100");
		}
		
		System.out.println("月份所属季节");
		System.out.println("请输入月份");
		byte month = myScanner.nextByte();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("该月份是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("该月份是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("该月份是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("该月份是冬季");
			break;
		default:
			System.out.println("输入月份有误～ 请输入1-12!!!");
		}
		
	}
}