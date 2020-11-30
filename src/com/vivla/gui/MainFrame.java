package com.vivla.gui;

import com.vivla.gui.handler.MainToolBarHandler;
import com.vivla.gui.handler.MainWindowHandler;
import com.vivla.gui.menu.MainMenu;
import com.vivla.gui.panel.*;
import com.vivla.gui.toolbar.MainToolBar;
import com.vivla.settings.Style;
import com.vivla.settings.Text;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements Refresh {

    private final GridBagConstraints constraints;
    private final MainMenu mainMenu;
    private final MainToolBar mainToolBar;
    private final LeftPanel leftPanel;
    private RightPanel rightPanel;

    public MainFrame() {
        super(Text.get("PROGRAM_NAME"));

        setResizable(false);
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;

        mainToolBar = new MainToolBar(new MainToolBarHandler(this));
        add(mainToolBar, constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;

        leftPanel = new LeftPanel(this);
        add(leftPanel, constraints);

        setRightPanel(new OverviewPanel(this));

        pack();
        setLocationRelativeTo(null);

        addWindowListener(new MainWindowHandler());
    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        mainToolBar.refresh();
        leftPanel.refresh();
        rightPanel.refresh();
        pack();
    }

    public MainMenu getMenu() {
        return mainMenu;
    }

    public void setRightPanel(RightPanel panel) {
        if (rightPanel != null) remove(rightPanel);
        constraints.gridy = 1;
        constraints.gridx = 1;
        rightPanel = panel;
        panel.setBorder(Style.BORDER_PANEL);
        add(rightPanel, constraints);
        pack();
    }

    public RightPanel getRightPanel() {
        return rightPanel;
    }

}
