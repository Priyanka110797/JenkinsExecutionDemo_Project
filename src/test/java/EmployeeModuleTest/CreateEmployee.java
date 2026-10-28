package EmployeeModuleTest;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CreateEmployee {
@Test(groups="ST")
public void createEmployeeTest() {
	System.out.println("Employee created test");
}


@Test(groups="RT")
public void deleteEmployee() {
	System.out.println("Employee delete test");
	Assert.assertTrue("login".equals("log"));
}
}
