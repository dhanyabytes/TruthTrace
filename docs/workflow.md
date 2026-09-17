# Process Workflow

```mermaid
flowchart TD
    A([Start]) --> B[Open TruthTrace]
    B --> C[Select a Case]
    C --> D[Read Case Information]
    D --> E[Investigate Locations]
    E --> F[Discover and Examine Evidence]
    F --> G[Review Suspects]
    G --> H[Interview Suspects]
    H --> I[Analyze Statements]
    I --> J[Review Timeline]
    J --> K[Connect Clues and Identify Contradictions]
    K --> L[Make Final Deduction]
    L --> M{Deduction Correct?}
    M -->|Yes| N[Display Case Resolution]
    M -->|No| O[Display Incorrect Result]
    N --> P([End])
    O --> P
```

## Workflow Description

1. Open TruthTrace.
2. Select a fictional investigation case.
3. Read the case information.
4. Investigate locations.
5. Discover and examine evidence.
6. Review and interview suspects.
7. Analyze statements.
8. Review the timeline.
9. Connect clues and identify contradictions.
10. Make the final deduction.
11. Display the investigation result.
