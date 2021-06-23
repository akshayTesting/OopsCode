package Array2D;

public class TwoDimentionalArray
{

	public static void main(String[] args)
	{
	
		int arr[][];
		arr=new int[3][4]; // 3 row 4 coloum
		
		arr[0][1]=9;   //0
		arr[0][2]=8;	//1
		arr[1][0]=7;	//2
		arr[1][2]=5;	//3
		arr[2][0]=4;	//4
		arr[2][2]=1;	//5					
		arr[2][3]=2;	//6
		
		System.out.println(arr[0][2]);
		System.out.println(arr[2][3]);
		
		//for row
		for (int i = 0; i <3; i++)
		{
			for (int j = 0; j <4; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
