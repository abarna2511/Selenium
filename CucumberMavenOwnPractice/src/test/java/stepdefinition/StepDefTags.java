package stepdefinition;

import cucumber.api.java.en.Given;

public class StepDefTags {
	
	@Given("^This is a contact testcase$")
	public void this_is_a_contact_testcase(){
		System.out.println("this_is_a_contact_testcase");
	}

	@Given("^This is a deal testcase$")
	public void this_is_a_deal_testcase(){
		System.out.println("this_is_a_deal_testcase");
	}

	@Given("^This is a tasks testcase$")
	public void this_is_a_tasks_testcase(){
		System.out.println("this_is_a_tasks_testcase");
	}

	@Given("^This is a case testcase$")
	public void this_is_a_case_testcase(){
		System.out.println("this_is_a_case_testcase");
	}

	@Given("^This is a search contact testcase$")
	public void this_is_a_search_contact_testcase(){
		System.out.println("this_is_a_search_contact_testcase");
	}

	@Given("^This is a search deal testcase$")
	public void this_is_a_search_deal_testcase(){
		System.out.println("this_is_a_search_deal_testcase");
	}

	@Given("^This is a search tasks testcase$")
	public void this_is_a_search_tasks_testcase(){
		System.out.println("this_is_a_search_tasks_testcase");
	}

	@Given("^This is a search case testcase$")
	public void this_is_a_search_case_testcase(){
		System.out.println("this_is_a_search_case_testcase");
	}

}
