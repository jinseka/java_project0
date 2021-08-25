package com.mega.mvc06;

public class ArrayError {

	public static void main(String[] args){
		int [] num = {1,2,3}; //length 가 0 1 2 밖에없음 3에 4를 넣을수 없음
		try {
			num [3] =4;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 에러 ! ! !");
		} catch (Exception e) 	{
			System.out.println("다른에러 발생 ");
		}finally {
			System.out.println("배열에 문제가 사라지게 해결했어요");
		}
		System.out.println("아 배열 끝 ~ ~ ~ ");
		//1. 배열의 IndexOutOfBoundsException 이면 "인덱스 에러  ! ! "
		//2. 다른 에러이면 " 다른 에러 발생  ! ! !" 이라고 출력
		//3. 에러가 발생하던 안하던 상관없이 .. "배열에 문제가 사라지게 해결했어요" 를 프린트 !  출력
		
	}

}
