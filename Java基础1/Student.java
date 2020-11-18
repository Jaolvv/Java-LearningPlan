public class Student{
	int age;
	double height;
	String name;

	void say(){
		System.out.println("大家好，我叫"+name+"，我今年"+age+"岁，我的身高是："+height+"M.");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 19;
		s1.height = 1.78;
		s1.name = "小明";
		s1.say();
	}
}