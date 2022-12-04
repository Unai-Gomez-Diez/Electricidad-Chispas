package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.data.MemItemDataStore;
import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Vender;

public class AddItemUseCase {
    private ItemDataStore itemDataStore;
    public  AddItemUseCase(ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }
    public void execute(Vender item){
        ItemDataStore itemDataStore = new MemItemDataStore();
        itemDataStore.saveItem(item);
    }
}
