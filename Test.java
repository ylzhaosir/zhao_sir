public class Singleton 
{
	  private static Singleton single;
	  private Singleton() {};
	  public static Singleton getInstance() 
	  {
		if(null == single)
		{
			synchronized(single )
			{
				if(null == single)
				{
					single = new Singleton();
				}
			}
		}
		return single;
	  }
}
