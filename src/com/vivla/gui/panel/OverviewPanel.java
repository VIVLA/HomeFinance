package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.TransactionAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.TransactionTableData;
import com.vivla.settings.Settings;
import com.vivla.settings.Style;

public class OverviewPanel extends RightPanel {

    public OverviewPanel(MainFrame frame) {
        super(frame, new TransactionTableData(new FunctionsHandler(frame, new TransactionAddEditDialog(frame)),
                        Settings.COUNT_OVERVIEW_ROWS),
                "LAST_TRANSACTIONS", Style.ICON_PANEL_OVERVIEW);
    }
}
