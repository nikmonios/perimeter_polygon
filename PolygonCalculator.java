import java.util.Scanner;

public class PolygonCalculator 
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in); //read from keyboard
		MyPolygon polygon = new MyPolygon(360); //create new object with 360 points
		
		int n; //number of points
        
		
		System.out.println("Points should be added counter-clockwise, if we start from a point close to (0,0),");
		System.out.println("or clockwise, if we start from the highest point ");
		System.out.println("*****************************************************************************************");
		System.out.println("\n \n");
		do
		{
			System.out.println("Give number of points (minimun amount of points = 2)    : ");
			n = inp.nextInt();
			inp.nextLine();
			if(n < 2) //if user gave less than anticipated number of points ..
			{
				System.out.println("Try again. Minimun amount of points is 2! "); //let him know
			}
		}while(n < 2); //if number of points is small, try again
        
        
		polygon.readPoints(n); //read all points
		
		System.out.print("The perimeter is : ");
		System.out.println(polygon.perimeter(n)); //print perimeter of polygon
		
		inp.close(); //close scanner
		
    }
}
