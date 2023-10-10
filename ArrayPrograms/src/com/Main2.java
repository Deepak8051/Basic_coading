package com;

public class Main2 {
	public static void main(String[] args) {
	Student s1=new Student(21,"Deepak");
	Student s2=new Student(22,"Rajan");
	Student s3=new Student(23,"Shahoo");
		Student[] stu =new Student[3];
		stu[0]=s1;
		stu[1]=s2;
		stu[2]=s3;
		for(int i=0;i<stu.length;i++) {
			System.out.println("age:"+s1.age + " "+s1.Name);
			System.out.println(s2.age + " " +s2.Name);
			System.out.println(s3.age + " " +s3.Name);
			
		}


	}

}
