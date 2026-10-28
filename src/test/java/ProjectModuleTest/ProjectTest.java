package ProjectModuleTest;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ProjectTest {
	@Test(groups="ST")
	public void createProjectTest() {
		System.out.println("Project created test");
	}


	@Test(groups="RT")
	public void deleteProjectTest() {
		System.out.println("Project delete test");
		Assert.assertTrue("login".equals("log"));
	}
}
