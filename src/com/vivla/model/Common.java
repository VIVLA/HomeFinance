package com.vivla.model;

import com.vivla.saveload.SaveData;

public abstract class Common {

    public Common() {}

    public String getValueForComboBox() {
        return null;
    }

    public void postAdd(SaveData sd) {};
    public void postEdit(SaveData sd) {};
    public void postRemove(SaveData sd) {};

}
