Feature: Test registration functional
Scenario: Test registration with valid inputs given
Given user launches chrome browser
When user navigates to registration page
And user enters with the username as "gopika"
And user enters with the firstname as "gopi"
And user enters with the lastname as "shree"
And user enters with the password as "Password123"
And user enters with the confirm password as "Password123"
And user enters with the gender as "female"
And user enters with the email as "rthigopika@gmail.com"
And user enters with the mobile number as "9840692787"
And user enters with the dob as "20/02/1998"
And user enters with the address as "perungalathur"
And user enters with the security as "what is your nick name "
And user enters with the answer as "aarthi"
Then verify registration successfull
