package 이차원배열;

public class 열이다른 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.배열 처음에 만들 때 값을 이미 알고있는경우
		int[][] n1= {
				{1, 2, 3},
				{1 ,2 ,3 ,4},
				{1 ,2 ,3 ,4 ,5}
		};
		
		
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j]+" ");
			}
			System.out.println(" ");
		}

	//2.배열 처음에 만들 때 값을 모르고 있는경우
//		2-1 1차원 배열을 만들어라
//		2-2 1차원 배열을 2차원배열의 각 행에 끼워넣어라
		
		int [][] n2 = new int [3][];
		int [] n =new int [10];
		int [] nn =new int [15];
		int [] nnn =new int [12];
		
		n2[0] =n;
		n2[1] =nn;
		n2[2] =nnn;
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j]+" ");
				
			}
	System.out.println();
		}
		
		
 	
	
	
	
	
	
	
	
	
	
	
	}

}
