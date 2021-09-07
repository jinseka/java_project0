package com.mega.mvc07.test;
//싱글톤 방식으로 만든다 .
public class SingleObject2 {
		static int count;
		static SingleObject2 object; //null
		//누적시킬 변수는 스테틱으로 만들어라
	  private  SingleObject2() {
		System.out.println("SingleObject 객체 생성됨");
		count++;
	}
	  //싱글톤은 객체를 하나만 만들고, 더 이상 만들지 않는 방법을 의미한다.
	  //getInstance라는 static 매서드를 만들어 객체가 이미 만들어 졌는지 체크를 하게된다.
	  
	  public static SingleObject2 getInstance() {
		  
		  if (object == null) {
			//Object 이 null이라는 것이 앚딕 객체가 하나도 안만들어졌다라는 의미 
			  //객체가 만들어지면 주소가 들어가야 하는데 null이 들어가 있기 떄문ㅇ
			  object = new SingleObject2();
		}else {
			//object이 null이 아니라면 , 객체가 만들어져서 주소가 들어갔다는 의미 
			
		}
		  return object;
	}
	  
	  
	  
	  
}
