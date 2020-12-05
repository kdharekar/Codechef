import java.util.Scanner;

public class VACCINE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int[] arr = new int[80];
			int midage = 0;
			int highage = 0;
			int lowage = 0;
			for(int j=0;j<n;j++) {
				int a = sc.nextInt();
				if(a>=80) {
					arr[79] = arr[79]+1;
					highage++;
				}
				else {
					arr[a-1] = arr[a-1]+1;
					if(a<=9) {
						lowage++;
					}
					else {
						midage++;
					}
				}
			}
			//boolean bool = false;
			//int avg_days = n/d+1;
			//if(avg_days<=365) {
				int days = midage/d + (lowage+highage)/d;
				if(midage%d!=0) {
					days++;
				}
				if((lowage+highage)%d!=0) {
					days++;
				}
				//bool = true;
				System.out.println(days);
			//}
			
			
		}

	}

}
