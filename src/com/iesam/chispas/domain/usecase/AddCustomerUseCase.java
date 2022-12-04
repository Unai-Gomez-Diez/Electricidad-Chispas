package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Clientes;

public class AddCustomerUseCase {
    private CustomerDataStore customerDataStore;
    public AddCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }
    public void execute(Clientes customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }
}
