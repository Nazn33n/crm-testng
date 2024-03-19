package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactParam {
    String firstName;
    String middleName;
    String lastName;
    String addressDetail;
    String cityName;
    String stateName;
    String zipCode;

}
