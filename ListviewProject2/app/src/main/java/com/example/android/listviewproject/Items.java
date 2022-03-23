package com.example.android.listviewproject;

import java.io.Serializable;

class Items implements Serializable {



    String itemName;
    int itemImage;
    double itemPrice;

    /*
    public Items("cheese", R.drawable.cheese, 2) {
        this.itemName = "cheese";
        this.itemIamge = R.drawable.cheese;
        this.itemPrice = 2;
    }
     */
    public Items(String itemName, int itemImage, double itemPrice) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemIamge) {
        this.itemImage = itemIamge;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
