package com.vivla.gui.table.model;

import com.vivla.model.Article;
import com.vivla.saveload.SaveData;

public class ArticleTableModel extends MainTableModel {
    private static final int TITLE = 0;

    public ArticleTableModel(String[] columns) {
        super(SaveData.getInstance().getArticles(), columns);
    }

    @Override
    protected void updateData() {
        data = SaveData.getInstance().getArticles();
    }

    @Override
    public Object getValueAt(int row, int column) {
        if (data.isEmpty()) return null;
        Article article = (Article) data.get(row);
        switch (column) {
            case TITLE:
                return article.getTitle();
        }
        return null;
    }
}
