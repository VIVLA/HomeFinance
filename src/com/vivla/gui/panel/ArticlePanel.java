package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.ArticleAddEditDialog;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.table.ArticleTableData;
import com.vivla.gui.toolbar.FunctionToolBar;
import com.vivla.settings.Style;

public class ArticlePanel extends RightPanel {

    public ArticlePanel(MainFrame frame) {
        super(frame, new ArticleTableData(new FunctionsHandler(frame, new ArticleAddEditDialog(frame))),
                "ARTICLES", Style.ICON_PANEL_ARTICLES,
                new FunctionToolBar(new FunctionsHandler(frame, new ArticleAddEditDialog(frame))));
    }
}
