package com.vivla.gui.handler;

import com.vivla.exception.ModelException;
import com.vivla.gui.MainFrame;
import com.vivla.gui.dialog.AddEditDialog;
import com.vivla.gui.dialog.ErrorDialog;
import com.vivla.saveload.SaveData;
import com.vivla.settings.HandlerCode;

import java.awt.event.*;

public class AddEditDialogHandler extends Handler implements KeyListener, WindowListener {

    private final AddEditDialog dialog;

    public AddEditDialogHandler(MainFrame frame, AddEditDialog dialog) {
        super(frame);
        this.dialog = dialog;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case HandlerCode.ADD:
                addEdit(true);
                break;
            case HandlerCode.EDIT:
                addEdit(false);
                break;
            case HandlerCode.CANCEL:
                closeDialog();
        }
        super.actionPerformed(e);
    }

    private void addEdit(boolean add) {
        try {
            if (add) SaveData.getInstance().add(dialog.getCommonFromForm());
            else SaveData.getInstance().edit(dialog.getCommon(), dialog.getCommonFromForm());
            closeDialog();
        }
        catch (ModelException ex) {
            ErrorDialog.show(frame, ex.getMessage());
        }
    }

    private void closeDialog() {
        dialog.closeDialog();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            addEdit(dialog.isAdd());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        closeDialog();
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

}
