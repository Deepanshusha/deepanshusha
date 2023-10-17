import java.util.Scanner;

public class Greaterele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int great = ( a > ( b > c ? b : c ) ? a : ( b > c ? b : c ) ) ;
        System.out.println("greater number is: "+ great);

	}

}