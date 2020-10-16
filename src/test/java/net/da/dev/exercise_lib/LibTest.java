package net.da.dev.exercise_lib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LibTest extends TestCase
{

	public LibTest(String testName)
	{
		super(testName);
	}

	public static Test suite()
	{
		return new TestSuite(LibTest.class);
	}

	public void testLib()
	{
		Lib lib =new Lib("test", "test");
		assertNotNull(lib);
	}	

}

