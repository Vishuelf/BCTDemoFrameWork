package SampleScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class LaunchTheBrowser extends BaseClass {
	@Test
	public void Run() {
		Reporter.log("Sucessfully Launched",true);
	}

}
