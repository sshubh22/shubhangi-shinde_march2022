class pat9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=65;
			for(int j=1; j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i-1;j++)
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
	}
}