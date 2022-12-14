//String 文字列
public class Puppy{
	int puppyAge;
	public Puppy(String name) {
		System.out.println("puppyName:" + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("puppyAge:" + puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy myPuppy = new Puppy("Gali");
		myPuppy.setAge(7);
		myPuppy.getAge();
		System.out.println("变量值" + myPuppy.puppyAge);
	}
}


