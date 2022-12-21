public class LogicalOperator{
	public static void main(String[] args) {
		//短路与&&
		int Aage = 20;
		int Bage = 35;
		if(Aage > 20 && ++Bage < 40) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("Aage=" + Aage + "\t" + "Bage=" + Bage);
		
		//逻辑与&
		int Cage = 20;
		int Dage = 35;
		if(Cage > 20 & ++Dage < 40) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("Cage=" + Cage + "\t" + "Dage=" + Dage);
	}
}