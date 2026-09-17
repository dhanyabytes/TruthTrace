# Class Diagram

```mermaid
classDiagram
class Main {
    +main(String[] args)
}
class TruthTraceGUI {
    +main(String[] args)
    +showHome()
    +showCaseSelection()
    +showDashboard()
}
class CaseManager {
    +loadCase(int choice)
}
class Case {
    -caseId
    -title
    -location
    -description
}
class Suspect {
    -name
    -age
    -role
    -motive
}
class Evidence {
    -description
    -location
    -relevance
}
class Location {
    -name
    -description
}
class Statement {
    -suspect
    -content
}
class TimelineEvent {
    -time
    -description
}
class Investigation {
    +startInvestigation()
    +viewCase()
    +viewSuspects()
    +viewEvidence()
    +investigateLocations()
    +interviewSuspect()
    +viewTimeline()
    +analyzeEvidence()
    +makeFinalDeduction()
}
class Deduction {
    +analyzeCase()
    +determineCulprit()
    +displayFinalResult()
}

Main --> CaseManager
TruthTraceGUI --> CaseManager
CaseManager --> Case
Case "1" o-- "*" Suspect
Case "1" o-- "*" Evidence
Case "1" o-- "*" Location
Case "1" o-- "*" Statement
Case "1" o-- "*" TimelineEvent
Investigation --> Case
Investigation --> Suspect
Investigation --> Evidence
Investigation --> Location
Investigation --> Statement
Investigation --> TimelineEvent
Investigation --> Deduction
Deduction --> Suspect
Deduction --> Evidence
Deduction --> Statement
Deduction --> TimelineEvent
