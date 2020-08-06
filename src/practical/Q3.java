package practical;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//Convert from Celcius to Kelvin  
				Scanner input=new Scanner(System.in);
				double c,kelvin;
				System.out.println("Enter Temperature in Celcius:");
				c=input.nextDouble();
				kelvin=c+ 273.15F;
				System.out.println(c+" is equal to "+ kelvin+" Degree Kelvin");

	}

}
