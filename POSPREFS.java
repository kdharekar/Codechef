import java.util.Scanner;

public class POSPREFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int negs = n-k;
			int printed = 0;
			String str = "";
			for(int j=1;j<=n;j++) {
				if(n/2<=k) {
				if(j%2!=0 && printed<n-k) {
					str = str + -j +" ";
					printed++;
				}
				else {
					str = str + j +" ";
				}
				}
				else {
					if(j%2==0 && printed<k) {
						str = str + j +" ";
						printed++;
					}
					else {
						str = str + -j +" ";
					}
				}
				
			}
			System.out.println(str);
		}

	}

}
