package core;

public class Happies
{

	/**
	 * Main algorithm
	 * 
	 * @param s
	 * The value as string, so we can parse nicely by Double class. In
	 * any case, the power function takes and gives doubles. If we
	 * encounter 0, its sum is zero, so we first replace all zeroes
	 * with empty strings. No need to calculate its power for nothing.
	 * @return Result as primitive int value. Good for if checks.
	 * @throws HappyNumberException 
	 */
	public int getSquareSums(String s) throws HappyNumberException
	{
		
		int result = 0;
		String[] aa = s.replaceAll("0", "").split("");

		if (aa.length==0)
		{
			throw new HappyNumberException("No number to process");
		}
		
		for (int i = 0; i < aa.length; i++)
		{
			try
			{
				Double converted=Double.parseDouble(aa[i]);
				Double val = Math.pow(converted, 2);

				result += val.intValue();
			}
			catch (NumberFormatException e)
			{
				throw new HappyNumberException(e);
			}
			
		}

		return result;

	}

	/**
	 * Returns if the number is happy or not by a recursive algorithm. Using
	 * this algorithm, I observed the infinite loop and my observation is as
	 * follows: Curiously, if a number is "unhappy" then it falls eventually
	 * into the number ranges 4,16,37,58,89,145,42,20 loop of numbers and is an
	 * infinite loop. ie. once it falls into number 4 "range" of the
	 * getSquareSums operation, the loop is locked in this sequence of numbers.
	 * 
	 * You can uncomment the system out line and see it yourselves if you wish.
	 * 
	 * Even putting 4 to check will suffice, but I wish to conserve memory, cpu
	 * and time, so if I see one of these "culprits", I end the loop, or if I
	 * find value 1, or the number itself
	 * 
	 * Now I just looked at wikipedia and it tells the same sequence of
	 * numbers :)
	 * 
	 * @param s  The value to check, as string
	 * @return if number is happy or not
	 * @throws HappyNumberException 
	 */
	public boolean isHappyRecursive(String s) throws HappyNumberException
	{
		boolean isHappy = false;
		int value = 0;
		int firstVal =0;
		if (s.length()==0)
		{
			throw new HappyNumberException("String length zero");
		}
		try
		{
			firstVal = Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			throw new HappyNumberException(e);
		}
		if (firstVal<1)
		{
			throw new HappyNumberException("Numbers should be positive");
		}
		
		while (true)
		{
			value = getSquareSums(s);
			// System.out.println(value);
			if (value == firstVal || value == 1 || value == 4 || value == 16 || value == 37 || value == 58
					|| value == 89 || value == 145 || value == 42 || value == 20)
			{
				if (value == 1)
				{
					isHappy = true;
				}
				break;
			}
			s = Integer.toString(value);

		}

		return isHappy;
	}

}
