import java.util.Scanner;

public class DoWhileExercise{
	public static void main(String[] args) {
		int A = 1;
		int sum = 0;
		do {
			System.out.println(A);
			sum += A;
			A++;
		}while(A <= 100);
		System.out.println(sum);
		System.out.println("1结束");
		System.out.println("==============================");
		int B = 1;
		int count = 0;
		do {
			if(B % 5 == 0 && B % 3 != 0) {
				System.out.println(B);
				count++;
			}
			B++;
		}while(B <= 200);
		System.out.println(count);
		System.out.println("2结束");
		System.out.println("==============================");
		System.out.println("还不还钱");
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("五连鞭");
			System.out.println("还钱吗");
			answer = myScanner.next().charAt(0);
		}while(answer != 'y');
		System.out.println("3结束");
	}
}