package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.data.MemItemDataStore;
import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Vender;

import java.util.List;

public class GetItemUseCase {
    private ItemDataStore itemDataStore;

    public GetItemUseCase(ItemDataStore itemDataStore) {
        this.itemDataStore = itemDataStore;
    }

    public List<Vender> execute() {
        ItemDataStore itemDataStore = new MemItemDataStore();
        return itemDataStore.getAllItem();
    }
}
