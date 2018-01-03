package com.newline.sjyn;

import javax.swing.*;
import java.awt.*;

public class TestUITheme {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MaterialTheme theme = new MaterialTheme.MaterialThemeBuilder().build();
                MaterialLookAndFeel lookAndFeel = new MaterialLookAndFeel(theme);

                UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }

            JFrame frame = new JFrame("Test UI");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.setLocationRelativeTo(null);

            JTabbedPane tabbedPane = new JTabbedPane();
            tabbedPane.addTab("Tab Uno", generateMainPanel());
            tabbedPane.addTab("Tab II", generateTablePanel());
            frame.add(tabbedPane);

            frame.setVisible(true);
        });
    }

    private static JPanel generateMainPanel() {
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(6, 6, 6, 6);

        JTextField enabledTextField = new JTextField(24);
        enabledTextField.setToolTipText("Test Tooltip 01");
        enabledTextField.setText("Enabled");
        panel.add(enabledTextField, constraints);
        constraints.gridx++;
        JTextField disabledTextField = new JTextField(24);
        disabledTextField.setEnabled(false);
        disabledTextField.setText("Disabled");
        panel.add(disabledTextField, constraints);
        constraints.gridx = 0;
        constraints.gridy++;

        JComboBox<String> comboBoxRegular = new JComboBox<>();
        comboBoxRegular.addItem("Hello");
        comboBoxRegular.addItem("World");
        comboBoxRegular.addItem("Goodbye");
        comboBoxRegular.addItem("Mars");
        constraints.weightx = 0.3;
        panel.add(comboBoxRegular, constraints);
        constraints.gridx++;
        JComboBox<String> comboBoxEditable = new JComboBox<>();
        comboBoxEditable.setEditable(true);
        comboBoxEditable.addItem("abcd");
        comboBoxEditable.addItem("efgh");
        panel.add(comboBoxEditable, constraints);
        constraints.gridx++;
        JComboBox<String> comboBoxDisabled = new JComboBox<>();
        comboBoxDisabled.addItem("Disabled :(");
        comboBoxDisabled.setEnabled(false);
        panel.add(comboBoxDisabled, constraints);
        constraints.weightx = 1;
        constraints.gridy++;

        return panel;
    }

    private static JPanel generateTablePanel() {
        JPanel panel = new JPanel();

        return panel;
    }

}
