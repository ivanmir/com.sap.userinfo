# com.sap.userinfo

UserInfoApp --> Java Backend

UserInfoAppRouter --> SAP App Router that forwards requests to Java Backend and is responsible for authentication to an instance of UAA in Cloud Foundry

### Deploy 

#### Step I

To deploy, first create the following service instances in your CF space (**case sensitive**):

1. UserInfoApp-xsuaa
Service Type: xsuaa
Plan: application
JSON Configuration: file **xs-security.json** found at the root of the App Router project

2. destination-service
Service Type: destination
Plan: lite

Note: don't worry about binding the services to applications, it will be done by the cf CLI command

#### Step II

Add the role collection **PrincipalViewer** to your user by:
1. Open the cockpit under your organization' subaccount 
2. Open the left-menu **Trust Configuration** under the Security session
3. Click on the link for your IdP's Name - standard is SAP ID Service
4. Enter your e-mail address in the search box and click on the Show Assignments button <add your name if prompted>.
5. Click on the Assign Role Collection and select the **PrincipalViewer** from the dropdown menu

#### Step III
1. Compile the java project using the maven command
2. Adapt the manifest to your needs (mostly route names)
3. Push the application with CLI (cf push)

#### Step III
1. Adapt the manifest to your needs (mostly route names)
2. Push the application with CLI (cf push)

### Test
1. Open a browser and navigate to the java application's URL with suffix **/actuator/health**. You should see the message: {"status": "UP"}
2. Open an incognito window and navigate to your app router's URL with suffix **/getPrincipal**. You should be redirected to a login screen (this would be the platform's URL). Once authenticated, you should be redirected back and the getPrincipal rest service should now display your e-mail.
3. Try opening a new ingcognito window and navigate to the same **/getPrincipal** URL as before. Notice you will now get an error 401 - Unauthorized.

 
