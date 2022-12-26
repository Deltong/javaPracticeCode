//统计j个班级成绩情况 每个班有i名同学 计算各个班的平均分和所有班级的平均分
//统计j个班的及格人数
import java.util.Scanner;
public class MultipleCirculationExercise{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double sum = 0;
		double totalScore = 0;
		int passNum = 0;
		int classNum = 3;
		int stuNum = 5;
		for(int j = 1; j <= classNum; j++) {
			for(int i = 1; i <= stuNum; i++) {
				System.out.println("请输入第" + j + "个班的第" + i + "个同学的成绩") ;
				double score = myScanner.nextDouble();
				sum += score;
				if(score >= 60) {
					passNum++;
				}
				System.out.println("成绩=" + score);
			}
			System.out.println("第" + j + "班的总分=" + sum + "平均分=" + sum / stuNum);
			totalScore += sum;
		}
		System.out.println("=====================================================");
		System.out.println("总成绩=" + totalScore + "平均分=" + totalScore / (classNum * stuNum)
				+ "及格人数=" + passNum);
	}
}