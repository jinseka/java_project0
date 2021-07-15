package pack02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scaenner 를 만들어낸다.
		System.out.println("---------------------------------");
		System.out.println("건강 검진을 위해 학원의 정보를 입력해주세요");
		System.out.println("---------------------------------");

		System.out.println("당신의 소속은 >>"); // 소속을 질문을 프린트한다.
		String me = sc.next(); // 13번에서 입력받은답을 me 변수에 저장한다.
		System.out.println("당신의 소속은 " + me + " 이시군요!"); // me에 입력받은답을 대입하여 프린트한다.

		System.out.println("당신의 나이는 >>"); // "당신의 나이는 >> " 을 프린트한다.
		int age = sc.nextInt() - 1; // 13번째 줄에서 int로 답을 입력받고 작년나이 계산을하기위해 -1을 한다.
		System.out.println("당신의 작년나이는 " + age + " 이시군요!"); // 18번째 줄에서 입력받은 답으로 프린트한다.

		System.out.println("당신의 몸무게는 >>"); // "당신의 몸무게는 >>" 프린트한다.
		Double kg = sc.nextDouble(); // 우의질문에서 bouble로 입력받고 kg 변수에 저장한다.
		if (kg >= 90) { // if문을 활용하여 kg >= 90 조건을 걸어 해당하면 "과체중"을 프린트한다.
			System.out.println("당신은 과체중이시군요!");

		} else if (kg >= 70) { // 만약 kg >= 90 조건에 해당하지 않을경우 kg >= 70으로 넘어와 값을 비교하고
								// 조건에 해당 될 경우 "보통을"을 프린트한다.
			System.out.println("당신은 보통이시군요!");

		} else { // 만약 위의 조건들에 해당되지 않을경우 "미달"을 프린트 한다.
			System.out.println("당신은 미달이시군요!");

		}
		System.out.println("당신은 결혼하셨나요>>"); // "당신은 결혼하셨나요>>" 하여 값을 입력받는다.
		Boolean ys = sc.nextBoolean(); // 논리연산자를 사용하여 true or false를 입력받고
		if (ys == true) { // if문 을 사용하여 ys로 받은 답이 true이면 "당신은 배우자가 있겠군요"
							// false면 "당신은 배우자가 없겠군요" 을 프린트 한다.
			System.out.println("당신은 배우자가 있겠군요!");

		}
		if (ys == false) {
			System.out.println("당신은 배우자가 없겠군요!");

		}
		sc.close(); // sc 사용을 종료한다.
		System.out.println("---------------------------------");
		System.out.println("입력을 마무리합니다.");
	}// class

}// main
