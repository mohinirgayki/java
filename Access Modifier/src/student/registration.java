package student;

public class registration {
	public String msg = "Try to access a public variable outside the package";
     String info;
     public void display()
     {
    	 System.out.println("Try to access a public method outside the package");
    	 System.out.println(info);
     }
	public static void main(String[] args)
	{
		registration Registration = new registration();
		System.out.println("Registration");
		
		

	}

}
