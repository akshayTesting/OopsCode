package SingleToneClass;

public class FaceBook 
{
int  totalPost=0;
static FaceBook f1;
private FaceBook()
{
	System.out.println("Account Created");
}
void Upload(int post)
{
	System.out.println("Total post ::"+totalPost);
	totalPost=totalPost+post;
	System.out.println("Total post are ::"+totalPost);
}
static public FaceBook getFaceBook()

{
	if (f1==null)
	{
	f1=new FaceBook();	
	}
	return f1;
	
}
}
