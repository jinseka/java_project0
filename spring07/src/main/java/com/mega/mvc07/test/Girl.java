package com.mega.mvc07.test;

public class Girl {
	static int count;
	static int sum;
	
	 String name;
	 int age;
	
	public Girl (String name, int age) {
		this.name =name;
		this.age =age;
		count ++;
		sum+=age;
		
		
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
		//주소가 아니라 값이 출력될수 있게 tostring을 했다
	}
}
