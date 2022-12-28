public class BreakExercise{
	public static void main(String[] args) {
		A:
		for(int i = 0;i < 4; i++) {
		A1:
			for(int j = 0 ;j < 10; j++) {
				if(j == 2) {
					break A ;
				}
				System.out.println("j = " + j);
			}
		}	
		System.out.println("退出循环");
	}
}