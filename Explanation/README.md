## Design patterns
* Easy to maintain
* template 


# Behavioural(Behaviour/interaction of objects)
* Chain of Responsibility
     - * A way of passing a request between a chain of objects
     - * Loan aproval process 
     - * Exeption handling 
     - * Logger pattern 
* Iterator(#) 
     - *  Sequentially access the elements of a collection
* State
     - * Alter an object's behaviour when its state chnages 
* Strategy
     - * Encapsulates an algorithim inside a class 
     - * Comparator interface 
     - * Sorting 
* Observer(#) 
     - * A way of notifying a change to a number of classes 
     - * Online bidding 
     - * Sachin 
* Visitor 
     - *  Defines a new operation to a class without change. 
* Template Method 
     - * Defer the exact steps of an algorithim to  subclass.
* Command 
     - * Encapsulate a command request as an object 
     - * Thread using Runnable interface 
* Memento(#) 
     - * Undo/Redo functionality 
     - * Capture and restore an object's internal state 
     - * Savepoints in DB
* Mediator
     - * Defines simplified communication between classes. 
     - * ESB 
# Creational 
* Prototype
     - * Fully initialized instance to be copied/cloned.
     - * Object setup is complex/resource intensive and we can not afford to create every time.
     - * Cheese game - initial layout.
     - * Initial setup is fully initialized and will be cloned later. 
	 
* Builder
     - *  We have complex objects to create, with a lot of parameters in the constructor.
     - * Wrap the original class within a builder class to avoid passing unnecessary parameters. 
     - *  Separate object construction from its represenation.
     - *  Hide complex internal structure.
		
* Singleton(#) 
      
* Factory: (Virtual Constructor)
   - * 
 1. Simple,
 2. Method
     - *  Define an interface/class for creating an object but let the subclasses decide which class to instatiate.
     - * Method that creates objects.
     - * Polymorphism.
 3. Abstract 
     - * Familiy of objects.
     - * Provide an interface for creating families of related or dependent objects without specifying their concrete classes
 
* Object pool pattern. 
    - * Performance can be sometimes the key issue during the software development and the object creation(class instantiation) is a costly step. 
    - * While the Prototype pattern helps in improving the performance by cloning the objects, the Object Pool pattern offer a mechanism to reuse objects that are expensive to create.

Clients of an object pull "feel" like they are owners of a service although the service is shared among many other clients.

# Structural (Composation of classes)
* Proxy
     - * Object representing another object 
     - * Credit card is a proxy of a bank account
* Decorator
     - * Add responsibility to an object dynamically. 
     - * LineNumberInputStream(BufferedInputStream(FileInputeStream))). 
     - * Add discount to an order. 
     - * Add toppings to a Pizza. 
* Facade
    - * Single class that represent the entire subsystem.
    - * Event manager 
    - * Represent several steps into one step 
    - * Reduce network calls
* Adapter (#) 
    - *  Match interfaces of different classes 
* Flyweight
   - *  A fine grained instance used for efficient sharing.
