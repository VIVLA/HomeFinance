package com.vivla.gui.toolbar;

import com.vivla.gui.EnableEditDelete;
import com.vivla.gui.MainButton;
import com.vivla.gui.handler.Handler;
import com.vivla.settings.HandlerCode;
import com.vivla.settings.Style;
import com.vivla.settings.Text;

public final class FunctionToolBar extends AbstractToolBar implements EnableEditDelete {

    private MainButton editButton;
    private MainButton deleteButton;

    public FunctionToolBar(Handler handler) {
        super(Style.BORDER_FUNCTIONS_TOOLBAR, handler);
        init();
    }

    @Override
    protected void init() {
        addButton(Text.get("ADD"), Style.ICON_ADD, HandlerCode.ADD, false);
        editButton = addButton(Text.get("EDIT"), Style.ICON_EDIT, HandlerCode.EDIT, false);
        deleteButton = addButton(Text.get("DELETE"), Style.ICON_DELETE, HandlerCode.DELETE, false);
    }

    @Override
    public void setEnableEditDelete(boolean enable) {
        editButton.setEnabled(enable);
        deleteButton.setEnabled(enable);
    }

}
