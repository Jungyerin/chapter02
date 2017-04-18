package person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p2=new Student("CS");
		Person p3=new Student("name","CS");	
		
		Student s=new Student();
		
		//upcasting 암시적으로 가능 
		Person p=s;
		p.setName("둘리");
	
		//downcasting 명시적으로 해주어야 함.
		Student s2=(Student)p;
		s.setMajor("CS");
		
		((Student)p).setMajor("P");

	}

}
