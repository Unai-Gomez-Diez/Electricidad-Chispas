package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Vender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MemItemDataStore implements ItemDataStore {

    private Map<Integer, Vender> dataStore = new TreeMap<>();
    @Override
    public void saveItem(Vender vender) {

    }

    @Override
    public void deleteItem(Vender vender) {

    }

    @Override
    public void updateItem(Vender vender) {

    }

    @Override
    public List<Vender> getAllItem() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Vender findById(Integer id) {
        return dataStore.get(id);
    }
}
