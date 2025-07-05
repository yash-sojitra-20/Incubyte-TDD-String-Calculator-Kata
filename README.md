# String Calculator TDD Kata

This repository contains my implementation of the classic **String Calculator Kata**, built using Test-Driven Development (TDD) in Java with JUnit 5.  
This project was created as part of the Incubyte TDD Assessment.

---

## 📖 Problem Statement

Implement a `StringCalculator` class with an `add(String numbers)` method that:
- Returns the sum of comma-separated numbers in a string.
- Supports:
  - Empty string → returns 0
  - Single number → returns the number itself
  - Multiple comma-separated numbers → returns their sum
  - Newlines (`\n`) as additional delimiters
  - Custom delimiters defined in the format `//[delimiter]\n[numbers...]`
  - Throws an exception listing all negative numbers if any are present

---

## 🚀 How to Run Tests

Make sure you have Java (17+) and Maven installed.

1. Clone the repository:
   ```bash
   git clone https://github.com/yash-sojitra-20/Incubyte-TDD-String-Calculator-Kata.git
   cd Incubyte-TDD-String-Calculator-Kata
   ````
2. Build and run tests:

   ```bash
   mvn clean test
   ```

---

## 🤔 Why is there no `main()` method?

This project is built using **Test-Driven Development (TDD)** where requirements are expressed as automated unit tests.

* In TDD, the tests themselves are the entry point: JUnit runs each `@Test` method without needing a `main()` method.
* This is intentional: for libraries or katas, you don’t need a standalone entry point.
* However, if you’d like to manually test your calculator outside of the tests, you can absolutely add a `Main` class.

---

## 🛠️ Optional Main Method

Here’s how you can add a `Main.java` file to manually run your calculator:

**Folder structure:**

```
src/
└── main/
    └── java/com/example/calculator/
        ├── StringCalculator.java
        ├── StringCalculatorImpl.java
        └── Main.java   ← create this file here
```

**Main.java example:**

```java
package com.example.calculator;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculatorImpl();

        String input = "1,2,3";
        int result = calculator.add(input);

        System.out.println("Sum of \"" + input + "\" is: " + result);
    }
}
```

You can run it directly in IntelliJ (right-click → Run Main.main()) or via Maven if you set up an execution plugin.

---

## ✅ Features Implemented

* ✔️ Returns 0 for empty string
* ✔️ Returns single number as sum
* ✔️ Handles two comma-separated numbers
* ✔️ Handles multiple comma-separated numbers
* ✔️ Supports both commas and newlines as delimiters
* ✔️ Supports custom single-character delimiters specified with `//[delimiter]\n`
* ✔️ Throws an exception with a list of negative numbers

---

## 🔨 Tech Stack

* **Language:** Java
* **Build Tool:** Maven
* **Testing Framework:** JUnit 5

---

## 📂 Project Structure

```
src/
├── main/
│   └── java/com/yourname/calculator/
│       ├── StringCalculator.java
│       └── StringCalculatorImpl.java
└── test/
    └── java/com/yourname/calculator/
        └── StringCalculatorTest.java
```

---
---

## 👨‍💻 Author

**<Yash_Sojitra>**

<a href="https://www.linkedin.com/in/yash-sojitra-918107256/" target="_blank">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/linkedin/linkedin-original.svg" alt="LinkedIn" width="24" />
</a>
