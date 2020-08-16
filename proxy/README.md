# Proxy Design Pattern: Structural design
* Proxy pattern provides a surrogate/substitute/placeholder for another object in order to control access. 
* It controls access to the original object, that is
* You are able to perform something before or after the request reaches it destination/"original object".
* Proxy pattern can be grouped into either remote proxy, virtual proxy or protection proxy. 
     1. Remote proxy: Interract with a remote resource.
     2. Virtual proxy: Controls access to resource that is expensive to create. 
     3. Protection proxy: Controls access management.
* **But why would you want to do this?**
* Mh! Interesting question
* Let's get an example.

```
You have a cliet code that uses a batch of third party libraries to communicate to a vendor machine.
The communication is done via a simple JSON request.
Due to some reasons, the vendor is forced to replace basic authentication with OAuth2.
Meaning the client code will have to change. Good idea? Not really.
Your buddy reminds you of the proxy design pattern.
So how can proxy pattern help us?
Let's see
```
* Assume that in the third part library we have this interface "VendorRequest" that has method "sendRequest". 
* Create a proxy interface that implements "VendorRequest" and add the OAuth2 logic before sending your request.
* We will create a remote proxy service as shown below.

```java
public interface VendorProxyRequest implements VendorRequest{
     //override sendRequest in third party lib
     VResponse sendRequest(VRequest request);
  }
```

* We implement our new Interface

```java
public class VendorPorxyImpl implements VendorProxyRequest{

public VResponse sendRequest(VRequest request){
//add OAuth2 logic
//send request
VResponse response = ThirdParty.call(request);
}
}
```
* The client code has not changed and, we are able to add OAuth2 logic
* We used proxy pattern to intercept our request, add OAuth2 logic and make our request as ussual. 
