package com.vivla.gui.panel;

import com.vivla.gui.MainFrame;
import com.vivla.model.Currency;
import com.vivla.model.Statistics;
import com.vivla.saveload.SaveData;
import com.vivla.settings.Format;
import com.vivla.settings.Style;
import com.vivla.settings.Text;

import javax.swing.*;
import java.awt.*;

public final class LeftPanel extends AbstractPanel {
    public LeftPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_LEFT_PANEL);
        JLabel headerBC = new JLabel(Text.get("BALANCE_CURRENCIES"));
        headerBC.setFont(Style.FONT_LABEL_HEADER);
        headerBC.setIcon(Style.ICON_LEFT_PANEL_BALANCE_CURRENCIES);
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerBC);

        addBalanceCurrency();

        add(Box.createVerticalStrut(Style.PADDING_PANEL_BIG));

        JLabel headerB = new JLabel(Text.get("BALANCE"));
        headerB.setFont(Style.FONT_LABEL_HEADER);
        headerB.setIcon(Style.ICON_LEFT_PANEL_BALANCE);
        headerB.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerB);

        addBalance();
    }

    private void addBalance() {
        for (Currency currency : SaveData.getInstance().getEnableCurrencies()) {
            add(Box.createVerticalStrut(Style.PADDING_BALANCE));
            add(new PanelBalanceCurrency(currency, Statistics.getBalance(currency)));
        }
    }

    private void addBalanceCurrency() {
        for (Currency currency : SaveData.getInstance().getEnableCurrencies()) {
            add(Box.createVerticalStrut(Style.PADDING_BALANCE));
            add(new PanelBalanceCurrency(currency, Statistics.getBalanceCurrency(currency)));
        }
    }

    private class PanelBalanceCurrency extends JPanel {
        public PanelBalanceCurrency(Currency currency, double amount) {
            super();
            setLayout(new BorderLayout());
            setBackground(Style.COLOR_LEFT_PANEL_BALANCE);
            setBorder(Style.BORDER_PANEL);

            JLabel currencyLabel = new JLabel(currency.getTitle());
            JLabel amountLabel = new JLabel(Format.amount(amount, currency));

            currencyLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_CURRENCY);
            amountLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_AMOUNT);

            add(currencyLabel, BorderLayout.WEST);
            add(Box.createRigidArea(Style.DIMENSION_PADDING_BALANCE));
            add(amountLabel, BorderLayout.EAST);
        }
    }
}