public class ContinueExercise{
	public static void main(String[] args) {
		A:
		for(int i = 0;i < 4; i++) {
			System.out.println("第" + (i + 1) + "次");
		A1:
			for(int j = 0 ;j < 10; j++) {
				if(j == 2) {
					continue; 
				}
				System.out.println("j = " + j);
			}
		}	
		System.out.println("退出循环");
	}
}