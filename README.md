scribe-java-extras
==================

The simple OAuth Java lib "scribe-java" extras, for QQ etc...

## QQ
my.scribe.extras.builder.api.QqApi

```java
OAuthService service = new ServiceBuilder()
        .provider(QqApi.class)
        .apiKey(apiKey)
        .apiSecret(apiSecret)
        .callback(callback)
        .build();
```