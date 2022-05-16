package cucumber.stepdef;

import org.junit.Assert;

import cucumber.domain.helpers.DomainHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawalSteps {
		
	private DomainHelper domainHelper;
	
	public WithdrawalSteps(DomainHelper domainHelper)
	{
		this.domainHelper = domainHelper;
	}
		
	@Then("${int} should be dispensed")
	public void $ShouldBeDispensed(int dispensedAmount) {
		
		Assert.assertEquals(dispensedAmount,domainHelper.getCashSlot().getContents());
	}


}
