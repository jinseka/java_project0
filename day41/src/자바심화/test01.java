package 자바심화;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
		HashMap<String , Integer> list = new HashMap<String, Integer>();
		list.put("김아무개", 22);
		list.put("박아무개", 11);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("------------");
			System.out.println("1. 전체 리스트 출력 ");
			System.out.println("2. 명단 추가 ");
			System.out.println("3. 명단 삭제 ");
			System.out.println("4. 참석자 평균 나이 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템 종료합니다.");
				break;
			}else if (choice == 1) { //1. 전체 리스트 출력
				 for(Entry<String, Integer> elem : list.entrySet()){
		                System.out.println("이름 : " + elem.getKey() + "  나이 : " + elem.getValue());
				 }
			}else if (choice == 2) { //2. 명단 추가
				System.out.print("추가할 파티인원 이름 입력 >> ");
				String name = sc.next();
				System.out.print("추가할 파티인원 나이 입력 >> ");
				int num = sc.nextInt();
				int size1 = list.size(); //넣기 전에 크기 
				list.put(name,num);
				int size2 = list.size(); //넣은 후에 크기 
				if(size2 > size1) 
					System.out.println("파티인원이 추가되었습니다.");
			}else if (choice == 3) { //3. 명단 삭제
				System.out.println(list);
				System.out.print("삭제할 이름을 쓰시오.>> ");
				String key =sc.next();
				list.remove(key);
				if(!list.containsKey(key)){
					System.out.println("삭제가 완료되었습니다. ");
				}
			}else if (choice ==4 ) { //참석자 평균 나이 
				Collection<Integer> values =list.values();
				System.out.println("참석자의 나이는"+ values);
				System.out.println("참석자 인원은 " + values.size());
				int sum = 0;
				for(int v: values) {
					sum += v;
				}
				System.out.println("참석자 나이의 합은 " + sum);
				System.out.println("참석자 나이의 평균은" +(sum/values.size())+" 입니다.");
			}
		}

	}//class
} //main