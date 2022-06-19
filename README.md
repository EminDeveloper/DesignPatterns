# What is a Design Pattern?

A design pattern is a practical proven solution to a recurring
design problem. It allows you to use previously outlined
solutions that expert developers have often used to solve a
software problem, so you do not need to build a solution from
the basics of object-oriented programming principles every
time. These solutions are not just theoretical – they are actual
solutions used in the industry. Design patterns may also be
used to help fix tangled, structureless software code, also
known as “spaghetti code.”


## Creational Patterns:
------------------------------
Creational patterns tackle how you handle creating or cloning new objects. Cloning an object occurs when you are creating an object that is similar to an existing one, and instead of instantiating a new object, you clone existing objects instead of instantiating them. Creational patterns depend on the programming language
being used. Languages without the notion of classes, such as Javascript, would encourage you to clone an object and expand it to meet the purposes of those particular instances, called  prototypes. Javascript allows for changes to these prototypes at runtime. Languages that rely on classes, however, such as Java
and C#, instantiate objects using specific classes defined at compile time. The different ways of creating objects will greatly influence how a problem is solved. Therefore, different languages therefore impact what patterns are possible to use. 


### Singleton Pattern

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.


### Factory Method Pattern
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
Imagine that you’re creating a logistics management application. The first version of your app can only handle transportation by trucks, so the bulk of your code lives inside the Truck class.
After a while, your app becomes pretty popular. Each day you receive dozens of requests from sea transportation companies to incorporate sea logistics into the app.
Great news, right? But how about the code? At present, most of your code is coupled to the Truck class. Adding Ships into the app would require making changes to the entire codebase. Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these changes again.

As a result, you will end up with pretty nasty code, riddled with conditionals that switch the app’s behavior depending on the class of transportation objects.
The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.
At first glance, this change may look pointless: we just moved the constructor call from one part of the program to another. However, consider this: now you can override the factory method in a subclass and change the class of products being created by the method.

There’s a slight limitation though: subclasses may return different types of products only if these products have a common base class or interface. Also, the factory method in the base class should have its return type declared as this interface.
For example, both Truck and Ship classes should implement the Transport interface, which declares a method called deliver. Each class implements this method differently: trucks deliver cargo by land, ships deliver cargo by sea. The factory method in the RoadLogistics class returns truck objects, whereas the factory method in the SeaLogistics class returns ships.
The code that uses the factory method (often called the client code) doesn’t see a difference between the actual products returned by various subclasses. The client treats all the products as abstract Transport. The client knows that all transport objects are supposed to have the deliver method, but exactly how it works isn’t important to the client.

----------------------

## Structural Patterns:

Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.
These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
1. Adapter Pattern
Adapting an interface into another according to client expectation.
This pattern is easy to understand as the real world is full of adapters.   For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates that request on the adaptee using the adaptee interface.
Client receive the results of the call and is unaware of adapter’s presence.
Definition:

The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
The client sees only the target interface and not the adapter. The adapter implements the target interface. Adapter delegates all requests to Adaptee.

2. Bridge Pattern
Separating abstraction (interface) from implementation.
Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
 
3. Composite Pattern
Allowing clients to operate on hierarchy of objects.
Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
Use the Composite pattern when you have to implement a tree-like object structure.

 The Composite pattern provides you with two basic element types that share a common interface: simple leaves and complex containers. A container can be composed of both leaves and other containers. This lets you construct a nested recursive object structure that resembles a tree.
 
4. Decorator Pattern
Adding functionality to an object dynamically.
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.[1] The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.[2] Decorator use can be more efficient than subclassing, because an object's behavior can be augmented without defining an entirely new object.


5. Facade Pattern
Providing an interface to a set of interfaces.
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

6. Flyweight Pattern
Reusing an object by sharing it.

7. Proxy Pattern
Representing another object.

### Facade Pattern
As systems or parts of systems become larger, they also become more complex. This is not necessarily a bad thing – if the scope of a problem is large, it may require a complex solution. Client classes function better with a simpler interaction, however. The façade design pattern attempts to resolve this issue by providing a single, simplified interface for client classes to interact with a subsystem. It is a structural design pattern.
A façade is a wrapper class that encapsulates a subsystem in order to hide the subsystem’s complexity; it acts as a point of entry into a subsystem without adding more functionality in itself. The wrapper class allows a client class to interact with the subsystem through the façade. A facade might be compared metaphorically to a waiter or salesperson, who hides all the extra work to be done in order to purchase a good or service.
A façade design pattern should therefore be used if there is a need to simplify the interaction with a subsystem for client classes and if there is a need for a class to instantiate other classes within your system and to provide these instances to another class. Often façade design patterns combine interface implementation by one or more classes, which then gets wrapped by the façade class. This can be explained through a number of steps.
1. Design the interface.
2. Implement the interface with one or more classes.
3. Create the façade class and wrap the classes that implement the interface.
4. Use the façade class to access the subsystem.


#### Adapter Pattern

This pattern is easy to understand as the real world is full of adapters.   For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

To use an adapter:

The client makes a request to the adapter by calling a method on it using the target interface.
The adapter translates that request on the adaptee using the adaptee interface.
Client receive the results of the call and is unaware of adapter’s presence.
Definition:

The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

### Composite Pattern
Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.

For example, imagine that you have two types of objects: Products and Boxes. A Box can contain several Products as well as a number of smaller Boxes. These little Boxes can also hold some Products or even smaller Boxes, and so on.

Say you decide to create an ordering system that uses these classes. Orders could contain simple products without any wrapping, as well as boxes stuffed with products...and other boxes. How would you determine the total price of such an order?
You could try the direct approach: unwrap all the boxes, go over all the products and then calculate the total. That would be doable in the real world; but in a program, it’s not as simple as running a loop. You have to know the classes of Products and Boxes you’re going through, the nesting level of the boxes and other nasty details beforehand. All of this makes the direct approach either too awkward or even impossible.
The Composite pattern suggests that you work with Products and Boxes through a common interface which declares a method for calculating the total price.

How would this method work? For a product, it’d simply return the product’s price. For a box, it’d go over each item the box contains, ask its price and then return a total for this box. If one of these items were a smaller box, that box would also start going over its contents and so on, until the prices of all inner components were calculated. A box could even add some extra cost to the final price, such as packaging cost.
The greatest benefit of this approach is that you don’t need to care about the concrete classes of objects that compose the tree. You don’t need to know whether an object is a simple product or a sophisticated box. You can treat them all the same via the common interface. When you call a method, the objects themselves pass the request down the tree.

Armies of most countries are structured as hierarchies. An army consists of several divisions; a division is a set of brigades, and a brigade consists of platoons, which can be broken down into squads. Finally, a squad is a small group of real soldiers. Orders are given at the top of the hierarchy and passed down onto each level until every soldier knows what needs to be done.



### Proxy Pattern
A proxy design pattern allows a proxy class to represent a
real “subject” class. It is a structural design pattern. A proxy is
something that acts as a simplified, or lightweight version, of
the original object. A proxy object can perform the same tasks
as an original object but may delegate requests to the original
object to achieve them.
In this design pattern, the proxy class wraps the real subject
class. This means that a reference to an instance of the real
subject class is hidden in the proxy class. The real object is
usually a part of the software system that contains sensitive
information, or that would be resource-intensive to instantiate.
As the proxy class is a wrapper, client classes interact with it
instead of the real subject class.
The three most common scenarios where proxy classes are
used are:
● To act as a virtual proxy. This is when a proxy class is
used in place of a real subject class that is
resource-intensive to instantiate. This is commonly used
on images in web pages or graphic editors, as a
high-definition image may be extremely large to load.
● To act as a protection proxy. This is when a proxy
class is used to control access to the real subject class.
For example, a system that is used by both students and
instructors might limit access based on roles.
● To act as a remote proxy. This is when a proxy class is
local, and the real subject class exists remotely. Google
docs make use of this, where web browsers have all the
objects it needs locally, which also exist on a Google
server somewhere else.
### Decorator Pattern
A structural pattern that allows additional behaviors or responsibilities to be dynamically attached to an object, through the use of aggregation to combine behaviors at run time.
It is beneficial for software to have flexible combinations of overall behaviors. However, changes to classes cannot be made
while a program is running, as the behavior of an object is defined by its class, and only occurs at compile time. A new
class would need to be created in order to achieve a new combination of behaviors while a program is running. Lots of
new combinations, however, would lead to lots of classes, which is undesirable. A decorator design pattern allows additional behaviors or
responsibilities to be dynamically attached to an object, through the use of aggregation to combine behaviors at run
time. It is a structural design pattern. As explained in the first course of this specialization,
aggregation is a design principle used to represent a “has-a” or “weak containment” relationship between two objects. This can
be used to build a stack of objects, also known as an “aggregation stack”, where each level of the stack contains an object that knows about its own behavior and augments the
one underneath it.

--------------------------

## Behavioural Patterns:
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.


### Template Method Pattern

The template method pattern defines an algorithm’s steps
generally, by deferring the implementation of some steps to
subclasses. In other words, it is concerned with the assignment
of responsibilities.
The template method is best used when you can generalize
between two classes into a new superclass. Think of it as
another technique to use when you notice you have two
separate classes with very similar functionality and order of
operations. You can choose to use a template method, so
changes to these algorithms only need to be applied in one
place instead of two. The template method would be within the
superclass, and would therefore be inherited by the subclasses.
Differences in algorithms would be done through calls to
abstract methods whose implementations are provided by the
subclass. After using generalization, objects can be more
effectively reused. Inheritance allows functionality to be shared
between classes and enables clearer and more self-explanatory
code.



### Chain of Responsibility Pattern 
The chain of responsibility design pattern is a chain of
objects that are responsible for handling requests. In software
design, these objects are handler objects that are linked
together.
When a client object sends a request, the first handler in the
chain will try to process it. If the handler can process the
request, then the request ends with this handler. However, if
the handler cannot handle the request, then the request is sent to the next handler in the chain. This process will continue until
a handler can process the request.


### State Pattern
State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
Objects in your code are aware of their current state. They can
choose an appropriate behavior based on their current state.
When their current state changes, this behavior can be altered -
this is the state design pattern.
This pattern should be primarily used when you need to change
the behavior of an object based upon changes to its internal
state or the state it is in at run-time. This pattern can also be
used to simplify methods with long conditionals that depend
on the object’s state.


### Command Pattern
The command pattern encapsulates a request as an object of
its own. In general, when an object makes a request for a
second object to do an action, the first object would call a
method of the second object and the second object would
complete the task. There is direct communication between the
sender and receiver object.
The command pattern creates a command object between the
sender and receiver. This way, the sender does not have to
know about the receiver and the methods to call.
In a command pattern, a sender object can create a command
object. However, an invoker is required to make the command
object do what it’s supposed to do and get the specific receiver
object to complete the task. An invoker is therefore an object
that invokes the command objects to complete whatever task it
is supposed to do. A command manager can also be used that
basically keeps track of the commands, manipulates them, and
invokes them.
Purposes of the Command Pattern
There are many different purposes for using the command
pattern.
One is to store and schedule different requests. If requests are
turned into command objects in your software, then they can
be stored into lists and manipulated before they are completed.
They can also be placed onto a queue so that different
commands can be scheduled to be completed at different
times. For example, the command pattern can be used to have
an alarm ring in calendar software. A command object could be
created to ring the alarm, and this command could be placed
into a queue so that it is completed when the event is
scheduled to occur.
Another purpose for the command pattern is to allow
commands to be undone or redone. For example, edits can be
undone or redone in a document. Imagine that the software has
two lists: a history list, which holds all the commands that have
been executed, and a redo list, which will be used to put
commands that have been undone. Each time a command is
requested, a command object is created and executed. When
the command is completed, it goes to the history list. If you
undo a command, then the software would go to the history list
and ask the most recent command executed to undo itself, and
put it on the redo list. Alternately, if a user needs to redo, the
software would take the most recent command undone in the
redo list, and move it onto the history list again. The redo list
will be emptied every time a command is executed because
usually, you can’t redo a previous edit after a new edit has been
made.
The command pattern lets you do things to requests that you
wouldn’t be able to do if they were simple method calls from
one object to the other. Commands can also be stored in a log
list, so if the software crashes unexpectedly, users can redo all
the recent commands.



### Mediator Pattern
Imagine that you want the house of the future. You want your house to change its own temperature
once you have left, to brew your coffee when the alarm on your phone goes off, and to load the
latest Globe and Mail news issue onto your tablet if you're home and it's Saturday morning.
This plan starts out nicely; you are an accomplished software developer, so making these different
objects talk is no big deal to you.
Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category.


### Observer Pattern
The observer design pattern is a pattern where a subject
keeps a list of observers. Observers rely on the subject to
inform them of changes to the state of the subject.
In an observer design pattern, there is generally a Subject
superclass, which would have an attribute to keep track of all
the observers. There is also an Observer interface with a
method so that an observer can be notified of state changes to
the subject. The Subject superclass may also have subclasses
that implement the Observer interface. These elements create
the relationship between the subject and observer.

There are many different possible examples, but you could have said an auction and bidder, or news broadcast and viewer. These are examples of the observer design pattern. In each of these, relationships are generally one subject to many observers. One auction is observed by many bidders. One broadcast is observed by many viewers.


### Model View Controller
Model, View, Controller (MVC) pattern is a pattern that
should be considered for use with user interfaces. MVC
patterns divide the responsibilities of a system that offers a
user interface into three parts: model, view, and controller.
The Model is going to contain the underlying data, state, and
logic that users want to see and manipulate through an
interface. It is the “back end”, or the underlying software. A key
aspect of the MVC pattern is that the model is self-contained. It
has all of the state, methods, and other data needed to exist on
its own. The View gives users the way to see the model in the
way they expect and allows them to interact with it or at least
parts of it. It is the “front end” or the presentation layer of the
software. A model could have several views that present different parts of the model, or present the model in different
ways.
When a value changes in the model, the view needs to be
notified, so it can update itself accordingly. The observer
design pattern allows this to happen. In an observer pattern,
observers are notified when the state of the subject changes. In
this case, the view is an observer. When the model changes, it
notifies all of the views that are subscribed to it.
The view may also present users with ways to make changes to
the data in the underlying model. It does not directly send
requests to the model, however. Instead, information about the
user interaction is passed to a Controller. The controller is
responsible for interpreting requests and interacts with
elements in the view, and changing the model. The view is
therefore only responsible for the visual appearance of the
system. The model focuses only on managing the information
for the system.
The MVC pattern uses the separation of concerns design
principle to divide up the main responsibilities in an interactive
system. The controller ensures that the views and the model
are loosely coupled. The model corresponds to entity objects,
which are derived from analyzing the problem space for the
system. The view corresponds to a boundary object, which is
at the edge of your system that deals with users. The controller
corresponds to a control object, which receives events and
coordinates actions.
In order to examine the implementation of this pattern in Java
code, let us consider an example. Imagine you are creating an
interface for a grocery store, where cashiers can enter orders,
which are displayed. Customers and cashiers should be able to
see the list of items entered into the order with a barcode
scanner and see the total bill amount. Cashiers should also be
able to make corrections if necessary.

=====================================


### Liskov Substitution Principle:
<div>
<h3>Classes</h3>
 <p>In object-oriented programming, developers are able to define their data structures and use them to encapsulate a set of attributes and methods. These data structures are known as "classes". They allow developers to create abstract representations of real world objects or theoretical concepts within a software system.</p>
 <p>In general, objects and ideas do not exist in isolation, meaning that they are related to, composed of, part of, or associated with something else. So how are these relationships realized in object-oriented programming? By introducing object-oriented designs such as inheritance.</p>
 <h3>Class Inheritance</h3>
 <p>Inheritance is a concept that allows a class to take on and become "endowed" with the characteristics and behaviors of another class. In this relationship, the inherited class is known as the “base class”, and the inheriting class is the “subclass”. Inheritance is one of the pillars of object-oriented programming because it allows subclasses to obtain the same attributes and methods as the base class. In addition, inheriting classes are able to add their own characteristics and behaviors, allowing them to become more "specialized".</p>
 <p>Since classes are user-defined data structures, it is implied that the type of a class is also user-defined. Therefore, inheritance allows the subclass to become polymorphic, because inheritance lets the subclass become a subtype of the base class.</p>
 <p>Subtyping also allows subclasses to be used as substitutes for their base class. Substitution states that:</p><p>Any class, S, can be used to replace a class, B, if and only if, S is a subtype of B.</p>
 <p>Simply put, any subclass can stand in for its base class. Because of inheritance, a subclass is expected to have the same characteristics and behave in the same way.</p>
 <p>	While this is easy to understand, it presents some difficulties when it comes to designing an object-oriented system. Developers need to be able to determine when it is appropriate to use inheritance. Applying inheritance incorrectly can cause classes to behave in an undesirable manner.</p>
 <h1>Liskov Substitution Principle</h1>
 <p>	The base class is the more generalized class, and therefore, its attributes and behaviors should reflect it. The names given to the attributes and methods, as well as the implementation of each method must be broad enough that all subclasses can use them.</p>
 <p>If inheritance is not used correctly, it can lead to a violation of the “Liskov Substitution Principle”. This principle uses substitution to determine whether or not inheritance has been properly used. The Liskov Substitution Principle states that:</p>
 <p><strong><em>If a class, S, is a subtype of a class, B, then S can be used to replace all instances of B without changing the behaviors of a program.</em></strong></p>
 <p>The logic behind this is straightforward. If S is a subtype of B, then it can be expected that S will have the same behaviours as B. Therefore, S can be used in place of B and it would not affect the software. This means that inheritance can be tested by applying substitution.</p>
 <h3>Inheritance Guidelines</h3>
 <p>There are a number of constraints that the Liskov Substitution Principle places on subclasses in order to enforce proper use of inheritance:</p>
 <ol>
  <li>
   <p>The condition used to determine if a base class should or should not invoke a method cannot be "strengthened" by a subclass. That is, a subclass cannot add more conditions to determine if a method should be called.</p>
  </li>
  <li>
   <p>The condition of the program after the execution of a method cannot be "weakened" by a subclass. This means that the subclass should cause the state of the program to be in the same state as the base class after a method call. Subclasses are allowed to "strengthen" the postcondition of a program. For example, if the base class sets an alarm for a specific date, the subclass must do the same, but the result can be more precise by setting the specific hour as well.</p>
  </li>
  <li>
   <p>Invariant conditions that exist in the base class, must also remain invariant in the subclass. Since invariant conditions are expected to be immutable, the subclass should not change them as it may cause a side effect in the behaviours of the base class or the program.</p>
  </li>
  <li>
   <p>Immutable characteristics of a base class must not be changed by the subclass. Since classes can modify their own characteristics, a subclass can modify all the characteristics that it inherits from the base. However, the base class may encapsulate attributes that should be fixed values. These values are identifiable by observing whether or not they are changed in the program, or by a method in the base class. If it is not changed, then these attributes are considered immutable. Subclasses can get around this problem by declaring and modifying their own attributes. The attributes of a subclass are not visible to the base class and therefore, do not affect the behaviour of the base class.</p>
  </li>
 </ol>
 <p>	These rules are not programmatically enforced by any object-oriented language. In fact, overriding a base class's behaviors can have advantages. Subclasses can improve the performance of behaviours of its base class, without changing the expected results of said behavior.</p><p>As as an example, let's take a look at a class that is an abstraction of a department store. The base class may implement a naive searching algorithm that, in the worst case, iterates through the entire list of the items that the store sells. A subclass could override this method and provide a better search algorithm. Although the approach that the subclass takes to searching is different, the expected behavior and outcome is the same.</p>
 <p>The Liskov Substitution Principle helps us determine if inheritance has been used correctly. If the expected behaviour between the subclass and the base class is different, then the principle has been violated.</p>
 </div>
 



<h3>Open/Closed Principle</h3>
The open/closed principle states that classes should be open
for extension but closed to change.
A class is considered “closed” to editing once it has:

● Been tested to be functioning properly. The class should
behave as expected.

● All the attributes and behaviors are encapsulated,

● Been proven to be stable within your system. The class or any instance of the class should not stop your system from running or do it harm.

Although the principle is called “closed”, it does not mean that changes cannot be made to a class during development. Things should change during the design and analysis phase of your development cycle. A “closed” class occurs when a point has been reached in development when most of the design decisions have been finalized and once you have implemented most of your system. During the lifecycle of your software, certain classes should be closed to further changes to avoid introducing undesirable side
effects. A “closed” class should still be fixed if any bugs or unexpected behaviors occur. If a system needs to be extended or have more features added,
then the “open” side of the principle comes into play. An “open” class is one that can still be built upon. There are two different
ways to extend a system with the open principle. The first way is through the inheritance of a superclass. Inheritance can be used to simply extend a class that is
considered closed when you want to add more attributes and behaviors. The subclasses will have the original functions of the superclass, but extra features can be added in the subclasses. This helps preserve the integrity of the superclass, so if the extra features of the subclasses are not needed, the original class can still be used. Note that subclasses can also be extended, so this allows the open/closed principle to continually extend your system as much as desired.
If you want to limit a class so that it is no longer extendable, it can be declared as “final” to prevent further inheritance. This keyword can also be used for methods.
The second way a class can be open is when the class is abstract and enforces the open/closed principle through polymorphism. An abstract class can declare abstract methods
with just the method signatures. Each concrete subclass must provide its own implementation of these methods. The methods in the abstract superclass are preserved, and the
system can be extended by providing different implementations for each method. This is useful for behaviors like sorting or searching.

An interface can also enable polymorphism, but remember that it will not be able to define a common set of attributes. The open/closed principle is used to keep stable parts of a system separate from varying parts. It allows the addition of new features to a system, but without the expense of disrupting working parts. Extension, unlike change, allows
varying parts to be worked upon while avoiding unwanted side effects in the stable parts. Varying parts should be kept isolated from one another, as these extensions will eventually become stable, and there is no guarantee they will all be finished at the same time, as some features may be more
complex, larger, or more ambitious than others. All design patterns use the open/closed principle in some way. They all follow the idea that some part of your system should
be able to extend and be built upon through some means like inheritance or implementing an interface. It may not always be possible to practice this principle, but it is something to strive towards.
The open/closed principle:

● Helps keep a system stable by “closing” classes to change.

● Allows a system to open for extension through inheritance or interfaces.


###State Transition Systems

<div class="cmlToHtml-content-container" style="white-space: pre-wrap"><p>We would like to take this opportunity to briefly discuss state transition systems. Unlike the system architectures that are presented in this course, and describe the design a system, a state transition system is a concept used to describe the behavior of a system. More precisely, all potential behaviors of a system. Even if a specific system state has a low probability of being seen, a state transition system will still describe how that state can be arrived at if it is an expected behavior of the system. </p><h1>State Transition Systems</h1><p>State transition systems are a complex topic in computer science and they play  an important role in helping software architects and software engineers understand how different states can be achieved. The goal of this reading is to provide a coarse overview of what a state transition system is, and how they are used, in order to illustrate why they are important. </p><p>Let's start by defining the terminology that are used when discussing state transition systems.</p><ul><li><p>State. The information that a system remembers defines its state. For example, a queue system can be in a number of different "states": an empty state, a queued state, or a full state.</p></li><li><p>Transition. A transition is used to describe the change of a system from one state to another. A single system state can have multiple transitions; majority of systems today will have multiple transitions branching from one system state. This makes behaviors non-deterministic, since we cannot predict what the next state of the system will be.</p></li><li><p>Behavior. The behavior of a system describes what the system will do when exposed to a condition, which can vary from timed system events to user input.</p></li></ul><p>State transition systems can be labelled or unlabelled.</p><p>An unlabelled state transition system is defined as a set of state, S, and transition, →, pairs that are used to describe the system's behavior. If p and q are two different states in S, then the transition between them is depicted by (p → q)</p><p>A labelled state transition system simple includes a set of labels, ~, with addition to the state-transition pair. Given the same states p and q in S, then the transition between the two states is shown as (p ⭇ q).</p><p>	Unlabelled state transitions can be used for systems where the transition between all states are the same. For example, your system could respond to a single button press that simply transitions the system sequentially from one state to the next.</p><p>	As you can see, state transition systems can be thought of as directed graphs. Each node of the graph represents the set of states, and each edge of the graph represents the set of transition. We can determine how a system reaches a specific state by simply traversing the graph.</p><img src="https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/-Crp4JDiEee3FwonDRqXTA_39c90d09b32552bdc813fc761c3c44b5_Fig-1-State-Transition.png?expiry=1647216000000&amp;hmac=nkLTmvP8xZksr7acvofIVFs0mZtiBfqsKYyO0oAr1lI" alt=""><img src="https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/F7nVXpDjEeeKwBL-JzqIug_737bc4b197dff33895a124d29fcd5917_Fig-1-State-Transition.png?expiry=1647216000000&amp;hmac=TymcGtTYPyknaMZsFA-F-v_gbIg0KatTDCN92swst_Q" alt=""><p>	In figure 1, the queuing system consists of three different states: empty, filled, and full with transitions occurring when objects enter or leave the queue. The transition from the filled state back to itself may seem odd because the graph appears to suggest that a system state can transition back to itself.</p><p>However, what the graph is actually communicating is that the queue is capable of holding many objects at once. If the cyclic transition from the filled state back to itself did not exist, we could infer that the queue would only be able to hold, at most, two objects. The first object to enter the queue would transition the system into the filled state, and a second object would transition the system into the full state. Obviously, this type of queue would be ineffective, therefore, the filled state must be able to accommodate many objects.</p><p>So what are some practical applications for state transition systems? While our example demonstrates a fairly trivial system, most modern systems are much more complex. Consider an operating system and how it needs to manage resource allocation for a large number of processes. A state transition system can help us determine when important system events such as resources are used, what process will be using resources, and how long they will be used for.</p><p>State transition systems can help us understand how parallel processing, multithreading, or distributed computing can affect the overall state of our system. Do we need to wait for another process to finish its work before continuing? At which junction of our system will we be bottlenecked?</p><p>In addition, state transition systems can help us identify deadlocks. A deadlock occurs when a process is waiting indefinitely for another to release a shared resource or complete its work. A state transition system can help you easily identify deadlocks since they occur if there is a condition that prevents a transition out of particular state.</p><p>Modern day software continues to become more complex. Their reliance on computing techniques such as multithreading makes it more difficult to manage system resources, or determine the state that your system is in. State transition systems helps alleviate this issues by modeling the behavior of a system, and gives you a better understanding of how a system will transition from one state to another. </p><p></p><p></p><p></p></div>
