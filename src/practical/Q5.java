package practical;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert from km to Miles  
				Scanner input=new Scanner(System.in);
				double m,k;
				System.out.println("Enter Distance in KM:");
				k=input.nextDouble();
				m=k/1.60934;
				System.out.println(k+" is equal to "+ m+"  Miles");

	}

}
