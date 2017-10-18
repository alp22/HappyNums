package avinode.happyNumbers;

import core.Happies;
import core.HappyNumberException;

/**
 * For Avinode Happy Numbers
 *
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("=== Hello To Happy Numbers ====");
		System.out.println("--- Writing Happy Numbers from 1 to 1000 ---");
		Happies hippies = new Happies();

		for (int i = 1; i <= 1000; i++)
		{
			try
			{
				if (hippies.isHappyRecursive(Integer.toString(i)))
				{
					System.out.println(i);
				}
			}
			catch (HappyNumberException e)
			{
				System.out.println(e.getMessage());
			}

		}

	}
}
