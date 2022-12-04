package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore{

    private Map<Integer, Clientes> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Clientes clientes) {
        dataStore.put(clientes.getId(), clientes);
    }

    @Override
    public void deleteCustomer(Clientes clientes) {
        dataStore.remove(clientes);
    }

    @Override
    public void updateCustomer(Clientes clientes) {
        dataStore.replace(clientes.getId(), clientes);
    }

    @Override
    public List<Clientes> getAllCustomers() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Clientes findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}
