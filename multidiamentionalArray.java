package MultidiamentionalArray;

public class multidiamentionalArray
{

	
	public static void main(String[] args)
	{
	
		 int[][][] test = {
		            {
		              {1, -2, 3}, 
		              {2, 3, 4}
		            }, 
		            { 
		              {-4, -5, 6, 9}, 
		              {1}, 
		              {2, 3}
		            } 
		        };
		 
		 for (int i = 0; i < test.length; i++)
		 {
		
			 for (int j = 0; j < test[i].length; j++) 
			 {

				 for (int j2 = 0; j2 < test[i].length; j2++)
				 {
				
					 System.out.print(test[i][j][j2]+"  ");
				}
				 System.out.println();
			 }
			 System.out.println();
		}
		
		
	}
}
