# REYDEN-X

###### Reyden-X is an automated service for promoting live broadcasts on external sites with integrated system of viewers and views management.

- [Website](https://reyden-x.com/en)

- [API Documentation](https://api.reyden-x.com/docs)

### Usage

```xml
<dependency>
    <groupId>io.github.pixel365</groupId>
    <artifactId>reydenx</artifactId>
    <version>1.3</version>
</dependency>
```

### Quickstart

```java
import com.reydenx.Client;
import com.reydenx.models.ResultModel;
import com.reydenx.models.OrderModel;

try {
    Client client = new Client("USERNAME", "PASSWORD");
    ResultModel<OrderModel> result = client.getOrderInstance()
        .orderDetails(123456);
    System.out.println(result.getResult().getId());
} catch (Throwable e) {
    e.printStackTrace();
}
```
