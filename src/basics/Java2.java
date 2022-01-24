package basics;

public class Java2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(i>=j) 
				{
					if(j==0)
						System.out.print("1");
					else if(j==1)
						System.out.print("2");
					else if(j==2)
						System.out.print("3");
					else
						System.out.println("4");
				}
			}
			System.out.println();
		}
	}
}
