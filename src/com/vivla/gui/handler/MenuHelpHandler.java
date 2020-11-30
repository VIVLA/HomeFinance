package com.vivla.gui.handler;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.AboutDialog;
import com.vivla.settings.HandlerCode;

import java.awt.event.ActionEvent;

public class MenuHelpHandler extends Handler {
    public MenuHelpHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (HandlerCode.MENU_HELP_ABOUT.equals(e.getActionCommand())) {
            new AboutDialog().setVisible(true);
        }
        super.actionPerformed(e);
    }

}
