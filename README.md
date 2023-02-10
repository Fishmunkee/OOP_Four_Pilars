# OOP_Four_Pillars ⛩

P.S Pillars is spelt wrong in the repo name.

## Included in this Four Pillars of OOP example:
- A main class for calling other class methods and creating new class objects.
- An abstract 'Enemy' class that will be our base class, for which other classes will extend from. It will contains methods in here to simplify the experience in Main.
- A werewolf class that extends the 'Enemy' class, in here we are overriding the talk method from Enemy and extending the method to the needs of werewolf. In this case, changing what a werewolf says.
- A wraith class that also extends from the 'Enemy' class that performs the same function.


### Abstraction
- Our Enemy class is abstract and provides the talk method for other sub-classes to utilise.

### Polymorphism
- We have two enemy sub-classes that can each change the form of the talk class to their own specifications.

### Inheritance
- Our Enemy class provides the method talk that can be reused and inherited by sub-classes.

## Encapsulation
- Our Enemy class has a private int health (we don't want users to change this), so using getters and setters we can set and get health in the Main class.

Thanks!
