import java.util.Scanner;

public class IfElseIf{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Deltong的芝麻信用分");
		System.out.println("请输入信用分");
		double creditScore = myScanner.nextDouble();
		if(creditScore >= 1 && creditScore <= 100) {
			if(creditScore >= 100) {
				System.out.println("信用极好");
			}else if(creditScore <= 99 && creditScore > 80 ) {
				System.out.println("信用良好");
			}else if(creditScore <= 80 && creditScore >= 60) {
				System.out.println("信用一般");
			}else {
				System.out.println("无信用");
			}
		}else {
			System.out.println("信用分需在1-100,请重新输入信用分");
		}
	}
}