package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.FactureDataStore;
import com.iesam.chispas.domain.models.Factura;

public class AddFactureUseCase {
    private FactureDataStore factureDataStore;

    public AddFactureUseCase(FactureDataStore factureDataStore) {
        this.factureDataStore = factureDataStore;
    }

    public void execute(Factura facture) {
        factureDataStore.saveFacture(facture);
    }
}
