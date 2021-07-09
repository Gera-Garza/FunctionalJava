# General info
This is the repository for the course of Functional java with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Summary](#summary)
> * [Pure_Function](#pure_function)
> * [Integration](#integration)
> * [Functinoal](#functional)
> * [End_to_end](#end_to_end)
> * [Stress](#stress)

Project is created with:
* IntelliJ IDEA
> * With openJDK 1.8 
> * With the module of Junit

	
## Setup
Install [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Summary
In this course talk about all what can be done and some benefits from using Test it is recommended to use automated test rather than manual testing, there are severals kinds of thest the [Unitary](#unitary), [Integration](#integration), [Functinoal](#functional), [End_to_end](#end_to_end) and [Stress](#stress) test next I will talk more about them. Some benefits that have doing testing are for example, checking that we really complete the requirements, it helps with the documentation, improves our confidence and well its a tool that adds value as a developer.

### Pure_Functino
Its when you have a predictable result, the result always be the same by receiving the same parameters.
```java
sum(5,3);
```
### Inpure_Function
Integration test are for example when in a class your are trying to connect to a Data Base or an API you are testing that integration. or maybe when you are testing how they connect with diferent modules in your app.
```java

```
### Lambda
Its a anonymous function,its a function that have a unique use behaviour, it could be a rule that only is required in a single place, or a extremly simple funciton.

### Immutability
It could be a varible or class and this propertie is very helpful this are some pros and cons about using inmutability
Pros: 
* Once created it cannot be altered
* Make easier to create pure functions
* It make it easier to use threads or concurrency

Cons:
* If you need to modify or alter the data you will need to instanciate for each time you want to modify it.
* It require a special atention to design

Example
By using Final you make it read-only kind of variable or class 
```java
final myVar = new ArrayList<String>();
myVar = Collections.emptyList(); 
```
### Stress
This is a common test by testing the capacity of the program by supporting many scenarios.

