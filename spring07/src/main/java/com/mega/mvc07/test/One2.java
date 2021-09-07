package com.mega.mvc07.test;
//프로토타입용 클래스로 정의해주세요 
public class One2 {
	static One2 object;
   private  One2() {
		System.out.println("싱글톤용 클래스로 정의 ");
   }
		
		 public static One2 getInstance() {
			  
			  if (object == null) {
				//Object 이 null이라는 것이 앚딕 객체가 하나도 안만들어졌다라는 의미 
				  //객체가 만들어지면 주소가 들어가야 하는데 null이 들어가 있기 떄문ㅇ
				  object = new One2();
			}else {
				//object이 null이 아니라면 , 객체가 만들어져서 주소가 들어갔다는 의미 
				
			}
			  return object;
	}

   
}
