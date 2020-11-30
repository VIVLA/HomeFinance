package com.vivla.gui.panel;

import com.vivla.gui.MainButton;
import com.vivla.gui.MainFrame;
import com.vivla.gui.handler.ChartHandler;
import com.vivla.settings.HandlerCode;
import com.vivla.settings.Text;

public class StatisticsTypePanel extends AbstractPanel {

    private final String title;

    public StatisticsTypePanel(MainFrame frame, String title) {
        super(frame);
        this.title = Text.get(title);
        init();
    }

    @Override
    protected void init() {
        MainButton type = new MainButton(title, new ChartHandler(frame), HandlerCode.TYPE);
        add(type);
    }
}
