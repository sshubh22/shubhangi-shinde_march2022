class star15
{
public static void main(String agrs[])
{
int i,j;
for(i=1;i<=5;i++)
{
    for(j=1;j<=i;j++)
	{
	   if(i==j||j==1||i==5)
	   System.out.print("*");
	   else
	   System.out.print(" ");
	 }
	 System.out.println("");
}
}
}
