package com.newline.sjyn.uis.combobox;

import javax.swing.*;

/**
 * Created by steven on 1/2/18.
 */
public class MaterialComboBoxEditorComponent extends JTextField {
    public MaterialComboBoxEditorComponent(String value, int n){
        super(value, n);
    }

    @Override
    public void setText(String t) {
        if (getText().equals(t)) {
            return;
        }
        super.setText(t);
    }
}
