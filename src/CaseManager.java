package src;

public class CaseManager {

    public static Investigation loadCase(int choice) {

        switch (choice) {

            case 1:
                return createNecklaceCase();

            case 2:
                return createPrototypeCase();

            case 3:
                return createResearchFileCase();

            default:
                return null;
        }
    }

    private static Investigation createNecklaceCase() {

        Case caseData = new Case(
                "TT-001",
                "The Missing Necklace",
                "A valuable necklace has disappeared during a gathering at "
                + "Blackwood Mansion. Several people were present, and their "
                + "statements must be compared with the available evidence.",
                "Blackwood Mansion"
        );

        Suspect[] suspects = {

            new Suspect(
                    "Alex Morgan",
                    28,
                    "Personal Assistant",
                    "Library",
                    "Financial problems"
            ),

            new Suspect(
                    "Clara Blackwood",
                    24,
                    "Student / Niece",
                    "Upstairs Bedroom",
                    "Possible inheritance"
            ),

            new Suspect(
                    "Daniel Reed",
                    35,
                    "Security Manager",
                    "Main Entrance",
                    "Access to security information"
            ),

            new Suspect(
                    "Sophie Carter",
                    31,
                    "Event Manager / Guest",
                    "Dining Room",
                    "Jewelry business debt"
            )
        };

        Evidence[] evidence = {

            new Evidence(
                    "E001",
                    "Broken Cabinet Lock",
                    "The lock of the cabinet containing the necklace is damaged.",
                    "Study",
                    "High"
            ),

            new Evidence(
                    "E002",
                    "Black Fabric Fragment",
                    "A small piece of black fabric was found near the cabinet.",
                    "Study",
                    "Medium"
            ),

            new Evidence(
                    "E003",
                    "Muddy Footprint",
                    "A muddy footprint was found near the entrance.",
                    "Main Entrance",
                    "High"
            ),

            new Evidence(
                    "E004",
                    "Open Book",
                    "An open book was found on a table in the library.",
                    "Library",
                    "Low"
            )
        };

        Location[] locations = {

            new Location(
                    "Study",
                    "The room where the necklace was kept inside a cabinet."
            ),

            new Location(
                    "Library",
                    "A quiet room containing books and a table."
            ),

            new Location(
                    "Upstairs Bedroom",
                    "A private bedroom located on the upper floor."
            ),

            new Location(
                    "Dining Room",
                    "The main room where guests gathered."
            ),

            new Location(
                    "Main Entrance",
                    "The entrance area monitored by security."
            )
        };

        Statement[] statements = {

            new Statement(
                    "Alex Morgan",
                    "I was in the library when the necklace disappeared.",
                    "8:25 PM",
                    "Library"
            ),

            new Statement(
                    "Clara Blackwood",
                    "I was upstairs in my bedroom during the incident.",
                    "8:25 PM",
                    "Upstairs Bedroom"
            ),

            new Statement(
                    "Daniel Reed",
                    "I was checking the main entrance during the incident.",
                    "8:25 PM",
                    "Main Entrance"
            ),

            new Statement(
                    "Sophie Carter",
                    "I stayed in the dining room with the other guests.",
                    "8:25 PM",
                    "Dining Room"
            )
        };

        TimelineEvent[] timeline = {

            new TimelineEvent(
                    "8:00 PM",
                    "Guests arrive at the mansion.",
                    "Main Entrance"
            ),

            new TimelineEvent(
                    "8:10 PM",
                    "Rain begins outside.",
                    "Outside"
            ),

            new TimelineEvent(
                    "8:15 PM",
                    "Security camera temporarily stops working.",
                    "Main Entrance"
            ),

            new TimelineEvent(
                    "8:25 PM",
                    "The necklace is last confirmed inside the cabinet.",
                    "Study"
            ),

            new TimelineEvent(
                    "8:30 PM",
                    "A power interruption occurs.",
                    "Mansion"
            ),

            new TimelineEvent(
                    "8:35 PM",
                    "Security camera becomes active again.",
                    "Main Entrance"
            ),

            new TimelineEvent(
                    "8:40 PM",
                    "The necklace is discovered missing.",
                    "Study"
            ),

            new TimelineEvent(
                    "8:45 PM",
                    "The investigation officially begins.",
                    "Study"
            )
        };

        return new Investigation(
                caseData,
                suspects,
                evidence,
                locations,
                statements,
                timeline
        );
    }


    private static Investigation createPrototypeCase() {

        Case caseData = new Case(
                "TT-002",
                "The Vanishing Prototype",
                "An experimental AI device has disappeared from a university "
                + "innovation laboratory. Access records show that several "
                + "people entered the building before the device vanished.",
                "Innovation Laboratory"
        );

        Suspect[] suspects = {

            new Suspect(
                    "Rohan Mehta",
                    22,
                    "Student Researcher",
                    "Testing Room",
                    "Competition pressure"
            ),

            new Suspect(
                    "Meera Shah",
                    27,
                    "Research Assistant",
                    "Research Office",
                    "Career opportunity"
            ),

            new Suspect(
                    "Arjun Verma",
                    34,
                    "Lab Technician",
                    "Equipment Room",
                    "Financial difficulties"
            ),

            new Suspect(
                    "Nisha Kapoor",
                    29,
                    "Project Coordinator",
                    "Main Laboratory",
                    "Access to the prototype"
            )
        };

        Evidence[] evidence = {

            new Evidence(
                    "E101",
                    "Disabled Access Scanner",
                    "The laboratory access scanner stopped recording entries "
                    + "for several minutes.",
                    "Main Laboratory",
                    "High"
            ),

            new Evidence(
                    "E102",
                    "Prototype Carrying Case",
                    "A protective carrying case normally used for the prototype "
                    + "was found near the equipment room.",
                    "Equipment Room",
                    "High"
            ),

            new Evidence(
                    "E103",
                    "USB Storage Device",
                    "A USB device containing project-related files was found "
                    + "inside the testing room.",
                    "Testing Room",
                    "Medium"
            ),

            new Evidence(
                    "E104",
                    "Laboratory Access Log",
                    "The access log shows an unusual entry during the period "
                    + "when the prototype disappeared.",
                    "Main Laboratory",
                    "High"
            )
        };

        Location[] locations = {

            new Location(
                    "Main Laboratory",
                    "The central laboratory containing the prototype."
            ),

            new Location(
                    "Testing Room",
                    "Room used for testing experimental devices."
            ),

            new Location(
                    "Research Office",
                    "Office containing research documents."
            ),

            new Location(
                    "Equipment Room",
                    "Room containing laboratory equipment and storage cases."
            ),

            new Location(
                    "Security Desk",
                    "Area where laboratory access is monitored."
            )
        };

        Statement[] statements = {

            new Statement(
                    "Rohan Mehta",
                    "I was working in the testing room.",
                    "6:20 PM",
                    "Testing Room"
            ),

            new Statement(
                    "Meera Shah",
                    "I was reviewing research documents in my office.",
                    "6:20 PM",
                    "Research Office"
            ),

            new Statement(
                    "Arjun Verma",
                    "I was checking equipment in the equipment room.",
                    "6:20 PM",
                    "Equipment Room"
            ),

            new Statement(
                    "Nisha Kapoor",
                    "I remained in the main laboratory coordinating the project.",
                    "6:20 PM",
                    "Main Laboratory"
            )
        };

        TimelineEvent[] timeline = {

            new TimelineEvent(
                    "6:00 PM",
                    "Researchers leave the main laboratory.",
                    "Main Laboratory"
            ),

            new TimelineEvent(
                    "6:10 PM",
                    "Access scanner begins malfunctioning.",
                    "Security Desk"
            ),

            new TimelineEvent(
                    "6:15 PM",
                    "Prototype is last confirmed on the laboratory table.",
                    "Main Laboratory"
            ),

            new TimelineEvent(
                    "6:20 PM",
                    "An unusual laboratory entry is recorded.",
                    "Main Laboratory"
            ),

            new TimelineEvent(
                    "6:25 PM",
                    "Access scanner starts working again.",
                    "Security Desk"
            ),

            new TimelineEvent(
                    "6:30 PM",
                    "Prototype is discovered missing.",
                    "Main Laboratory"
            ),

            new TimelineEvent(
                    "6:35 PM",
                    "Investigation begins.",
                    "Main Laboratory"
            )
        };

        return new Investigation(
                caseData,
                suspects,
                evidence,
                locations,
                statements,
                timeline
        );
    }


    private static Investigation createResearchFileCase() {

        Case caseData = new Case(
                "TT-003",
                "The Missing Research File",
                "A confidential research file has disappeared from a private "
                + "research office. Several people had access to the building, "
                + "but their statements do not completely agree.",
                "Research Centre"
        );

        Suspect[] suspects = {

            new Suspect(
                    "Kabir Singh",
                    26,
                    "Research Intern",
                    "Digital Archive",
                    "Academic pressure"
            ),

            new Suspect(
                    "Ananya Rao",
                    30,
                    "Research Assistant",
                    "Research Office",
                    "Career advancement"
            ),

            new Suspect(
                    "Vikram Joshi",
                    38,
                    "Systems Administrator",
                    "Server Room",
                    "Access to confidential systems"
            ),

            new Suspect(
                    "Tanya Malhotra",
                    32,
                    "Project Manager",
                    "Conference Room",
                    "Research competition"
            )
        };

        Evidence[] evidence = {

            new Evidence(
                    "E201",
                    "Missing USB Drive",
                    "A USB drive normally used for transferring research files "
                    + "is missing from the office.",
                    "Research Office",
                    "High"
            ),

            new Evidence(
                    "E202",
                    "Computer Login Record",
                    "A research computer was accessed outside the expected "
                    + "working period.",
                    "Research Office",
                    "High"
            ),

            new Evidence(
                    "E203",
                    "Printed Document",
                    "A partial copy of the confidential research file was found "
                    + "inside the conference room.",
                    "Conference Room",
                    "Medium"
            ),

            new Evidence(
                    "E204",
                    "Server Access Alert",
                    "The research server recorded an unusual access request.",
                    "Server Room",
                    "High"
            )
        };

        Location[] locations = {

            new Location(
                    "Research Office",
                    "Office where the confidential file was stored."
            ),

            new Location(
                    "Digital Archive",
                    "Room containing archived research material."
            ),

            new Location(
                    "Server Room",
                    "Restricted area containing research servers."
            ),

            new Location(
                    "Conference Room",
                    "Room used for project meetings."
            ),

            new Location(
                    "Reception",
                    "Main entry and exit area of the research centre."
            )
        };

        Statement[] statements = {

            new Statement(
                    "Kabir Singh",
                    "I was working with archived material.",
                    "5:40 PM",
                    "Digital Archive"
            ),

            new Statement(
                    "Ananya Rao",
                    "I was organizing documents in the research office.",
                    "5:40 PM",
                    "Research Office"
            ),

            new Statement(
                    "Vikram Joshi",
                    "I was checking the server systems.",
                    "5:40 PM",
                    "Server Room"
            ),

            new Statement(
                    "Tanya Malhotra",
                    "I was preparing for a meeting in the conference room.",
                    "5:40 PM",
                    "Conference Room"
            )
        };

        TimelineEvent[] timeline = {

            new TimelineEvent(
                    "5:15 PM",
                    "Research team finishes the scheduled meeting.",
                    "Conference Room"
            ),

            new TimelineEvent(
                    "5:25 PM",
                    "Confidential file is last confirmed in the research office.",
                    "Research Office"
            ),

            new TimelineEvent(
                    "5:30 PM",
                    "Research computer records an unusual login.",
                    "Research Office"
            ),

            new TimelineEvent(
                    "5:35 PM",
                    "Server records an unusual access request.",
                    "Server Room"
            ),

            new TimelineEvent(
                    "5:40 PM",
                    "Staff members report their locations.",
                    "Research Centre"
            ),

            new TimelineEvent(
                    "5:50 PM",
                    "Missing file is discovered.",
                    "Research Office"
            ),

            new TimelineEvent(
                    "5:55 PM",
                    "Investigation begins.",
                    "Research Office"
            )
        };

        return new Investigation(
                caseData,
                suspects,
                evidence,
                locations,
                statements,
                timeline
        );
    }
}