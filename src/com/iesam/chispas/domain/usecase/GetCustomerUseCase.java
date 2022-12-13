package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Clientes;

import java.util.List;

public class GetCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public  GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public List<Clientes> execute(){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        return customerDataStore.getAllCustomers();


    }
}
