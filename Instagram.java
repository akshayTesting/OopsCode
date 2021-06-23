package SingleToneClass;

public class Instagram 
{
int totalPost=0;
static Instagram i1;
private Instagram()
{
	System.out.println("Account Create Successfull");
}
void upload(int pictures)
{
	System.out.println("Your Uploaded Pictures:::"+totalPost);
	totalPost=totalPost+pictures;

	System.out.println("Your Uploaded Pictures:::"+totalPost);
}
static public Instagram getInstagram()
	

	{
	if (i1==null)
	{
	i1=new Instagram();
	}
	{
	return i1;
		}
	
}
}
