# WhatDay

This simple Android app asks the user for a date in the Gregorian calendar and returns the day of the week for that date.

a)

Project Name: "Assignment 1: What Day App"
Name: Aman Sharma
BITS ID: 2019A7PS0053G
Email: f20190053@goa.bits-pilani.ac.in


b)

Whatday is a simple app tells the user what day of the week it was on a certain date. There are three input fields for date, month and year. There is a check button which returns the day or error message as output in another text field.

No known bugs.

c) 

Task 1: Used Integer.parseInt() function in java to convert input strings to integers. Used exceptions for cases where input strings are not integers. Used if-else statements to to check for invalid inputs. Then used a used a function to convert date to day (Source: https://www.geeksforgeeks.org/find-day-of-the-week-for-a-given-date/).

Task 2: Create an onClick method for the Check button. When the button is clicked, the function grabs the strings for date, month and year from the text fields and calls the DateModel.initialize() method. Then it calls the DateModel.getMessage() method to get the day or error message and updates the output field with it.

Task 3: TalkBack: The app was mostly usable with talkback. I had problems while using the keyboard for input because the keyboard works with single click input instead of the double click input.

Accessibility Scanner: The accessibility scanner pointed out some size and contrast issues. I fixed the size issue by giving the fields a minimum height attribute. I changed the color for the hints to address the contrast issue.

d)

I did use the test driven development approach. I added a few test cases first. Then I worked on making if-else cases to catch inputs with invalid dates. Then I added the main function which returns the day. This approach was convenient as while programming I had a very clear idea of what was expected. No monkey tool. No app crashes.

e) 5

f) 7
