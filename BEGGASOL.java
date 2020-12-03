import java.util.Scanner;

public class BEGGASOL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int k=0;k<T;k++) {
			int N = sc.nextInt();
			sc.nextLine();
			boolean reached = false;
			int fuel = sc.nextInt();
			int distance =0;
			for(int i=0;i<N-1;i++) {
				if(fuel<=0) {
					break;
				}
				else {
					fuel = fuel + sc.nextInt()-1;
					distance++;
				}
			}
			if(fuel>0) {
				distance = distance + fuel;
			}
			System.out.println(distance);
			sc.nextLine();
		}
	}

}
