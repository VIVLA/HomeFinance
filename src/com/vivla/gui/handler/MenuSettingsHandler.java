package com.vivla.gui.handler;

import com.vivla.gui.MainFrame;
import com.vivla.settings.HandlerCode;
import com.vivla.settings.Settings;
import com.vivla.settings.Text;

import java.awt.event.ActionEvent;

public class MenuSettingsHandler extends Handler {

    public MenuSettingsHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case HandlerCode.MENU_SETTINGS_LANGUAGE_RUSSIAN: {
                Settings.setLanguage("ru");
                break;
            }
            case HandlerCode.MENU_SETTINGS_LANGUAGE_ENGLISH: {
                Settings.setLanguage("en");
            }
        }
        Text.init();
        frame.getMenu().refresh();
        super.actionPerformed(e);
    }
}
