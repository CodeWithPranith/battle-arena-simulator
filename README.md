# Battle Arena Simulator

A turn-based battle simulator built in Java while practicing Object-Oriented Programming concepts and game logic design.

This project was focused on understanding how multiple classes interact with each other and how reusable systems can be designed using OOP principles.

## Features

* Turn-based combat system
* Multiple playable character classes:

  * Warrior
  * Mage
  * Archer
* Unique abilities for each class
* Random enemy targeting
* Health and healing mechanics
* Winner detection system
* Round-by-round battle simulation

## Character Abilities

### Warrior

Has a chance to partially block incoming damage using a shield.

### Mage

Can occasionally land a critical fireball attack for extra damage.

### Archer

Has a chance to shoot an additional arrow during attacks.

## OOP Concepts Practiced

* Abstract Classes
* Inheritance
* Method Overriding
* Polymorphism
* Encapsulation
* Arrays of Objects
* Runtime Method Dispatch

## How the Battle Works

Every round, each alive character attacks a random valid enemy until only one character remains alive.

The battle flow changes dynamically depending on:

* character abilities,
* random targeting,
* critical hits,
* and remaining health.

## Technologies Used

* Java
* Object-Oriented Programming Principles

## What I Learned

This project helped me better understand:

* designing reusable systems using OOP
* interaction between multiple objects
* game loop logic
* abstraction and inheritance
* organizing larger Java programs into multiple classes

One interesting challenge was managing battle flow while making sure defeated characters could no longer participate in combat.

## Future Improvements

* More character classes
* Mana/Stamina system
* Inventory system
* GUI version
* Multiplayer battles
* Save/Load functionality
