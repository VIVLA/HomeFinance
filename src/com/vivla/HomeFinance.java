package com.vivla;

import com.vivla.gui.MainFrame;
import com.vivla.settings.Settings;
import com.vivla.settings.Text;

import java.awt.*;
import java.io.IOException;

public class HomeFinance {

    public static void main(String[] args) throws Exception {
        init();
        MainFrame frame = new com.vivla.gui.MainFrame();
        frame.setVisible(true);
    }

    private static void init() {
        Settings.init();
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, com.vivla.settings.Settings.FONT_ROBOTO_LIGHT));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}
