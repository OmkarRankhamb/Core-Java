package Encapsulation;

public class First {

	public static void main(String[] args) {
        Student std = new Student();
        std.setname("Om");
        std.setRollNo(101);
        
        System.out.println(std.getname());
        System.out.println(std.getRollNo());
        
	}

}
class Student{
	 private int RollNo;
	private String name;
	
	public  int getRollNo() {
		return RollNo;
}
	public void setRollNo(int RollNo) {
		this.RollNo=RollNo;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
}
