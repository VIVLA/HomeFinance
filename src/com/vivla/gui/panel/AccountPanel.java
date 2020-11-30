package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.AccountAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.AccountTableData;
import com.vivla.gui.toolbar.FunctionToolBar;
import com.vivla.settings.Style;

public class AccountPanel extends RightPanel {

    public AccountPanel(MainFrame frame) {
        super(frame, new AccountTableData(new FunctionsHandler(frame, new AccountAddEditDialog(frame))),
                "ACCOUNTS", Style.ICON_PANEL_ACCOUNTS,
                new FunctionToolBar(new FunctionsHandler(frame, new AccountAddEditDialog(frame))));
    }
}
