package Array2D;

public class StringArray 
{

	
	public static void main(String[] args) {
			
		String name[][]= {{"Red","Yellow","Green" },{"cyon","oregans","black"},{"white","pink","lightpink"}};
		
		
		
		for (int i = 0; i < name.length; i++)
		{
		
			for (int j = 0; j < name[i].length; j++)
			{
			
				System.out.print(name[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
