package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TruthTraceGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    private Color background = new Color(18, 18, 24);
    private Color panelColor = new Color(28, 28, 38);
    private Color accent = new Color(180, 150, 90);
    private Color textColor = new Color(235, 235, 235);
    private Color secondaryText = new Color(170, 170, 180);

    private int selectedCase = 0;

    public TruthTraceGUI() {

        setTitle("TruthTrace - Digital Crime Investigation");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.setBackground(background);

        mainPanel.add(createHomePanel(), "HOME");
        mainPanel.add(createCasePanel(), "CASES");
        mainPanel.add(createDashboardPanel(), "DASHBOARD");

        add(mainPanel);

        cardLayout.show(mainPanel, "HOME");
    }

    // ================= HOME SCREEN =================

    private JPanel createHomePanel() {

        JPanel panel = new JPanel();
        panel.setBackground(background);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;

        JLabel title = new JLabel("TRUTHTRACE");
        title.setForeground(accent);
        title.setFont(new Font("Serif", Font.BOLD, 54));

        JLabel subtitle = new JLabel("DIGITAL CRIME INVESTIGATION");
        subtitle.setForeground(textColor);
        subtitle.setFont(new Font("SansSerif", Font.BOLD, 18));

        JLabel description = new JLabel(
                "Investigate. Connect the clues. Find the truth."
        );
        description.setForeground(secondaryText);
        description.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton startButton = createButton("START INVESTIGATION");

        startButton.addActionListener(e ->
                cardLayout.show(mainPanel, "CASES")
        );

        gbc.gridy = 0;
        panel.add(title, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(5, 0, 5, 0);
        panel.add(subtitle, gbc);

        gbc.gridy = 2;
        gbc.insets = new Insets(5, 0, 30, 0);
        panel.add(description, gbc);

        gbc.gridy = 3;
        panel.add(startButton, gbc);

        return panel;
    }

    // ================= CASE SELECTION =================

    private JPanel createCasePanel() {

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(background);

        JLabel heading = new JLabel("SELECT CASE");
        heading.setForeground(accent);
        heading.setFont(new Font("Serif", Font.BOLD, 32));
        heading.setBorder(BorderFactory.createEmptyBorder(25, 35, 20, 0));

        panel.add(heading, BorderLayout.NORTH);

        JPanel casesPanel = new JPanel(new GridLayout(3, 1, 15, 15));
        casesPanel.setBackground(background);
        casesPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 100, 30, 100)
        );

        JButton case1 = createCaseButton(
                "TT-001",
                "THE MISSING NECKLACE",
                "Blackwood Mansion"
        );

        JButton case2 = createCaseButton(
                "TT-002",
                "THE VANISHING PROTOTYPE",
                "Innovation Laboratory"
        );

        JButton case3 = createCaseButton(
                "TT-003",
                "THE MISSING RESEARCH FILE",
                "Research Centre"
        );

        case1.addActionListener(e -> openCase(1));
        case2.addActionListener(e -> openCase(2));
        case3.addActionListener(e -> openCase(3));

        casesPanel.add(case1);
        casesPanel.add(case2);
        casesPanel.add(case3);

        panel.add(casesPanel, BorderLayout.CENTER);

        JButton back = createButton("BACK");

        back.addActionListener(e ->
                cardLayout.show(mainPanel, "HOME")
        );

        JPanel bottom = new JPanel();
        bottom.setBackground(background);
        bottom.add(back);

        panel.add(bottom, BorderLayout.SOUTH);

        return panel;
    }

    // ================= DASHBOARD =================

    private JPanel createDashboardPanel() {

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(background);

        JLabel heading = new JLabel("INVESTIGATION DASHBOARD");
        heading.setForeground(accent);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        heading.setBorder(
                BorderFactory.createEmptyBorder(20, 30, 20, 0)
        );

        panel.add(heading, BorderLayout.NORTH);

        JPanel buttons = new JPanel(new GridLayout(2, 3, 18, 18));
        buttons.setBackground(background);
        buttons.setBorder(
                BorderFactory.createEmptyBorder(20, 50, 20, 50)
        );

        JButton caseFile = createMenuButton("CASE FILE");
        JButton suspects = createMenuButton("SUSPECTS");
        JButton evidence = createMenuButton("EVIDENCE");
        JButton locations = createMenuButton("LOCATIONS");
        JButton timeline = createMenuButton("TIMELINE");
        JButton deduction = createMenuButton("MAKE DEDUCTION");

        caseFile.addActionListener(e ->
                showInfo("CASE FILE", getCaseDescription())
        );

        suspects.addActionListener(e ->
                showInfo("SUSPECTS", getSuspects())
        );

        evidence.addActionListener(e ->
                showInfo("EVIDENCE", getEvidence())
        );

        locations.addActionListener(e ->
                showInfo("LOCATIONS", getLocations())
        );

        timeline.addActionListener(e ->
                showInfo("TIMELINE", getTimeline())
        );

        deduction.addActionListener(e ->
                makeDeduction()
        );

        buttons.add(caseFile);
        buttons.add(suspects);
        buttons.add(evidence);
        buttons.add(locations);
        buttons.add(timeline);
        buttons.add(deduction);

        panel.add(buttons, BorderLayout.CENTER);

        JButton exit = createButton("EXIT");

        exit.addActionListener(e -> System.exit(0));

        JPanel bottom = new JPanel();
        bottom.setBackground(background);
        bottom.add(exit);

        panel.add(bottom, BorderLayout.SOUTH);

        return panel;
    }

    // ================= OPEN CASE =================

    private void openCase(int caseNumber) {

        selectedCase = caseNumber;

        JOptionPane.showMessageDialog(
                this,
                "Case loaded successfully.\n\n"
                        + "Your investigation begins now.\n"
                        + "Examine the evidence carefully and question the suspects.",
                "Case Loaded",
                JOptionPane.INFORMATION_MESSAGE
        );

        cardLayout.show(mainPanel, "DASHBOARD");
    }

    // ================= CASE DATA =================

    private String getCaseDescription() {

        if (selectedCase == 1) {

            return "<html><h2>TT-001 — The Missing Necklace</h2>"
                    + "<p><b>Location:</b> Blackwood Mansion</p>"
                    + "<p>The valuable necklace disappeared from the Study "
                    + "during an evening gathering.</p>"
                    + "<p><b>Last confirmed:</b> 8:25 PM</p>"
                    + "<p><b>Discovered missing:</b> 8:40 PM</p></html>";

        } else if (selectedCase == 2) {

            return "<html><h2>TT-002 — The Vanishing Prototype</h2>"
                    + "<p><b>Location:</b> Innovation Laboratory</p>"
                    + "<p>A confidential prototype has disappeared from "
                    + "the laboratory.</p>"
                    + "<p>Investigate access records, evidence and suspect statements.</p></html>";

        } else {

            return "<html><h2>TT-003 — The Missing Research File</h2>"
                    + "<p><b>Location:</b> Research Centre</p>"
                    + "<p>A confidential research file has disappeared.</p>"
                    + "<p>Find the person responsible by connecting the evidence.</p></html>";
        }
    }

    private String getSuspects() {

        if (selectedCase == 1) {

            return "<html>"
                    + "<h2>Suspects</h2>"
                    + "<p>• Alex Morgan — Personal Assistant</p>"
                    + "<p>• Clara Blackwood — Student / Niece</p>"
                    + "<p>• Daniel Reed — Security Manager</p>"
                    + "<p>• Sophie Carter — Event Manager / Guest</p>"
                    + "</html>";

        } else if (selectedCase == 2) {

            return "<html>"
                    + "<h2>Suspects</h2>"
                    + "<p>• Rohan Mehta</p>"
                    + "<p>• Meera Shah</p>"
                    + "<p>• Arjun Verma</p>"
                    + "<p>• Nisha Kapoor</p>"
                    + "</html>";

        } else {

            return "<html>"
                    + "<h2>Suspects</h2>"
                    + "<p>• Kabir Singh</p>"
                    + "<p>• Ananya Rao</p>"
                    + "<p>• Vikram Joshi</p>"
                    + "<p>• Tanya Malhotra</p>"
                    + "</html>";
        }
    }

    private String getEvidence() {

        if (selectedCase == 1) {

            return "<html>"
                    + "<h2>Evidence</h2>"
                    + "<p>🔎 Broken Cabinet Lock — Study</p>"
                    + "<p>🔎 Black Fabric Fragment — Study</p>"
                    + "<p>🔎 Muddy Footprint — Main Entrance</p>"
                    + "<p>🔎 Open Book — Library</p>"
                    + "</html>";

        } else if (selectedCase == 2) {

            return "<html>"
                    + "<h2>Evidence</h2>"
                    + "<p>🔎 Disabled Access Scanner</p>"
                    + "<p>🔎 Prototype Carrying Case</p>"
                    + "<p>🔎 USB Storage Device</p>"
                    + "<p>🔎 Laboratory Access Log</p>"
                    + "</html>";

        } else {

            return "<html>"
                    + "<h2>Evidence</h2>"
                    + "<p>🔎 Missing USB Drive</p>"
                    + "<p>🔎 Computer Login Record</p>"
                    + "<p>🔎 Printed Document</p>"
                    + "<p>🔎 Server Access Alert</p>"
                    + "</html>";
        }
    }

    private String getLocations() {

        if (selectedCase == 1) {

            return "<html>"
                    + "<h2>Locations</h2>"
                    + "<p>Study</p>"
                    + "<p>Library</p>"
                    + "<p>Upstairs Bedroom</p>"
                    + "<p>Dining Room</p>"
                    + "<p>Main Entrance</p>"
                    + "</html>";

        } else if (selectedCase == 2) {

            return "<html>"
                    + "<h2>Locations</h2>"
                    + "<p>Main Laboratory</p>"
                    + "<p>Testing Room</p>"
                    + "<p>Research Office</p>"
                    + "<p>Equipment Room</p>"
                    + "<p>Security Desk</p>"
                    + "</html>";

        } else {

            return "<html>"
                    + "<h2>Locations</h2>"
                    + "<p>Research Office</p>"
                    + "<p>Digital Archive</p>"
                    + "<p>Server Room</p>"
                    + "<p>Conference Room</p>"
                    + "<p>Reception</p>"
                    + "</html>";
        }
    }

    private String getTimeline() {

        if (selectedCase == 1) {

            return "<html>"
                    + "<h2>Timeline</h2>"
                    + "<p>8:00 PM — Guests arrive</p>"
                    + "<p>8:10 PM — Rain begins</p>"
                    + "<p>8:15 PM — Security camera stops</p>"
                    + "<p>8:30 PM — Power interruption</p>"
                    + "<p>8:35 PM — Camera becomes active again</p>"
                    + "</html>";

        } else if (selectedCase == 2) {

            return "<html>"
                    + "<h2>Timeline</h2>"
                    + "<p>6:00 PM — Laboratory activity begins</p>"
                    + "<p>6:10 PM — Prototype examined</p>"
                    + "<p>6:15 PM — Access scanner issue detected</p>"
                    + "<p>6:30 PM — Prototype reported missing</p>"
                    + "</html>";

        } else {

            return "<html>"
                    + "<h2>Timeline</h2>"
                    + "<p>5:00 PM — Research work begins</p>"
                    + "<p>5:25 PM — File last confirmed</p>"
                    + "<p>5:40 PM — Server access detected</p>"
                    + "<p>6:00 PM — File reported missing</p>"
                    + "</html>";
        }
    }

    // ================= DEDUCTION =================

    private void makeDeduction() {

        String[] suspects;

        if (selectedCase == 1) {

            suspects = new String[]{
                    "Alex Morgan",
                    "Clara Blackwood",
                    "Daniel Reed",
                    "Sophie Carter"
            };

        } else if (selectedCase == 2) {

            suspects = new String[]{
                    "Rohan Mehta",
                    "Meera Shah",
                    "Arjun Verma",
                    "Nisha Kapoor"
            };

        } else {

            suspects = new String[]{
                    "Kabir Singh",
                    "Ananya Rao",
                    "Vikram Joshi",
                    "Tanya Malhotra"
            };
        }

        String selected = (String) JOptionPane.showInputDialog(
                this,
                "Who do you accuse?\n\nChoose carefully. There is no hint.",
                "Final Deduction",
                JOptionPane.QUESTION_MESSAGE,
                null,
                suspects,
                suspects[0]
        );

        if (selected == null) {
            return;
        }

        String culprit = getCulprit();

        if (selected.equals(culprit)) {

            JOptionPane.showMessageDialog(
                    this,
                    "✓ CORRECT DEDUCTION\n\n"
                            + "Your investigation led to the correct suspect.\n\n"
                            + "The case has been solved.",
                    "CASE SOLVED",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "✗ INCORRECT DEDUCTION\n\n"
                            + "Your accusation does not match the evidence.\n\n"
                            + "Review the case and try again.",
                    "CASE UNSOLVED",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    private String getCulprit() {

        if (selectedCase == 1) {
            return "Sophie Carter";
        } else if (selectedCase == 2) {
            return "Arjun Verma";
        } else {
            return "Tanya Malhotra";
        }
    }

    // ================= UI HELPERS =================

    private JButton createButton(String text) {

        JButton button = new JButton(text);

        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.setForeground(textColor);
        button.setBackground(panelColor);
        button.setFocusPainted(false);
        button.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(accent, 1),
                        BorderFactory.createEmptyBorder(10, 20, 10, 20)
                )
        );

        return button;
    }

    private JButton createMenuButton(String text) {

        JButton button = new JButton(text);

        button.setFont(new Font("SansSerif", Font.BOLD, 16));
        button.setForeground(textColor);
        button.setBackground(panelColor);
        button.setFocusPainted(false);
        button.setBorder(
                BorderFactory.createLineBorder(
                        new Color(70, 70, 85), 1
                )
        );

        return button;
    }

    private JButton createCaseButton(
            String id,
            String title,
            String location) {

        JButton button = new JButton(
                "<html><center>"
                        + "<font size='5'>" + id + "</font><br>"
                        + "<b>" + title + "</b><br>"
                        + "<font color='#AAAAAA'>" + location + "</font>"
                        + "</center></html>"
        );

        button.setForeground(textColor);
        button.setBackground(panelColor);
        button.setFocusPainted(false);
        button.setBorder(
                BorderFactory.createLineBorder(
                        new Color(70, 70, 85), 1
                )
        );

        return button;
    }

    private void showInfo(String title, String message) {

        JOptionPane.showMessageDialog(
                this,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            TruthTraceGUI gui = new TruthTraceGUI();
            gui.setVisible(true);

        });
    }
}