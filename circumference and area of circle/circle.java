import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value for radius of the circle = :");
        float r=sc.nextFloat();

        //Area Of Circle
        double Area=(3.14*r*r); 
        System.out.println("Area of the circle = "+Area);

        //Circumstances Of Circle
        double circumference = 2*3.14*r;
        System.out.println("Circumference of circle = "+circumference);

	}

}
