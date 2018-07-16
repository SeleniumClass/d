Feature:User able to sign in 
Scenario: valid login
 
Given User is on home page of "www.Amazon.com"
When click "Hello.Signin" user able to click"Signin"
And User put emaild_id"dr.sajeeb22@gmail.com"
And click continue user able to put password"123456"
And click Login button user able to login
Then close login page
And close browser