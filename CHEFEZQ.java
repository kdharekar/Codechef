import java.util.Scanner;

public class CHEFEZQ{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			sc.nextLine();
			String[] arr = sc.nextLine().split(" ");
			long val_rem =0;
			boolean found = false;
			int j =1;
			while(j<=N) {
				val_rem = val_rem + Long.parseLong(arr[j-1]);
				
				if(val_rem<K) {
					found = true;
					System.out.println(j);
					break;
				}
				else {
					val_rem = val_rem-K;
				}
				j++;
			}
			if(found==false) {
				long val =  (val_rem/K);
				found = true;
				System.out.println(N+val+1);
				//break;
			}
		}

	}

}
