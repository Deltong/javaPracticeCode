public class LogicalOperator02{
	public static void main(String[] args) {
		// ||短路或 |逻辑或
		int Aage = 20;
		int Bage = 35;
		if(Aage > 10 || --Bage < 40) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("Aage=" + Aage + "\t" + "Bage=" + Bage);
	}
}