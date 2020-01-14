# com.sap.userinfo

UserInfoApp is the Java Backend with Spring Security Configuration

It will only work when:
1. used with an AppRouter application that will forward the JWT to it
2. user is assigned the "PrincipalViewer" role collection via cockpit.

This app is configured to display debug info in the logs. 
To disable it open the WebSecurity.java and change the following
'''@EnableWebSecurity(debug = true)
to
'''@EnableWebSecurity(debug = false)

