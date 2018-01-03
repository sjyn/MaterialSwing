package com.newline.sjyn.uis.combobox;

import com.newline.sjyn.MaterialTheme;
import com.newline.sjyn.borders.BottomLineBorder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

/**
 * Created by steven on 1/2/18.
 */
public class MaterialComboBoxUI extends BasicComboBoxUI {
    private static MaterialTheme theme;
    private JButton arrowButton;

    public static ComponentUI createUI(JComponent c){
        ((JComboBox<?>)c).setEditor(new MaterialComboBoxEditor());
        return new MaterialComboBoxUI();
    }

    public static void setTheme(MaterialTheme theme){
        MaterialComboBoxUI.theme = theme;
    }

    @Override
    protected JButton createArrowButton() {
        arrowButton = new JButton("\u2228");
        arrowButton.setBorder(new EmptyBorder(1, 2, 1, 2));
        arrowButton.setBackground(null);

        BottomLineBorder bottomLineBorder = new BottomLineBorder(theme);
        arrowButton.setBorder(bottomLineBorder);
        return arrowButton;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        super.paint(g, c);
        c.setBackground(null);
        c.setBorder(null);

        BottomLineBorder bottomLineBorder = new BottomLineBorder(theme);
        bottomLineBorder.paintBorder(c, g, c.getX(), c.getY(), c.getWidth(), c.getHeight());
    }
}
