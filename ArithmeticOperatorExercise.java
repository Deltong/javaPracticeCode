public class ArithmeticOperatorExercise{
	public static void main(String[] args) {
		//华氏度对应摄氏度
		double huaShi = 345.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println(huaShi + "华氏度等于" + sheShi + "摄氏度");
		
		//XX天合XX星期零XX天
		int Days = 123;
		int Week = Days / 7;
		int RemainingDays = Days % 7;
		System.out.println(Days + "天合" + Week + "星期零" + RemainingDays + "天");
	}
}