import java.util.Scanner;
class assignment13
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter width");
	double w=sc.nextDouble();
	System.out.println("Enter height");
	double h=sc.nextDouble();
	
	double a=w*h;
	double p=2*(w*h);
	System.out.println("Perimeter="+p);
	System.out.println("Area="+a);
}
}