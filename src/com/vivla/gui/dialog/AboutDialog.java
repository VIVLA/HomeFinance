package com.vivla.gui.dialog;

import com.vivla.settings.Style;
import com.vivla.settings.Text;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class AboutDialog extends JDialog {

    public AboutDialog() {
        super();
        init();
        setIconImage(Style.ICON_ABOUT.getImage());
        setTitle(Text.get("DIALOG_ABOUT_TITLE"));
        setResizable(false);
    }

    private void init() {
        JEditorPane pane = new JEditorPane("text/html", Text.get("ABOUT"));
        pane.setEditable(false);
        pane.setOpaque(false);

        pane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
                    try {
                        Desktop.getDesktop().browse(e.getURL().toURI());
                    } catch (IOException | URISyntaxException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });

        add(pane);
        pack();
        setLocationRelativeTo(null);
    }

}
