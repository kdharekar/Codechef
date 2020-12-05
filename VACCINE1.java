import java.util.Scanner;

public class VACCINE1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1  = sc.nextInt();
		int v1  = sc.nextInt();
		int d2  = sc.nextInt();
		int v2 = sc.nextInt();
		int v = sc.nextInt();
		int ctr = d1;
		if(d1<d2) { 
			ctr  = d1;
		}
		else {
			ctr = d2;
		}
		int vac = 0;
		while(vac<v) {
			if(ctr>=d1 && ctr >= d2) {
				vac = vac + v1 + v2;
			}
			else if(ctr>=d1) {
				vac = vac + v1;
			}
			else {
				vac = vac + v2;
			}
			ctr++;
		}
		System.out.println(ctr-1);
	}

}
