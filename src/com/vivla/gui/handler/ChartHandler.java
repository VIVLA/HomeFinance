package com.vivla.gui.handler;

import com.vivla.gui.MainFrame;
import com.vivla.gui.panel.StatisticsPanel;
import com.vivla.settings.HandlerCode;

import java.awt.event.ActionEvent;

public class ChartHandler extends Handler {

    public ChartHandler(MainFrame frame) {
        super(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (HandlerCode.TYPE.equals(e.getActionCommand())) {
            ((StatisticsPanel) frame.getRightPanel()).nextType();
        }
        super.actionPerformed(e);
    }

}
