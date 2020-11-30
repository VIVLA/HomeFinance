package com.vivla.gui.table;

import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.model.AccountTableModel;
import com.vivla.settings.Style;

import javax.swing.*;

public class AccountTableData extends TableData {
    private static final String[] columns = new String[]{"TITLE", "AMOUNT"};
    private static final ImageIcon[] icons = new ImageIcon[]{Style.ICON_TITLE, Style.ICON_AMOUNT};

    public AccountTableData(FunctionsHandler handler) {
        super(new AccountTableModel(columns), handler, columns, icons);
    }

}
