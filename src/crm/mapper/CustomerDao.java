package crm.mapper;


import crm.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {

    List<Customer> selectCustomerList(Customer customer);
    Integer selectCustomerListCount(Customer customer);
    Customer getCustomerById(Long id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);

}
