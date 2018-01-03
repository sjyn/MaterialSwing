package com.newline.sjyn;

import com.newline.sjyn.borders.BottomLineBorder;
import com.newline.sjyn.uis.combobox.MaterialComboBoxUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

/**
 * A Material Look And Feel based on the Metal Look and Feel.
 * Set this using the UI manager and a pre-defined {@link MaterialTheme}
 */
public class MaterialLookAndFeel extends MetalLookAndFeel {
    public static final String LAF_NAME = "Material Design";

    private MaterialTheme theme;

    public MaterialLookAndFeel(MaterialTheme theme){
        super();
        this.theme = theme;

        configureFonts();
        configureColors();
        configureBasic();
        configureComboBox();
        configureTabbedPane();
    }

    private void configureBasic(){
        UIManager.put("TextField.border", new BottomLineBorder(theme));
    }

    private void configureFonts(){
        UIManager.put("Button.font", theme.getPrimaryFont());
        UIManager.put("RadioButton.font", theme.getPrimaryFont());
        UIManager.put("CheckBox.font", theme.getPrimaryFont());
        UIManager.put("ComboBox.font", theme.getPrimaryFont());
        UIManager.put("Label.font", theme.getPrimaryFont());
        UIManager.put("MenuBar.font", theme.getPrimaryFont());
        UIManager.put("MenuItem.font", theme.getSecondaryFont());
        UIManager.put("Menu.font", theme.getPrimaryFont());
        UIManager.put("OptionPane.font", theme.getSecondaryFont());
        UIManager.put("Panel.font", theme.getPrimaryFont());
        UIManager.put("ScrollPane.font", theme.getPrimaryFont());
        UIManager.put("Table.font", theme.getPrimaryFont());
        UIManager.put("TableHeader.font", theme.getSecondaryFont());
        UIManager.put("TextField.font", theme.getPrimaryFont());
        UIManager.put("TextArea.font", theme.getPrimaryFont());
    }

    private void configureColors(){
        UIManager.put("Panel.background", Color.WHITE);
    }

    private void configureComboBox(){
        MaterialComboBoxUI.setTheme(theme);
        UIManager.put("ComboBoxUI", "com.newline.sjyn.uis.combobox.MaterialComboBoxUI");
        UIManager.put("ComboBox.border", new BottomLineBorder(theme));
        UIManager.put("ComboBox.selectionBackground", Color.WHITE);
        UIManager.put("ComboBox.buttonBackground", Color.WHITE);
        UIManager.put("ComboBox.buttonBorder", new EmptyBorder(0,0,0,0));
        UIManager.put("ComboBox.buttonShadow", Color.WHITE);
        UIManager.put("ComboBox.buttonDarkShadow", Color.BLACK);
        UIManager.put("ComboBox.disabledBackground", Color.WHITE);
        UIManager.put("ComboBox.disabledForeground", Color.BLACK);
    }

    private void configureTabbedPane(){

    }

    @Override
    public String getName() {
        return LAF_NAME;
    }

    @Override
    public String getID() {
        return LAF_NAME;
    }

    @Override
    public String getDescription() {
        return "A Material Design Look and Feel";
    }

    @Override
    public boolean getSupportsWindowDecorations() {
        return true;
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }
}
