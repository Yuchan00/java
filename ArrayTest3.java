package arraytest;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] scores = null; //int scores[];
		int[] scores = {80,60,98,55,74};
		
		int sum = 0; //����
		for(int i = 0; i<5; i++) {
			sum += scores[i];
		}
		System.out.println("����:" + sum);
		double avg = (double)sum/5;
		System.out.println("���:" + avg);
		
		

	}

}
