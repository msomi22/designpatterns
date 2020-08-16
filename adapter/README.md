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
![Universal USB](https://github.com/msomi22/designpatterns/blob/master/files/USB_Adapter.jpg) 

```java
class Client{
Target target = new (
    new Adapter(
        new Adaptee();
    )
);
}
```
