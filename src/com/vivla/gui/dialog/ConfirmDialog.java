package com.vivla.gui.dialog;

import com.vivla.gui.MainFrame;
import com.vivla.settings.Text;

import javax.swing.*;

public class ConfirmDialog {

    public static int show(MainFrame mainFrame, String text, String title) {
        String[] option = {Text.get("YES"), Text.get("NO")};
        int result = JOptionPane.showOptionDialog(mainFrame, Text.get(text), Text.get(title),
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);
        return result;
    }

}
