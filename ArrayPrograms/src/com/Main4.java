package com;

public class Main4 {

	public static void main(String[] args) {
		Employee emp0 = new Employee(123,"Deepak",123.0);
		Employee emp4 = new Employee(123,"Deepak",123.0);
		Employee emp5= new Employee(123,"Deepak",123.0);
		Employee[] Emp1 =new Employee[3];
		Emp1[0]=emp0;
		Emp1[1]=emp4;
		
		Emp1[2]=emp5;
		for(int i=0;i<Emp1.length;i++) {
			System.out.println(emp0.id+ " "+emp0.name+ " "+emp0.sal);
		}
		
		
	}

}
