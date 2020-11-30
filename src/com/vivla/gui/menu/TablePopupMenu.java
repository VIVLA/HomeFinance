package com.vivla.gui.menu;

import com.vivla.gui.Refresh;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.settings.HandlerCode;
import com.vivla.settings.Style;
import com.vivla.settings.Text;

import javax.swing.*;

public class TablePopupMenu extends JPopupMenu implements Refresh {

    private final FunctionsHandler handler;

    public TablePopupMenu(FunctionsHandler handler) {
        super();
        this.handler = handler;
        init();
    }

    private void init() {
        JMenuItem editItem = new JMenuItem(Text.get("EDIT"));
        JMenuItem deleteItem = new JMenuItem(Text.get("DELETE"));

        editItem.setActionCommand(HandlerCode.EDIT);
        deleteItem.setActionCommand(HandlerCode.DELETE);

        editItem.setIcon(Style.ICON_MENU_POPUP_EDIT);
        deleteItem.setIcon(Style.ICON_MENU_POPUP_DELETE);

        editItem.addActionListener(handler);
        deleteItem.addActionListener(handler);

        add(editItem);
        add(deleteItem);
    }

    @Override
    public void refresh() {

    }
}
