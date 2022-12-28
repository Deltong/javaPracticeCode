public class Return{
	public static void main(String[] args) {
		for(int i = 1;i <= 5; i++) {
			if(i == 3) {
				System.out.println("i = 3成例" + i);
				//return;
				//break;
				continue;
			}
			System.out.println("抛嘞");
		} 
		System.out.println("程序继续");
	}
}
