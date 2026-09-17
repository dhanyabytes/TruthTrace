# TruthTrace

## Digital Crime Investigation and Logical Deduction System

TruthTrace is a Java-based digital crime investigation and logical deduction project designed as an interactive, game-like investigation experience.

The player takes the role of an investigator and works through a fictional crime case by examining locations, collecting evidence, interviewing suspects, analyzing the timeline, identifying contradictions, and finally making a deduction.

> **Project Status:** Functional GUI prototype / Academic project

## Problem Statement

Traditional mystery games usually focus mainly on entertainment. TruthTrace combines an engaging detective experience with structured programming concepts such as object-oriented programming, collections, file handling, input validation, modular design, and logical deduction.

## Objectives

- Build an interactive digital crime investigation system using Java.
- Apply object-oriented programming concepts in a meaningful project.
- Investigate locations and collect evidence.
- Store and display suspects, statements, evidence, and events.
- Provide timeline-based investigation and contradiction analysis.
- Allow a final deduction and case result.
- Maintain a modular project structure.

## Main Features

### Case Management
- Load and display fictional crime cases.
- Show case information and investigation objectives.

### Evidence Investigation
- Investigate locations.
- Discover and examine evidence.

### Suspect Investigation
- Display suspect profiles.
- View statements and interview suspects.
- Compare statements with clues.

### Timeline Analysis
- Display important events chronologically.
- Support contradiction analysis.

### Deduction & Case Resolution
- Analyze investigation information.
- Select a suspected culprit.
- Display the final investigation result.

### Graphical User Interface
- Dark detective-style interface using Java Swing.
- Home screen, case selection and investigation dashboard.
- Case, suspect, evidence, location, timeline and deduction sections.

## Case #001 — The Missing Necklace

A fictional investigation involving a missing necklace during a gathering.

### Suspects

| Suspect | Role | Initial Suspicion |
|---|---|---|
| Alex Morgan | Personal Assistant | Financial problems |
| Clara Blackwood | Student / Niece | Possible inheritance motive |
| Daniel Reed | Security Manager | Access to security information |
| Sophie Carter | Event Manager / Guest | Jewelry business debt |

### Investigation Locations

- Study
- Library
- Upstairs Bedroom
- Dining Room
- Main Entrance

### Example Evidence

- Broken cabinet lock
- Black fabric fragment
- Muddy footprint
- Open book
- Coffee cup
- Wet shoes
- Torn black fabric
- Security log
- Empty chair near the window

## Project Structure

```text
TruthTrace/
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
├── data/
├── docs/
│   ├── architecture.md
│   ├── workflow.md
│   ├── use-case.md
│   ├── class-diagram.md
│   ├── sequence-diagram.md
│   └── testing.md
├── README.md
├── statement.md
└── .gitignore
```

## Core Classes

| Class | Responsibility |
|---|---|
| `Main` | Starts the console application |
| `TruthTraceGUI` | Provides the graphical user interface |
| `Case` | Stores case information |
| `Suspect` | Stores suspect details and statements |
| `Evidence` | Represents discovered evidence |
| `Location` | Represents investigation locations |
| `Statement` | Stores suspect statements |
| `TimelineEvent` | Represents chronological events |
| `Investigation` | Controls investigation workflow |
| `Deduction` | Handles deduction and contradiction logic |
| `CaseManager` | Manages case loading and case data |

## Technologies

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
- **GUI:** Java Swing
- **Data Structures:** ArrayList, HashMap and Java collections
- **File Handling:** Java file I/O
- **Input Validation:** Exception handling and validation
- **Version Control:** Git & GitHub
- **Development:** VS Code / JDK

## Java Concepts Applied

- Classes and Objects
- Constructors
- `this` keyword
- Encapsulation
- Methods
- Conditional statements
- Loops
- Strings
- ArrayList / Collections
- HashMap
- File handling
- Exception handling
- Input validation
- Modular class design
- Inheritance / method overriding where appropriate
- Java Swing GUI development

## Investigation Workflow

```text
Start → Load Case → Read Case Information
  → Investigate Locations → Collect Evidence
  → Interview Suspects → Analyze Statements
  → Review Timeline → Identify Contradictions
  → Make Final Deduction → Investigation Result → End
```

Detailed design diagrams are available in [`docs/`](docs/).

## Functional Requirements

1. View a crime case.
2. Provide multiple investigation locations.
3. Discover and collect evidence.
4. Display suspect information and statements.
5. Maintain a chronological timeline.
6. Support comparison of clues and statements.
7. Identify relevant contradictions.
8. Allow a final deduction.
9. Provide a final investigation result.

## Non-Functional Requirements

- **Usability:** Simple and understandable investigation workflow.
- **Maintainability:** Separate classes with clear responsibilities.
- **Reliability:** Invalid input is handled safely.
- **Performance:** Lightweight and responsive operations.
- **Scalability:** Additional cases and entities can be added.
- **Error Handling:** Invalid choices are handled appropriately.

## Testing

Testing covers case loading, suspect data, evidence, locations, statements, timeline ordering, contradiction detection, deduction submission, invalid input, final results, and GUI navigation.

A detailed testing plan is available in [`docs/testing.md`](docs/testing.md).

## Screenshots

Screenshots are optional for the VITyarthi repository and can be added later if desired.

## Documentation

- [System Architecture](docs/architecture.md)
- [Process Workflow](docs/workflow.md)
- [Use Case Diagram](docs/use-case.md)
- [Class Diagram](docs/class-diagram.md)
- [Sequence Diagram](docs/sequence-diagram.md)
- [Testing Plan](docs/testing.md)

## Future Enhancements

- More complex deduction logic
- Additional evidence types
- Advanced contradiction detection
- Save/load investigation progress
- Improved game-like interface
- Difficulty levels
- Case history
- Optional database integration

## Disclaimer

TruthTrace is a fictional crime investigation system created for educational and entertainment purposes. Cases, characters, locations, evidence, and events are fictional.

## Author

**Dhanya Thakur**

B.Tech — Computer Science & Engineering (AI/ML)  
VIT Bhopal University
