public class ChapterExercise{
	public static void main(String[] args) {
		char A = '\n';
		char A1 = '\t';
		char A2 = '\r';
		char A3 = '\\';
		char A4 = '1';
		char A5 = '2';
		System.out.println(A);
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(A4);
		System.out.println(A5);
		
		String B = "三体";
		String B1 = "三国";
		System.out.println(B + A1 + B1);
		char B2 = '男';
		char B3 = '女';
		System.out.println(B2 + B3);
		double B4 = 331.56;
		double B5 = 282.11;
		System.out.println(B4 + B5);
		
		String name = "Gali";
		byte age = 21;
		float score = 99.99F;
		char gender = '男';
		String hobby = "Football";
		System.out.println("姓名"+A1+"年龄"+A1+"成绩"+A1+"性别"+A1+"爱好"+A+name
				+A1+age+A1+score+A1+gender+A1+hobby);
	}
}