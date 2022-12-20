public class Test{
	public static void main(String[] args) {
		int A;
		A = 1;
		int B = 2;
		System.out.println(B);
		B = 3;
		System.out.println(A);
		System.out.println(B);
		
		byte age = 20;
		double score = 99.99;
		char gender = '男';
		String name = "Gali";
		System.out.println("信息如下\nname:" + name );
		System.out.println("score:" + score);
		System.out.println("gender:" + gender);
		System.out.println("age:" + age);
		
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + 98 + "hello");
		System.out.println("hello" + 100 + 98);
		System.out.println('a' + 1);
	}
}