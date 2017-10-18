package Avinode.Arti1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.Happies;
import core.HappyNumberException;

/**
 * Test Cases For Happy Numbers Project
 *  
 */
public class HappyNumbersTest 
{
	private Happies h=new Happies();
	
    @Test
    public void happyNumberShouldBeHappy() throws HappyNumberException
    {
    	System.out.println("------ Testing happyNumberShouldBeHappy -------");
    	assertTrue(h.isHappyRecursive("10"));
    }
    
    @Test
    public void unhappyNumberShouldBeUnHappy() throws HappyNumberException
    {
    	System.out.println("------ Testing unhappyNumberShouldBeUnHappy -------");
    	assertFalse(h.isHappyRecursive("4"));
    }
    
    @Test(expected=HappyNumberException.class)
    public void numberZeroEntriesAreCaught() throws HappyNumberException
    {
    	System.out.println("------ Testing numberZeroEntriesAreCaught -------");
    	assertFalse(h.isHappyRecursive("0"));
    }
    
    @Test(expected=HappyNumberException.class)
    public void emptyNumberEntriesAreCaught() throws HappyNumberException
    {
    	System.out.println("------ Testing emptyNumberEntriesAreCaught -------");
    	assertFalse(h.isHappyRecursive(""));
    }
    
    @Test(expected=HappyNumberException.class)
    public void nonIntegerNumberEntriesAreCaught() throws HappyNumberException
    {
    	System.out.println("------ Testing nonIntegerNumberEntriesAreCaught -------");
    	assertFalse(h.isHappyRecursive("4.1"));
    }
    
    @Test(expected=HappyNumberException.class)
    public void unparsableEntriesAreCaught() throws HappyNumberException
    {
    	System.out.println("------ Testing unparsableEntriesAreCaught -------");
    	assertFalse(h.isHappyRecursive("4,1"));
    }
    
    @Test(expected=HappyNumberException.class)
    public void nonPositiveEntriesAreCaught() throws HappyNumberException
    {
    	System.out.println("------ Testing nonPositiveEntriesAreCaught -------");
    	assertFalse(h.isHappyRecursive("-4"));
    }
}
