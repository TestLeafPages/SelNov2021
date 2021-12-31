package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(groups = {"smoke","regression"}, alwaysRun=true)
	public void createLead() {
		System.out.println("Create Lead");
	//	throw new RuntimeException();
	}
	
	@Test(priority = -1, dependsOnMethods = "createLead", dependsOnGroups = "smoke")
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(priority = 3, timeOut = 5000, enabled = false)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
