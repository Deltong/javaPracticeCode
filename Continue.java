public class Continue{
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			i ++ ;
			if(i == 2) {
				break;
			}
			System.out.println("i = " + i);
		}
	}
}