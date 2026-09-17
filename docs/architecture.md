# System Architecture

TruthTrace uses a modular object-oriented architecture separating the interface, case entities, investigation control and deduction logic.

```mermaid
flowchart TD
    U[Investigator / Player]
    U --> UI[TruthTraceGUI]
    U --> CLI[Main Console Interface]
    UI --> CM[CaseManager]
    CLI --> CM
    CM --> C[Case]
    C --> S[Suspect]
    C --> E[Evidence]
    C --> L[Location]
    C --> ST[Statement]
    C --> T[TimelineEvent]
    CLI --> I[Investigation]
    I --> S
    I --> E
    I --> L
    I --> ST
    I --> T
    I --> D[Deduction]
    D --> S
    D --> E
    D --> ST
    D --> T
    D --> R[Final Investigation Result]
```

## Main Layers

### Presentation Layer
- `TruthTraceGUI`
- `Main`

### Case/Data Layer
- `Case`
- `CaseManager`
- `Suspect`
- `Evidence`
- `Location`
- `Statement`
- `TimelineEvent`

### Investigation Logic Layer
- `Investigation`
- `Deduction`
