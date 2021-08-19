package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

public class 친구추가문제3 {

   public static void main(String[] args) {

      // 친구목록 들어갈 리스트.
      HashMap<String, String> list = new HashMap<>();
      list.put("홍길동", "011-1234-5678"); // 맵에다 추가할 땐 put
      list.put("김길동", "010-2222-2222");
      Scanner sc = new Scanner(System.in);
      while (true) {
         try {
            System.out.println("------Main------");
            System.out.println("1.친구 목록 보기");
            System.out.println("2.친구 추가");
            System.out.println("3.친구 삭제");
            System.out.println("4.이름 변경");
            System.out.println("9.종료");
            System.out.print("메뉴를 선택하시오:");
            int size = list.size();
            int choice = sc.nextInt();
            if (choice == 9) {
               break;
               
            } else if (choice == 1) { // 친구 리스트 출력
               System.out.println("=====나의 친구 목록=====");
               System.out.println(list);

            } else if (choice == 2) { // 친구 추가
               System.out.print("추가할 친구의 key값을 입력 하시오:");
               String key = sc.next();
               System.out.print("추가할 친구의 value값을 입력 하시오:");
               String value = sc.next();
               list.put(key, value);
               int size2 = list.size();
               if (size < size2) {
                  System.out.println("친구 추가 완료!");
               } else {
                  System.out.println("친구 추가 실패!");
               }
               
            } else if (choice == 3) { // 친구 삭제1
               System.out.println("친구 목록 ");
               System.out.println(list);
               System.out.print("삭제할 친구의 key값을 입력하시오:");
               list.remove(sc.next());
               int size3 = list.size();
               if (size > size3) {
                  System.out.println("친삭 완료!");
               } else {
                  System.out.println("친삭 실패!");
               }
            } else if (choice == 4) { // 이름 변경
               System.out.println("친구 목록 ");
               System.out.println(list);
               System.out.print("변경할 친구의 키값을 입력하시오:");
               String key2 = sc.next();
               System.out.print("변경할 친구의 벨류값을 입력하시오:");
               String value2 = sc.next();
               System.out.print("뭐라고 변경하시겠습니까?");
               String changevalue2 = sc.next();
               list.replace(key2, value2, changevalue2);
               System.out.println("변경 완료되었습니다.");
            } else { // 1~4, 9도 아닌 경우
               System.out.println("해당 숫자가 없습니다. 다시 입력하세요.");
            }

            System.out.println("");
         } catch (Exception e) {

            System.out.println("잘 못 누르셨습니다.");
            break;
         }

      } // while
      System.out.println("프로그램을 종료합니다.");
      System.exit(0);
      sc.close();
   }// main

}// class