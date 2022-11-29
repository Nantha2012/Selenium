package Global_Executions;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BasePage;

public class Reports extends BasePage{

	public Reports() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void Report_Generation() {
		
		report = reports();
		
	}

}
