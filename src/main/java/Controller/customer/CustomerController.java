package Controller.customer;

import db.DBConnection;
import javafx.collections.ObservableList;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerController implements CustomerService {
    @Override
    public void addCustomer(Customer customer) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO Customer VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setObject(1, customer.getCustID());
            pstm.setObject(2, customer.getCusTitle());
            pstm.setObject(3, customer.getCustName());
            pstm.setObject(4, customer.getDob());
            pstm.setObject(5, customer.getSalary());
            pstm.setObject(6, customer.getCustAddress());
            pstm.setObject(7, customer.getCity());
            pstm.setObject(8, customer.getProvince());
            pstm.setObject(9, customer.getPostalCode());
            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCustomer(String custID) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement("DELETE FROM Customer WHERE CustID=?");
            pstm.setObject(1, custID);
            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "UPDATE Customer SET CustTitle=?, CustName=?, DOB=?, Salary=?, CustAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setObject(1, customer.getCusTitle());
            pstm.setObject(2, customer.getCustName());
            pstm.setObject(3, customer.getDob());
            pstm.setObject(4, customer.getSalary());
            pstm.setObject(5, customer.getCustAddress());
            pstm.setObject(6, customer.getCity());
            pstm.setObject(7, customer.getProvince());
            pstm.setObject(8, customer.getPostalCode());
            pstm.setObject(9, customer.getCustID());
            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ObservableList<Customer> getAllCustomerDetails() {
        ObservableList<Customer> customerList = javafx.collections.FXCollections.observableArrayList();
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement(" SELECT * FROM Customer");
            ResultSet rst = pstm.executeQuery();

            while (rst.next()) {
                customerList.add(new Customer(
                        rst.getString("CustID"),
                        rst.getString("CustTitle"),
                        rst.getString("CustName"),
                        rst.getString("DOB"),
                        rst.getDouble("salary"),
                        rst.getString("CustAddress"),
                        rst.getString("City"),
                        rst.getString("Province"),
                        rst.getString("PostalCode")
                        )
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
