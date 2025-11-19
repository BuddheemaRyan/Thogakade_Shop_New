package Controller.customer;

import javafx.collections.ObservableList;
import model.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomer(String custID);
    void updateCustomer(Customer customer);

    ObservableList<Customer> getAllCustomerDetails();
}
