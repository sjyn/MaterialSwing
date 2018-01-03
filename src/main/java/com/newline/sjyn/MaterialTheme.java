package com.newline.sjyn;

import java.awt.*;

/**
 * A class to use to set up a theme.
 * Use this to configure colors and things
 */
public class MaterialTheme {
    private Color primaryColor;
    private Color secondaryColor;
    private Color primaryDarkColor;
    private Color disabledColor;

    private int borderThickness;

    private Font primaryFont;
    private Font secondaryFont;

    private MaterialTheme(){
        borderThickness = 2;

        primaryColor = Color.decode("#3F51B5");
        secondaryColor = Color.decode("#FF4081");
        primaryDarkColor = Color.decode("#303F9F");
        disabledColor = Color.GRAY;

        primaryFont = Font.getFont("Arial");
        secondaryFont = Font.getFont("Arial");
    }

    public static class MaterialThemeBuilder {
        private MaterialTheme theme;

        public MaterialThemeBuilder (){
            theme = new MaterialTheme();
        }

        public MaterialThemeBuilder setPrimaryFont(Font f){
            theme.primaryFont = f;
            return this;
        }

        public MaterialThemeBuilder setSecondaryFon(Font f){
            theme.secondaryFont = f;
            return this;
        }

        public MaterialThemeBuilder setDisabledColor(Color c){
            theme.disabledColor = c;
            return this;
        }

        public MaterialThemeBuilder setBorderThickness(int thickness){
            theme.borderThickness = thickness;
            return this;
        }

        public MaterialThemeBuilder setPrimaryColor(Color c){
            theme.primaryColor = c;
            return this;
        }

        public MaterialThemeBuilder setSecondaryColor(Color c){
            theme.secondaryColor = c;
            return this;
        }

        public MaterialThemeBuilder setPrimaryDarkColor(Color c){
            theme.primaryDarkColor = c;
            return this;
        }

        public MaterialTheme build(){
            return theme;
        }
    }

    public Color getDisabledColor() {
        return disabledColor;
    }

    public int getBorderThickness() {
        return borderThickness;
    }

    public Color getPrimaryColor() {
        return primaryColor;
    }

    public Color getSecondaryColor() {
        return secondaryColor;
    }

    public Color getPrimaryDarkColor() {
        return primaryDarkColor;
    }

    public Font getPrimaryFont() {
        return primaryFont;
    }

    public Font getSecondaryFont() {
        return secondaryFont;
    }
}
