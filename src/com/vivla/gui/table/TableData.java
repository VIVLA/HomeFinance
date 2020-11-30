package com.vivla.gui.table;

import com.vivla.gui.Refresh;
import com.vivla.gui.handler.FunctionsHandler;
import com.vivla.gui.menu.TablePopupMenu;
import com.vivla.gui.table.model.MainTableModel;
import com.vivla.gui.table.renderer.MainTableCellRenderer;
import com.vivla.gui.table.renderer.TableHeaderIconRenderer;
import com.vivla.settings.Style;
import com.vivla.settings.Text;

import javax.swing.*;
import java.awt.*;

public abstract class TableData extends JTable implements Refresh {
    private final FunctionsHandler handler;
    private final TablePopupMenu popup;
    private final String[] columns;
    private final ImageIcon[] icons;

    protected TableData(MainTableModel model, FunctionsHandler handler, String[] columns, ImageIcon[] icons) {
        super(model);
        this.handler = handler;
        this.popup = new TablePopupMenu(handler);
        this.columns = columns;
        this.icons = icons;

        getTableHeader().setFont(Style.FONT_TABLE_HEADER);
        setFont(Style.FONT_TABLE);
        setRowHeight(getRowHeight() + Style.TABLE_ADD_ROW_HEIGHT);

        setAutoCreateRowSorter(true);
        setPreferredScrollableViewportSize(Style.DIMENSION_TABLE_SHOW_SIZE);
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addMouseListener(handler);
        addKeyListener(handler);

        for (int i = 0; i < columns.length; i++) {
            getColumn(Text.get(columns[i])).setHeaderRenderer(new TableHeaderIconRenderer(icons[i]));
        }

        MainTableCellRenderer renderer = new MainTableCellRenderer();
        setDefaultRenderer(String.class, renderer);

        setComponentPopupMenu(popup);
    }

    @Override
    public JPopupMenu getComponentPopupMenu() {
        Point p = getMousePosition();
        if (p != null) {
            int row = rowAtPoint(p);
            if (isRowSelected(row))
                setRowSelectionInterval(row, row);
            else return null;
        }
        return super.getComponentPopupMenu();
    }

    @Override
    public void refresh() {
        int selectedRow = getSelectedRow();
        ((MainTableModel) getModel()).refresh();
        for (int i = 0; i < columns.length; i++) {
            getColumn(Text.get(columns[i])).setHeaderRenderer(new TableHeaderIconRenderer(icons[i]));
        }

        if (selectedRow != -1 && selectedRow < getRowCount()) {
            setRowSelectionInterval(selectedRow, selectedRow);
            requestFocus();
        }
        init();
    }

    protected void init() {}

    public FunctionsHandler getFunctionHandler() {
        return handler;
    }
}
