package com.insurance.intf;

import com.insurance.models.CustomerDetails;

/**
 * Interface for CustomerDetails operations.
 */
public interface CustomerDetailsIntf {
    void addCustomerDetails(CustomerDetails customerDetails);
    CustomerDetails getCustomerDetails(String customerId);
    void updateCustomerDetails(CustomerDetails customerDetails);
    void deleteCustomerDetails(String customerId);
    void printAllCustomerDetails();
}
