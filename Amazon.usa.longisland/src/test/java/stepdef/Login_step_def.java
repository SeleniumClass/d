package stepdef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_step_def {
	
	
	@Given("^User is on home page of \"([^\"]*)\"$")
	public void user_is_on_home_page_of(String arg1) throws Throwable {
	    
	}

	@When("^click \"([^\"]*)\" user able to click\"([^\"]*)\"$")
	public void click_user_able_to_click(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^User put emaild_id\"([^\"]*)\"$")
	public void user_put_emaild_id(String arg1) throws Throwable {
	   	}

	@When("^click continue user able to put password\"([^\"]*)\"$")
	public void click_continue_user_able_to_put_password(String arg1) throws Throwable {
	   	}

	@When("^click Login button user able to login$")
	public void click_Login_button_user_able_to_login() throws Throwable {
	   
	}

	@Then("^close login page$")
	public void close_login_page() throws Throwable {
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	   
	}



}
