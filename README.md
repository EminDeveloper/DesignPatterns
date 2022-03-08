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


### Singleton Pattern

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.


### Factory Method Pattern
----------------------

## Structural Patterns:

### Facade Pattern

### Adapter Pattern

### Composite Pattern

### Proxy Pattern

### Decorator Pattern

--------------------------

## Behavioural Patterns:

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
