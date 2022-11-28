package data;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MemCustomerDataStore implements CustomerDataStore{

    private Map<Integer, Cliente> dataStore = new TreeMap<String, Cliente>();

    @Override
    public void saveCustomer(Cliente cliente) {
        dataStore.put(cliente.codCliente, cliente);
    }

    @Override
    public void deleteCustomer(Cliente cliente) {
        dataStore.remove(cliente);
    }

    @Override
    public void updateCustomer(Cliente cliente) {
        dataStore.replace(cliente.codCliente, cliente);
    }

    @Override
    public List<Cliente> getAllCustomers() {
        return dataStore.values().stream().tolist();
    }

    @Override
    public Cliente findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}
