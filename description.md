# Assignment 3 - Object Oriented Programming
## Overview
In this assignment you will work with a design created from the requirements in assignment 2. You will be presented with the design documentation, the partial implementation, and automatic test cases. 

Your first task in this assignment is to implement the missing parts of the code-base according to the automatic unit tests. When the tests are passing you are done.

The second task in this assignment is to reflect on your design as done in assignment 2 and write a short report with your thoughts.

As usual you are encouraged to commit and push often. We want to see an evolution of the solution not a big bang commit at the end.

## Task 1 - Working with a design and implementation
### Automatic Unit tests
To build confidence in that our system works as expected after successfull compilation we can run code that test the classes on our own code. Such test code is called unit tests, often we use some framework that can automatically execute our tests and report back any issues. In such cases we talk about automatic unit tests. We will not go deeper in to this for the assignment other than that you will get a number of unit tests and these should be passing when handing in. Basically you take a look at the first test case, change/add to the implementation so that the test case works (you do not change the test case).

The test are located in `app/src/test` and usually follows the same package structure as the main source code. Note that this means that test code is located in the same package as the main code (even if they have some parent folder that is not the same). This makes it possible for test code to access anything that is declared as `protected` and not only public `public`.

The unit tests are of course executed as part of the automatic pipeline and when build using gradlew.

### Passing Grade Task
1. Study the design available in `design.md`
2. Check the test cases in `src/test/monopoly/TierOneTests.java`
3. Uncomment one test case, work from the top to the bottom
4. Run `./gradlew build` - test should fail (note that when you have started to make fixes the test case may succeed, and vice versa an old test case may stop working if you introduce some problem in your fixes)
5. Fix the corresponding implementation. Note that the `Tile` class should not contain any extra fields, or its constructor need any complex logic as looping or if statements to work. Use object diagram sketches to figure out how the links between the objects need to change.
6. Run `./gradlew build` - repeat from 3 as long as the test fails
7. commit, push
8. If there are more test cases left goto 3
9. Run the game and make sure it is playable. You can probably use your IDE to start the game, or alternatively use gradle: `./gradlew run -q --console=plain`
10. You are done for the passing grade and can run/play the game (this can be done all the time but there will be a null pointer exception until the first Tile constructor is fixed, this is the first test case). 

### Higher Grade Tasks
For higher grades you need to add a computer "AI" player.
1. Implement at least one Computer player, avoid code duplication and use the existing design. The computer player does not need to be smart in any way, it can act on random (you can even have several types of players and then pit them against each other)
2. Make sure the game is playable.
3. Update the class diagram with the changes save as `img/updated_class_diagram.jpg`
4. Update design.md to show this new class diagram.
  

### Notes
Depending on IDE you may be able to run the test cases directly in the IDE, but make sure everything works by using `./gradlew build` as often as possible.

You can [download the monopoly model xml](./oop_monopoly.xmi) and use that as a base for the higer grade changes. Possibly your tool allows you to import it.

### GenMyModel Import instructions
** It seems that importing to GenMyModel does not work anymore, but you are free to try **
Thanks to Alija Levic
1. Download oop_monopoly.xmi file from GitLab
2. Press New Project on GenMyModel
3. Press UML on Project Selection
4. Press middle option "Import XMI"
5. Choose file.
6. Put a valid project name.
7. Make sure visibility on project is private.
8. Import
9. Access it

## Task 2 - Reflecting on Initial Design
The final step of the assignment is to reflect on your intended design from assignment 2 and compare it with the working design presented in this assignment.

You work on the report in the main branch. Your report should be structured as a markdown formatted file called `report.md` located in the report folder. Feel free to use the intended design images or make new ones if needed. You should reflect on the following:

- Are there any classes missing in your design, why/why not?
- Did you have any extra classes in your design, why/why not?
- Are there differences in naming the classes? How should classes be named?
- Are there differences in the relations between the classes?
- Did you connect the objects using dependency/association or did you use id-connections?
- Did you manage to divide the complexity/behaviour into different classes or do you have one central class having most of the code?
- What differences are there for the object diagram?
- What differences are there for the sequence diagram?
- Do you think you made a good job in your initial design, why/why not?
- What is the most important thing you learned by designing first?

The text should be argumentative/reasoning/flowing, i.e it is more than just answering the questions above and **not** a simple list of answers. Feel free to use references to litterature to support your arguments.


## Grading
The assignment will be graded in A-F. The lower passing grades (E-C) is achieved when all the test cases in `TierOneTests` are passing, the code is good, and the report has acieved a sufficient standard. The grades C-A when also the extra task as described in assignment is done and the report has achieved a high standard. Note that you are allowed some quality problems in your code but they will affect the grading.


## Handing In the Assignment
Follow the general guidelines for handing in the assignment.

