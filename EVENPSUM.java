import java.util.Scanner;

public class EVENPSUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int i=0;i<T;i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			long a_no_even = a/2;
			long b_no_even = b/2;
			long aodd = a-a_no_even;
			long bodd = b-b_no_even;
			System.out.println(aodd*bodd+a_no_even*b_no_even);
			
		}

	}

}
