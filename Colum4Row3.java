package Array2D;

public class Colum4Row3
{

	
	public static void main(String[] args) 
	{
	
		int a[][]=new int[3][4];   // Row 3 and Coloum 4 
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;
		a[2][0]=90;
		a[2][1]=100;
		a[2][2]=110;
		a[2][3]=120;
		
		//System.out.println(a.length);
		
		/*
		 * for (int i = 0; i < 3; i++) //Row { for (int j = 0; j < 4; j++) //Coloum {
		 * System.out.print(a[i][j]+ " "); } System.out.println(); }
		 */
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
