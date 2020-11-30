package com.vivla.gui.dialog;

import com.vivla.gui.MainFrame;
import com.vivla.settings.Text;

import javax.swing.*;

public class ErrorDialog {

    public static void show(MainFrame mainFrame, String text) {
        JOptionPane.showMessageDialog(mainFrame, Text.get(text), Text.get("ERROR"), JOptionPane.ERROR_MESSAGE);
    }

}
