package student;

 class Employee {
	// using class from different package with
	// default modifier
	 
	// This class is having default access modifier
	    public static void main(String args[])
	    {
	        // Accessing class Geek from package p1
	        Employee employee = new Employee();
	        System.out.println(employee);
	    }
	}