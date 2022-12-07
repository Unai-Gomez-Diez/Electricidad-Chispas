package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Factura;

import java.util.List;

public interface FactureDataStore {
    void saveFacture(Factura factura);



    List<Factura> getAllFacture();

    Factura findById(Integer id);
}

