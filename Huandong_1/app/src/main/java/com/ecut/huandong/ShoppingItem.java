package com.ecut.huandong;

import android.widget.ImageView;

public class ShoppingItem {
    private int itemName;
    private int itemImage;

    public int getItemName() {
        return itemName;
    }

    public void setItemName(int itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public ShoppingItem(int itemName, int itemImage) {
        this.itemName = itemName;
        this.itemImage = itemImage;
    }
}
