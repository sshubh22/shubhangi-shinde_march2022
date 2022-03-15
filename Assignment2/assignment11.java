import java.util.Scanner;
class assignment11
{
public static void main(String args[])
{
	final double pi=22.0/7;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius");
	double r=sc.nextDouble();
	double a=pi*r*r;
	double p=2*pi*r;
	System.out.println("Perimeter="+p);
	System.out.println("Area="+a);
}
}