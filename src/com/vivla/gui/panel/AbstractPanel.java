package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.Refresh;

import javax.swing.*;

public abstract class AbstractPanel extends JPanel implements Refresh {

    protected final MainFrame frame;

    public AbstractPanel(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void refresh() {
        removeAll();
        init();
    }

    abstract protected void init();
}
