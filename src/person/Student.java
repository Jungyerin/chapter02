package person;

public class Student extends Person {

	private String major;
	
	public Student(){
		System.out.println("Student() called");
	}
	
	public Student(String major){
		this.major=major;
		System.out.println("Student(major) called");
	}
	
	public Student(String name,String major)
	{
		super(name); //맨 앞에 있어야 한다. 부모의 name이라는 파라미터는 받는 생성자 
		this.major=major;  //자신의 것을 부를때는 앞에서 불러준다.
		//setName(name);	
		System.out.println("Student(supername,major) called");
	}
	
	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}




}
