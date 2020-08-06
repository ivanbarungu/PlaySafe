 package practical;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert from Miles to Km  
		Scanner input=new Scanner(System.in);
		double m,k;
		System.out.println("Enter Distance in Miles:");
		m=input.nextDouble();
		k=m*1.60934;
		System.out.println(m+" is equal to "+ k+"  Km");


	}

}
