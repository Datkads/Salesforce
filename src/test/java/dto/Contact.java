package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Contact {
    String phone;
    String homePhone;
    String salutation;
    String firstName;
    String lastName;
    String mobile;
    String title;
    String otherPhone;
    String department;
    String fax;
    String birthDate;
    String email;
    String assistant;
    String leadSource;
    String asstPhone;
    String momsEmail;
    String mailingStreet;
    String mailingCity;
    String mailingState;
    String mailingZip;
    String mailingCountry;
    String otherStreet;
    String otherCity;
    String otherState;
    String otherZip;
    String otherCountry;
    String languages;
    String level;
    String description;
}
