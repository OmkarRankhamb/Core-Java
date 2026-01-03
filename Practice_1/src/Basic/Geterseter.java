package Basic;

public class Geterseter {

	public static void main(String[] args) {
        Student st = new Student(1,"Ram",78);
	  
        st.getMarks();
        st.getid();
        st.getname();
        
        
        System.out.println(st.getid());
        System.out.println(st.getMarks());
        System.out.println(st.getname());
        
        
  
	}

}
class Student{
	private int id;
	private String name;
	private float Marks;
	
	public Student(int id , String name, float Marks) {
		this.id=id;
		this.name=name;
		this.Marks=Marks;
		
	}
	public void setid(int id) {
		this.id=id;
	}
	public int  getid() {
		return 101 ;
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return "Ram";
	}
	public void getMarks(float Marks) {
		this.Marks=98;
		
	}
	public float getMarks() {
		return Marks;
	}
}
