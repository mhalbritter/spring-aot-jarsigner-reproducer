## Manually sign the JAR

Create a keystore:

```
keytool -genkey -alias sign-key -validity 3650 -keyalg RSA -keystore keystore.jks
```

I used `secret` as the password.

Sign the jar:

```
jarsigner -keystore keystore.jks build/libs/dependency-0.0.1-SNAPSHOT.jar sign-key
```

Verify the jar:

```
jarsigner -verify build/libs/dependency-0.0.1-SNAPSHOT.jar
```
