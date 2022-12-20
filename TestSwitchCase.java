public class TestSwitchCase{
	public static void main(String[] args) {
		char grade = 'D';
		
		switch(grade) {
		case 'A':
			System.out.println("A+");
			break;
		case 'B':
			System.out.println("A");
			break;
		case 'C':
			System.out.println("B+");
			break;
		case 'D':
//			break;
		default:
			System.out.println("位置等级");
		}
		System.out.println("等级是：" + grade);
//		int A = 1;
//		switch(A) {
//		case 0:
//			System.out.println("0");
//		case 1:
//			System.out.println("1");
//			
//		case 2:
//			System.out.println("2");
//			break;
//		default:
//			System.out.println("default");
//		}
	}
}