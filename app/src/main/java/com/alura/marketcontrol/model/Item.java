package com.alura.marketcontrol.model;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class Item implements Serializable {

    private int id = 0;
    private String item;
    private String quantidade;

    public Item (String item, String quantidade){
        this.item = item;
        this.quantidade = quantidade;
    }

    public Item() {

    }

    public void setItem(String item){this.item = item;}

    public void setQuantidade(String quantidade) {this.quantidade = quantidade;}

    public String getQuantidade() {return quantidade;}

    public String getItem() {return item;}

    @NonNull
    @Override
    public String toString() {return item + " - " + quantidade ;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public boolean temIdValido() {return id > 0;}
}
