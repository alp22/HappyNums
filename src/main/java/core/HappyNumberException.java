package core;

public class HappyNumberException extends Exception
{

	public HappyNumberException(String s)
	{
		super(s);
		System.out.println(s);
	}

	/**
	 * In practice, the full stack trace should be printed out.
	 * Nevertheless, let it stay here like this to show that we have caught format expcetions.
	 * @param e
	 */
	public HappyNumberException(Exception e)
	{
		super(e);
		System.out.println(e.getMessage()+ " caught by Happy Number Exception");
	}

}
