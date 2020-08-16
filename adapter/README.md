# Adapter Design Pattern: Structural Design
* Take two/more **incompatible/unrelated/uncommon** Interfaces.
* Make the communicate/"work together" via a bridge interface "the adapter".
* In other words, the adapter makes them compatible without modifying the original code.

## Related patterns are 
- *Facade - Hide underlying complexity*
- *Proxy - Intercept and control access to underlying logic*
- *Decorator - Adds behaviour*

```
Imagine that you have a micro USB type B charger and you want to charge your type C phone!
You can buy an adapter that would help you convert type B micro to Type C.
```
<img src="https://github.com/msomi22/designpatterns/blob/master/files/USB_Adapter.jpg" alt="Universal USB" width="300" height="200">

### The client code doesn't implement Adaptee directly because of incompatibility
### Client code only understand JavaScript Object Notation "JSON"
### But the client want's to call a SOAP endpoint
### We can't change our SOAP provider, so!
### We create an adaptor class that will take JSON, understand and convert to SOAP
### Then take SOAP response, and convert to JSON
### Pretty cool!

```java
public class Client{
Target target = new Target(
    new Adapter(
        new Adaptee();
    )
);
String requestJson = "json data here";
target.call(requestJson);
}
```

### Our Interface

```java
public interface Target{
  void call(String jsonData);
}
```

### This is our Adapter class, it bridges the gap by making the two compatible

```java
public class Adapter implements Target{
private Adaptee adaptee;
public Adapter(Adaptee a){
 this.adaptee = a;
}

public void call(String jsonData){
String SOAPRequest = jsonToSAOP(jsonData);
this.adaptee.callRequest(SOAPRequest);
}
}
```
