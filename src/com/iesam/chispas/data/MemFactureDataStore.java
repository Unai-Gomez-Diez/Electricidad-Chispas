package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Factura;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MemFactureDataStore implements FactureDataStore{


    private TreeMap<Integer, Factura> dataStore = new TreeMap<>();
    @Override
    public void saveFacture(Factura factura) {

    }

    @Override
    public List<Factura> getAllFacture() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Factura findById(Integer id) {
        return dataStore.get(id);
    }
}
