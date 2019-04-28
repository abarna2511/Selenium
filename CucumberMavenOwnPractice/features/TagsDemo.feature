Feature: Demo for Cucumber Tags in FreeCrm

  @SmokeTest
  Scenario: Create a contact
    Given This is a contact testcase
    
  @RegressionTest 
  Scenario: Create a deal
    Given This is a deal testcase
    
	@E2ETest
	Scenario: Create a tasks
    Given This is a tasks testcase
    
  @SmokeTest @RegressionTest @E2ETest
  Scenario: Create a case
    Given This is a case testcase
    
  @RegressionTest @E2ETest
  Scenario: Search a contact
    Given This is a search contact testcase
    
  @SmokeTest @E2ETest
  Scenario: Search a deal
    Given This is a search deal testcase
    
	@E2ETest
	Scenario: Search a tasks
    Given This is a search tasks testcase
    
  @SmokeTest @RegressionTest @E2ETest
  Scenario: Search a case
    Given This is a search case testcase
    