package practical;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		//Convert from Kelvin to Celcius
		Scanner input=new Scanner(System.in);
		double c,kelvin;
		System.out.println("Enter Temperature in Kelvin:");
		kelvin=input.nextDouble();
		c=kelvin - 273.15F;
		System.out.println(kelvin+" is equal to "+ c+" Degree Celcius");

	}

}
