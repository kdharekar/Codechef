

import java.util.Scanner;

public class IPCCERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for(int j=0;j<N;j++) {
		String[] val = (sc.nextLine()).split(" ");
		if(Integer.parseInt(val[K])<=10) {
			int sum =0;
			int counter = 0;
			while(counter < K && sum < M) {
				sum = sum + Integer.parseInt(val[counter]);
				counter++;
				
						
			}
			if(sum>=M) {
				count++;
			}
		}
		
		
	}
		System.out.println(count);
	}
}
