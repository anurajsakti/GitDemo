package org.tcs;

public class Employee {
	public Employee() {
		this(33243);
		System.out.println("Default Constructor");
			}
	public Employee(int id) {
		this(74784784874l,"chennai");
		System.out.println("Int para constructor");
	}
	public Employee(String name) {
		
		System.out.println("String para constructor");
	}
	public Employee(long phno,String name ) {
		this("Bala");
		System.out.println("long para constructor");
		System.out.println("it is good to see you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee();
	}

}
