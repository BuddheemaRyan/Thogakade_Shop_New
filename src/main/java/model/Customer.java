package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String custID;
    private String cusTitle;
    private String custName;
    private String dob;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;
}
