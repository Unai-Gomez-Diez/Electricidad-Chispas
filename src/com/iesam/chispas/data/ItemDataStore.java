package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Clientes;
import com.iesam.chispas.domain.models.Vender;

import java.util.List;

public interface ItemDataStore {
    void saveItem(Vender vender);

    void deleteItem(Vender vender);

    void updateItem(Vender vender);

    List<Vender> getAllItem();

    Vender findById(Integer id);
}
