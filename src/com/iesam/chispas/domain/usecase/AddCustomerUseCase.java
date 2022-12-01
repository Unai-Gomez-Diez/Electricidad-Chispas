package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Clientes;

public class AddCustomerUseCase {
    private CustomerDataStore customerUseCase;
    public  AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerUseCase = customerDataStore;
    }
    public void execute(Clientes customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }
}
