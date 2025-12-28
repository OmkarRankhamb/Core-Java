package Advanced;

public class Second {

	public static void main(String[] args) {
	int age=23;
		
		try
		{
		if(age<30)
		{
			throw new wrongAgeException("Wellcome");
		}
		}
		catch(wrongAgeException ex)
		{
			
			System.out.println(ex.getMessage());
		}
		
	}

}

class wrongAgeException extends Exception
{
	
	public wrongAgeException(String str)
	{
		super(str);
		
	}





	}


