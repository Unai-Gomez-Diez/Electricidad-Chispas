package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.FactureDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.data.MemFactureDataStore;
import com.iesam.chispas.data.MemItemDataStore;
import com.iesam.chispas.domain.models.Factura;
import com.iesam.chispas.domain.models.Vender;

import java.util.List;

public class GetFactureUseCase {
    private FactureDataStore factureDataStore;

    public GetFactureUseCase(FactureDataStore factureDataStore) {
        this.factureDataStore = factureDataStore;
    }

    public List<Factura> execute() {
        FactureDataStore factureDataStore = new MemFactureDataStore();
        return factureDataStore.getAllFacture();
    }
}
