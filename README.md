# Design Pattern - Singleton Pattern

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
































#Template Method Pattern

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
