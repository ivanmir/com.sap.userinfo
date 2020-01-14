UserInfoApp is the Java Backend 

It contains the Spring Security Configuration required to validate JWT authorizations
The app extracts the currently logged in user e-mail from the JWT

It will only work when:
1. used with an AppRouter application that will forward the JWT to it
2. user is assigned the **PrincipalViewer** role collection via cockpit.

This app is configured to display debug info in the logs. 
To disable it open the **WebSecurity.java** and change the following
```Java
@EnableWebSecurity(debug = true)
```
to
```Java
@EnableWebSecurity(debug = false)
```

The app has all Spring Boot Actuators enabled.
To disable them open the **application.properties** file - it is self explanatory.
