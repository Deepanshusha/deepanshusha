import java.util.*;
public class RotateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		System.out.println("Enter R : ");
		int r = sc.nextInt();
		int no = n;
		int size = 0;
		while(n>0) {
			size++;
			n/=10;
		}
		r = r%size;
		int rot = r;
		int rpo = 1;
		while(r>0) {
			rpo*=10;
			r--;
		}
		int rs = size-rot;
		int npo=1;
		while(rs>0) {
			npo*=10;
			rs--;
		}
		System.out.println(no%rpo*npo+no/rpo);	
	}	
	}