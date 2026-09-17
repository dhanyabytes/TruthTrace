# TruthTrace

## Digital Crime Investigation and Logical Deduction System

TruthTrace is a Java-based digital crime investigation system where users investigate fictional cases by examining evidence, reviewing suspect information, exploring locations, analyzing timelines, and making a final deduction.

The project combines Java Object-Oriented Programming concepts with logical reasoning to create an interactive detective-style investigation experience.

---

## Overview

In a crime investigation, information is usually collected from multiple sources such as evidence, suspect statements, locations, and event timelines.

TruthTrace provides a structured digital environment where the user acts as an investigator and works through a case step by step.

The objective is not to provide direct hints or reveal the answer immediately. The investigator must examine the available information, connect the clues, and make a final deduction.

The project currently contains three fictional investigation cases:

- TT-001 - The Missing Necklace
- TT-002 - The Vanishing Prototype
- TT-003 - The Missing Research File

---

## Features

### Case Management
- Multiple fictional investigation cases
- Case selection and loading
- Case-specific investigation data

### Evidence Investigation
- View available evidence
- Examine evidence
- Review evidence locations and importance
- Use evidence while forming a deduction

### Suspect Investigation
- View suspect details
- Review suspect statements
- Interview suspects using case-specific questions

### Location Investigation
- View important investigation locations
- Examine information associated with different locations

### Timeline Analysis
- View important events in chronological order
- Use the timeline to understand the sequence of events

### Logical Deduction
- Analyze evidence and suspect statements
- Identify contradictions and relevant clues
- Make a final accusation
- Receive the final investigation result

### Graphical User Interface
- Interactive case selection
- Investigation dashboard
- Evidence, suspect, location and timeline sections
- Final deduction interface
- Dark detective-style interface

---

## Technologies / Tools Used

- Java
- Object-Oriented Programming
- Java Collections
- ArrayList
- HashMap
- Exception Handling
- Input Validation
- Java Swing
- File Handling
- Git
- GitHub
- Visual Studio Code
- JDK 17

---

## Java Concepts Applied

The project demonstrates practical use of:

- Classes and Objects
- Constructors
- Parameterized Constructors
- `this` keyword
- Encapsulation
- Methods
- Conditional Statements
- Loops
- Strings
- ArrayList / Collections
- HashMap
- File Handling
- Exception Handling
- Input Validation
- Modular Class Design
- Inheritance and Method Overriding where applicable
- Graphical User Interface development using Java Swing

---

## Project Structure

```text
TruthTrace/
│
├── src/
│   ├── Main.java
│   ├── TruthTraceGUI.java
│   ├── Case.java
│   ├── CaseManager.java
│   ├── Suspect.java
│   ├── Evidence.java
│   ├── Location.java
│   ├── Statement.java
│   ├── TimelineEvent.java
│   ├── Investigation.java
│   └── Deduction.java
│
├── data/
│
├── README.md
└── statement.md
