package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Clientes;

public class UpdateCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase ( CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Clientes cliente){
        customerDataStore.updateCustomer(cliente);
    }
}
