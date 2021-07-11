package 클래스사용;

import 클래스생성.TV;
import 클래스생성.팩스;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new 를 하면 , 멤버변수들이 heap영역에 복사가된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 복사된다. 
		myTv.ch =7;
		//myTv안에 들어있는 주소가 가르키는 ch 변수에 7을 넣으라는 의미

		System.out.println(myTv);
		
		myTv.vol =9;
		myTv.onoff =true;
		myTv.tv끄다();
		System.out.println("myTv의 채널은 "+ myTv.ch);
		System.out.println("myTv의 볼륨은 "+ myTv.vol);
		System.out.println("myTv의 전원은 "+ myTv.onoff);
		
		TV yourTv = new TV();
		yourTv.ch =9;
		yourTv.vol =12;
		yourTv.onoff =true;
		yourTv.tv끄다();
		System.out.println("youTv의 채널은 "+ yourTv.ch);
		System.out.println("youTv의 볼륨은 "+ yourTv.vol);
		System.out.println("youTv의 전원은 "+ yourTv.onoff);
		
		System.out.println(yourTv);
		//투스트링이라는 오브젝트에 매서드 가있어서 주소명을 만들어준다.
		
	System.out.println("____________________________________________");
		
		  팩스 fax = new 팩스();
		  fax.send();
		  fax.copy();
		  fax.num=8;
		  fax.onoff=false;
		  fax.print=2;
		  fax.vol=10;
		  
		  System.out.println("팩스채널은 "+fax.num+" 입니다.");
		  System.out.println("팩스기계 전원을 "+fax.onoff+" 하시오");
		  System.out.println("팩스에서 복사할 개수는 "+fax.print+" 입니다.");
		  System.out.println("팩스의 소리를 "+fax.vol+" 만큼 올려라");
		  
		 
		  
		  
		  
		  
		  
		  
	
		
	}

}
