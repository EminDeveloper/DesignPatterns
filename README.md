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

