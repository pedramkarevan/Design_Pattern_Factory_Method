# Design_Pattern_Factory_Method

Factory Method Design Pattern
It is a creational design pattern; We want to move the object creation logic from our code to a separate class. It is similar to simple factory but it will add something new to this pattern.
We use this pattern when do not know in advance which class we need to instantiate and also allow new classes to be added to system and handle their creation without affecting client code. It could be achieved by subclasses and they decide which object should be instantiated by overriding the factory method.
UML Diagram:
 
We have product class and it is an interface or base class of products created by factory method. That means that we are going to create object of subclasses of this product interface.
Then we have the actual concrete product which implement the interface. Then we have our creator and this particular class declares the abstract factory method and additionally this class use abstract method and create the final product instance.
The concrete classes of this abstract class implement and override the factory method and return one of the concrete other classes related to implementation of product interface.

Step by step Implementation:

  1-	Start by creating our creator class
    a.	It could be abstract or concrete if it provides a default object.
    b.	Implementation override the method and return an object.

Implementation Consideration:
  -	Creator could be abstract or concrete if it provides a "default” object.
  -	We can use simple factory way of accepting additional arguments to choose between object types.

Design Consideration:
  -	We typically end up with a creator per object type. It means that the creator hierarchy reflects product hierarch.
  -	“Template” design pattern often makes use factory design pattern
  -	“Abstract factory” also often use factory design pattern
  
Pitfalls:
  -	More complex to implement and need to unit testing.
  -	You have to start with this pattern from beginning. It is not easy to refactor existing code into factory method pattern.
  -	Sometimes this pattern forces you to subclass just to create appropriate instance.
