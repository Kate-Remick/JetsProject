# JetsProject

## Description

This is a program that reads data from a text file to create an array list of "jets", of three different types and each with their own data. After creating the list of jets from the data, the user may select from a number of options to view data about the jets, simulate dogfights, passenger flights and cargo transport. Each type of jet has its' own unique behavior that can be called on and demonstrated from the menu.

## Tools Used

* Java
* Git
* Google
* Eclipse

## Lessons Learned

* This weeks project took cumulative knowledge from the last three weeks and put it into practice. I focused on implementing interfaces, utilizing inheritance and polymorphism to create a list of jets that the user can interact with, to include adding and removing objects.

* The most significant hurdle I came across during construction was using the buffered reader. I had an error that caused an infinite loop in the instantiation of the "AirField" class. This was because of how I had my buffered reader / while loop constructed. After some investigation with System.out.println(), I found the root of the issue and fixed it.  
