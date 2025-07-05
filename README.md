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
   git clone https://github.com/<your-username>/Incubyte-TDD-String-Calculator-Kata.git
   cd Incubyte-TDD-String-Calculator-Kata
   ````
2. Build and run tests:

   ```bash
   mvn clean test
   ```

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

## 👨‍💻 Author

**<Yash_Sojitra>**
Feel free to connect on [LinkedIn](https://www.linkedin.com/in/yash-sojitra-918107256)!

