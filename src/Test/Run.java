package Test;



import java.io.IOException;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.POMIRC;

public class Run  extends BaseTest{

	@Test
	public void pro() throws IOException, InterruptedException {
	POMIRC clk=new POMIRC(drive);
	clk.submit();
	}
	
}
