import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("我是歌手");
		System.out.println("请输入成绩");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("恭喜进入决赛");
			System.out.println("请输入性别");
			char gender = myScanner.next().charAt(0);
			if(gender == '男') {
				System.out.println("进入男子组决赛");
			}else if(gender == '女') {
				System.out.println("进入女子组决赛");
			}else {
				System.out.println("性别请输入男or女");
			}
		}else {
			System.out.println("淘汰");
		}
	}
}