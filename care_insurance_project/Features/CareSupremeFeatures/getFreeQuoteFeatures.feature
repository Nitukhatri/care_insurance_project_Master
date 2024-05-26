
Feature: Mobile number verification

@test
Scenario:  Valid Page Title scenerio
	Given user launch chrome browser
  When User opens URL "https://www.careinsurance.com/product/care-supreme" 
  Then Section title should be "Get a Free Quote" 
  And close browser




#Scenario Outline:  Invalid Mobile number scenerio
#	Given user launch chrome browser
  #When User opens URL "https://www.careinsurance.com/product/care-supreme" 
  #And User enters Mobile number as "<Mobile Number>" 
  #And Click on Calculate premium 
  #Then Error Message should be "Please enter a valid mobile number" 
#	And Enter Mobile Number color should be change into Red #ff0000
  #And close browser
#
#Examples:
 #|Mobile Number |
 #|0							|
 #|1							|
 #|2							|
 #|3							|
 #|4							|
 #|5							|
 #|6666   				|
 #|912345678			|
 

Scenario:  Valid Mobile number scenerio
	Given user launch chrome browser
  When User opens URL "https://www.careinsurance.com/product/care-supreme" 
  And User enters Mobile number as "9988776655" 
  And Click on Calculate premium 
  Then Section select family member title should be "Select Family members"
  #"Select Family members" 
  And close browser
  
  