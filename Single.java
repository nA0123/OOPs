public class Single
{
	private static Single single_instance = null;
	public String s;

	private Single()
	{
		s="Singleton Class";
	}

	public static Single getInstance()
	{
		if (single_instance == null) 
		{
			single_instance = new Single();	
		}
		return single_instance;
	}
}

