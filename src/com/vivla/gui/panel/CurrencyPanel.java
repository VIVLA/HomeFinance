package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.CurrencyAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.CurrencyTableData;
import com.vivla.gui.toolbar.FunctionToolBar;
import com.vivla.settings.Style;

public class CurrencyPanel extends RightPanel {

    public CurrencyPanel(MainFrame frame) {
        super(frame, new CurrencyTableData(new FunctionsHandler(frame, new CurrencyAddEditDialog(frame))),
                "CURRENCIES", Style.ICON_PANEL_CURRENCIES,
                new FunctionToolBar(new FunctionsHandler(frame, new CurrencyAddEditDialog(frame))));
    }
}
