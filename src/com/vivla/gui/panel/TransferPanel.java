package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.TransferAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.TransferTableData;
import com.vivla.gui.toolbar.FunctionToolBar;
import com.vivla.settings.Style;

import javax.swing.*;

public class TransferPanel extends RightPanel {

    public TransferPanel(MainFrame frame) {
        super(frame, new TransferTableData(new FunctionsHandler(frame, new TransferAddEditDialog(frame))),
                "TRANSFERS", Style.ICON_PANEL_TRANSFERS,
                new JPanel[]{
                        new FunctionToolBar(new FunctionsHandler(frame, new TransferAddEditDialog(frame))),
                        new FilterPanel(frame)});
    }
}
