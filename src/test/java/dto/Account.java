package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Account {
    String rating;
    String accountName;
    String phone;
    String fax;
    String accountNumber;
    String website;
    String accountSite;
    String tickerSymbol;
    String type;
    String ownership;
    String industry;
    String employees;
    String annualRevenue;
    String sicCode;
    String billingStreet;
    String billingCity;
    String billingState;
    String billingZip;
    String billingCountry;
    String shippingStreet;
    String shippingCity;
    String shippingState;
    String shippingZip;
    String shippingCountry;
    String customerPriority;
    String sla;
    String slaSerialNumber;
    String numberOfLocations;
    String upsellOpportunity;
    String description;
}
