package 그래픽문제;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int [][] arrList =new int[3][];
		//열의 개수가 다르기때문에 비워둔다
		arrList[0] =arr1;
		arrList[1] =arr2;
		arrList[2] =arr3;
		//			0	1	2	3	4
		//0			0	0	0
		//1			0	0	0	0	0
		//2			0	0	0	0
		
		arrList[1][1] =1;
		arrList[1][2] =1;
		arrList[2][3] =1;
		System.out.println(arrList.length);
		System.out.println(arrList[0].length);
		System.out.println(arrList[1].length);
		System.out.println(arrList[2].length);
		//2차원은 2중 for 문 으로 돌려야한다.
		
		
	}

}
