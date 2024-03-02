# The Decorator Pattern

🤯 The Power of extension at runtime, rather than at compile time.

## Wellcome to Starbuzz Coffee ☕

First design

```mermaid
classDiagram

HoseBlend --|> Beverage
DarkRoast --|> Beverage
Decaf --|> Beverage
Espresso --|> Beverage

class Beverage {
  <<abstract>>
  description
  getDescription()
  cost()
}


class HouseBlend {
  cost()
}

class DarkRoast {
  cost()
}

class Decaf {
  cost()
}

class Espresso {
  cost()
}

```

### Branin Power
If 100 coffee types used milk, then if milk price change, nightmare for maintaince.
What do I do if I want add a new topping ?

Try to add some topping instance variables and redesign

```mermaid
classDiagram

class Beverage {
  description
  milk
  soy
  mocha
  whip

  getDescription()
  cost()
  hasMilk()
  setMilk()
  hasSoy()
  setSoy()
  hasMocha()
  setMocha()
  hasWhip()
  setWhip()
}
```
Above design, subclass not need to override cost() method, the cost() is implemented in base class.

Changes will impact this design
- Price changes for comdiments, force us to alter existing code
- New condiments will be added, must alter base class
- Customer want double mocha
- Some beverages may not be appropriate, Tea has Soy is an example

Inheriatnace is powerfull but it doesn't always lead to the most flexible or maintainable designs.

How to achieve resuse if not through inheritance ?

The ways of inheriting behaviour at runtime through composition and delegation.

- ⚙️ Use inherit behaviour by subclassing, behaviour is set statically at compile time.
- 🦄 Can extend an object's behaviour through composition, then reuse behaviour at runtime.

## The Open-Closed Principle
Classes should be open for extension, but close for modification.

**Decorator pattern**
- Decorators have the same suppertype as the objects they decorate.
- Can use one or more decorators to wrap an object
- Decorators can be passed around.
- The decorator adds its own behavior either before/after delegating to the object it decorates to do the rest of the job.
- Objects can be decorated at any time, so we can decorate objects dynamically at runtime.

**The decorator pattern defined**
The decorator pattern attaches additional responsibilities to and object dynamically. Decoratorsprovide a fexible alternative to subclassing for extending functionality.

```mermaid
classDiagram

ConcreteComponent --|> Component
Decorator --|> Component
ConcreteDecoratorA --|> Decorator
ConcreteDecoratorB --|> Decorator

class Component {
  methodA()
  methodB()
}

class ConcreteComponent {
  methodA()
  methodB()
}

class Decorator {
  methodA()
  methodB()
}

class ConcreteDecoratorA {
  wrappedObj : Component
  methodA()
  methodB()
}

class ConcreteDecoratorB {
  wrappedObj : Component
  methodA()
  methodB()
}

```
Decorators have the same suppertype as the objects they decorate. In here, decorator is Decorator, decorated object is Component.

```mermaid
classDiagram

CondimentDecorator --|> Beverage
HouseBlend --|> Beverage
DarkRoast --|> Beverage
Decaf --|> Beverage
Espresso --|> Beverage
Soy --|> CondimentDecorator
Milk --|> CondimentDecorator
Whip --|> CondimentDecorator
Mocha --|> CondimentDecorator

class Beverage {
  description
  getDescription()
  cost()
}

class CondimentDecorator {
  getDescription()
}

class HouseBlend {
  cost()
}

class DarkRoast {
  cost()
}

class Espresso {
  cost()
}

class Decaf {
  cost()
}

class Milk {
  Beverage beverage;
  cost()
  getDescription()
}

class Soy {
  Beverage beverage;
  cost()
  getDescription()
}

class Whip {
  Beverage beverage;
  cost()
  getDescription()
}

class Mocha {
  Beverage beverage;
  cost()
  getDescription()
}

```