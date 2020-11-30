package com.vivla.gui.handler;

import com.vivla.gui.MainFrame;
import com.vivla.saveload.SaveData;
import com.vivla.settings.HandlerCode;

import java.awt.event.ActionEvent;

public class FilterHandler extends Handler {

    public FilterHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
            case HandlerCode.LEFT: {
                SaveData.getInstance().getFilter().prev();
                break;
            }
            case HandlerCode.RIGHT: {
                SaveData.getInstance().getFilter().next();
                break;
            }
            case HandlerCode.STEP: {
                SaveData.getInstance().getFilter().nextPeriod();
            }
        }
        super.actionPerformed(e);
    }


}
