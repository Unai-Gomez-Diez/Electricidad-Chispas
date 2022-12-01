package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Clientes;

public class DeleteCustomerUseCase {

    private CustomerDataStore customerDataStore;
public DeleteCustomerUseCase(CustomerDataStore customerDataStore) {
    this.customerDataStore=customerDataStore;
}
    public void execute(Clientes cliente){
        customerDataStore.deleteCustomer(cliente);
    }
}

