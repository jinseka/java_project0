package com.mega.mvc08.generic;

import java.util.HashMap;

import com.mega.mvc08.MemberDTO;

public class Generic2 {
	//new를 할때 타입을정해준다.
	//제너릭을 지원해준다. 캐스팅을 하지 않아도 된다.
	//<>가 등장하면 내가 타입을 정할수 있다고 생각하면된다.
	//1.8부터 새로 등장했다.
	
		public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("한국", 100);
		map.put("미국", 100);
		System.out.println(map);
		
		HashMap<Integer, MemberDTO> map2 = new HashMap<>();
		
		map2.put(1, new MemberDTO());
		map2.put(2, new MemberDTO());
		System.out.println(map2);
		
	
	
	}//main

}//class
