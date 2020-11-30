package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.TransactionAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.TransactionTableData;
import com.vivla.gui.toolbar.FunctionToolBar;
import com.vivla.settings.Style;

import javax.swing.*;

public class TransactionPanel extends RightPanel {

    public TransactionPanel(MainFrame frame) {
        super(frame, new TransactionTableData(new FunctionsHandler(frame, new TransactionAddEditDialog(frame))),
                "TRANSACTIONS", Style.ICON_PANEL_TRANSACTIONS,
                new JPanel[]{
                        new FunctionToolBar(new FunctionsHandler(frame, new TransactionAddEditDialog(frame))),
                        new FilterPanel(frame)});
    }
}
