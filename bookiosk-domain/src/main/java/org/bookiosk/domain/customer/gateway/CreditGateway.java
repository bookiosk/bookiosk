package org.bookiosk.domain.customer.gateway;

import org.bookiosk.domain.customer.Customer;
import org.bookiosk.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
