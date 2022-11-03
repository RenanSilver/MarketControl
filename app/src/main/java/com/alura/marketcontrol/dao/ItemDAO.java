package com.alura.marketcontrol.dao;

import com.alura.marketcontrol.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    private final static List<Item> itens = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Item item) {
        item.setId(contadorDeIds);
        itens.add(item);
        atualizaIds();
    }

    private void atualizaIds() {contadorDeIds++;}

    public void edita(Item item){
        Item itemEncontrado = buscaItemPeloId(item);
        if (itemEncontrado != null) {
            int posicaoDoItem = itens.indexOf(itemEncontrado);
            itens.set(posicaoDoItem, item);
        }
    }


    private Item buscaItemPeloId(Item item) {
        for (Item a : itens) {
            if (a.getId() == item.getId()) {
                return a;
            }
        }
        return item;
    }


}
