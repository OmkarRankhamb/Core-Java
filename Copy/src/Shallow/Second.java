package Shallow;

public class Second {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Demoo demo = new Demoo();
		Athur au = new Athur("O.P.Patil");
	//	au.athur_name="O.R.Rankhmab";
		
		demo.id=1;
		demo.name="MATCH";
		
		demo.athur=au;                 
	
		Demoo d =(Demoo)demo.clone();
		
		d.name="Eco";
	//	d.athur=au;
		System.out.println("id::"+demo.id+" "+"name::"+demo.name+" athur_name::"+demo.athur.athur_name);
		System.out.println("id::"+d.id+" "+" name::"+d.name+" athur_name::"+d.athur.athur_name);
			
	}

}
class Demoo implements Cloneable{
	Athur athur;
	String name;
	int id;

	
	public Object clone() throws CloneNotSupportedException {
		Demoo d =(Demoo)super.clone();
		d.athur=new Athur(this.athur.athur_name);
		return d;
				
	}
}
class Athur{
	String athur_name;
	public Athur(String athur_name) {
		this.athur_name=athur_name;
	}
}