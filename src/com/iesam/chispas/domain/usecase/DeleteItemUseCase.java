package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Vender;

public class DeleteItemUseCase {
    private ItemDataStore itemDataStore;
    public DeleteItemUseCase(ItemDataStore itemDataStore) {
        this.itemDataStore=itemDataStore;
    }
    public void execute(Vender vender){
        itemDataStore.deleteItem(vender);
    }
}
