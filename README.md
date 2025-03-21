# Assignment 1 - Unit Testing (Triangle Program)

This project is part of **MSSE640 - Software Quality and Testing** at Regis University.

## Overview

The goal of this assignment is to implement a Java program that determines the type of triangle based on the lengths of its three sides. The program identifies triangles as **equilateral**, **isosceles**, or **scalene**.

The assignment also emphasizes robust error handling and comprehensive unit testing using **JUnit**.

## Features

- Accepts input for the three sides of a triangle.
- Determines and returns the triangle type:
    - **Equilateral**: All sides equal
    - **Isosceles**: Two sides equal
    - **Scalene**: All sides different
- Handles invalid input cases such as:
    - Zero or negative side lengths
    - Violation of the triangle inequality rule
- Uses **custom exceptions** and/or **logical validation** for "rainy day" scenarios.

## Unit Testing

JUnit tests are included to verify program correctness and handle edge cases:

- Test for a valid **scalene** triangle
- Test for the same scalene triangle with side permutations
- Test for invalid triangles (e.g., side with zero or negative length)

Tests are located in the `test` directory and can be run using IntelliJ's built-in JUnit runner.

---

**IDE:** IntelliJ IDEA  
**Language:** Java  
**Testing Framework:** JUnit  
