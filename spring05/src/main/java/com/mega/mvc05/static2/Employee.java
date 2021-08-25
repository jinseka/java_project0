package com.mega.mvc05.static2;

public class Employee {

		String name;
		String gen;
		int age;
		static int count;
		static int sum;
		public Employee(String name, String gen, int age) {
			super();
			this.name = name;
			this.gen = gen;
			this.age = age;
		count++;
		sum+= age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", gen=" + gen + ", age=" + age + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		 
		 
		
	}

