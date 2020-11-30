package com.vivla.gui.panel;

import com.vivla.gui.MainButton;
import com.vivla.gui.MainFrame;
import com.vivla.gui.handler.FilterHandler;
import com.vivla.saveload.SaveData;
import com.vivla.settings.Format;
import com.vivla.settings.HandlerCode;
import com.vivla.settings.Style;

import java.awt.*;

public final class FilterPanel extends AbstractPanel {

    public FilterPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        FlowLayout layout = new FlowLayout();
        layout.setVgap(0);
        setLayout(layout);

        MainButton left = new MainButton(Style.ICON_LEFT, new FilterHandler(frame), HandlerCode.LEFT);
        MainButton step = new MainButton(Format.getTitleOfFilter(SaveData.getInstance().getFilter()),
                new FilterHandler(frame), HandlerCode.STEP);
        MainButton right = new MainButton(Style.ICON_RIGHT, new FilterHandler(frame), HandlerCode.RIGHT);

        setBorder(Style.BORDER_FILTER_PANEL);
        step.setFont(Style.FONT_BUTTON_FILTER);
        step.setPreferredSize(new Dimension(Style.WIDTH_FILTER_BUTTON, left.getPreferredSize().height));

        add(left);
        add(step);
        add(right);
    }
}
