import java.util.Scanner;


public class MyPolygon 
{
	points[] Points; //create points object
	int num_of_points;
	
	public MyPolygon( int max_N_Points) //constructor
	{
		Points = new points[ max_N_Points];
		num_of_points = 0;
	}
	
	public void readPoints( int n)
	{
		Scanner inp = new Scanner( System.in);
		float x; //read x ..
		float y; //.. and y from keyboard

		for(int i = 0; i < n; i++)
		{
			System.out.println("give x for " + i + "th point : ");
			x = inp.nextFloat(); //read x
			inp.nextLine();
			
			System.out.println("give y for " + i + "th point : ");
			y = inp.nextFloat(); //read y
			inp.nextLine();
			
			Points[i]= new points( (double)x, (double)y); //add the point that we just received
			
			num_of_points = n; //update numeber of points
		}
		inp.close(); //close reader
	}
	
	public double perimeter(int number)
	{
		int i; //counter
		double perimeter = 0; //variable to be returned
		double[] distances = new double[number]; //number of distances
		
		
		
		for(i = 0; i < number; i++)
		{
			if(i + 1 == number) //if we are on the last point
			{
				distances[i] = dist(Points[i].x, Points[i].y, Points[0].x, Points[0].y); //find distance from 1st point
			}
			else //else, find distance between two neighbours
			{
				distances[i] = dist(Points[i].x, Points[i].y, Points[i+1].x, Points[i+1].y);
			}
		}
		
		for(i = 0; i < number; i++)
		{
			perimeter = perimeter + distances[i]; //sum all distances
		}
		
		return perimeter; //return perimeter
	}
	
	
	public static double dist(double x1, double y1, double x2, double y2)
	{
		double d; //distance between two points
		
		d = Math.sqrt( (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) );
		
		return d;
	}
}
