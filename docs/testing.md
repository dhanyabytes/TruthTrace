# Testing Plan

| Test Area | Test | Expected Result |
|---|---|---|
| Case Selection | Select each valid case | Correct case loads |
| Invalid Input | Enter an invalid value | Error is handled without crashing |
| Evidence | Open evidence section | Evidence information is displayed |
| Suspects | Open suspects section | Suspect information is displayed |
| Locations | Open locations section | Location information is displayed |
| Timeline | Open timeline section | Events appear chronologically |
| Interview | Select a suspect | Appropriate interaction appears |
| Deduction | Submit a final deduction | Result is displayed |
| GUI | Navigate home → case → dashboard | Navigation works correctly |

## Non-Functional Checks

- Interface remains responsive during normal use.
- Invalid input does not unexpectedly terminate the application.
- Responsibilities are separated across multiple classes.
- The project remains understandable and maintainable.
