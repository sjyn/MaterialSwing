package com.newline.sjyn.uis.combobox;

import javax.swing.plaf.metal.MetalComboBoxEditor;
import java.awt.*;

/**
 * Created by steven on 1/2/18.
 */
public class MaterialComboBoxEditor extends MetalComboBoxEditor {
    @Override
    public Component getEditorComponent() {
        return new MaterialComboBoxEditorComponent("", 9);
    }
}
