package com.newline.sjyn.borders;

import com.newline.sjyn.MaterialTheme;

import javax.swing.border.AbstractBorder;
import java.awt.*;

/**
 * A border that goes along the bottom only.
 */
public class BottomLineBorder extends AbstractBorder {

    private MaterialTheme theme;

    public BottomLineBorder(MaterialTheme theme){
        this.theme = theme;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Color primary = theme.getPrimaryColor();
        Color secondary = theme.getSecondaryColor();
        Color disabled = theme.getDisabledColor();
        int thickness = theme.getBorderThickness();

        if (c.isEnabled()) {
            g.setColor(c.isFocusOwner() || c.hasFocus() ? primary : secondary);
        } else {
            g.setColor(disabled);
        }

        g.fillRect(0, height - thickness, width, height);
    }
}
