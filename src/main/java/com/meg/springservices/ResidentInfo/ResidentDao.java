package com.meg.springservices.ResidentInfo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ResidentDao {

    String firstName;
    String lastName;
    String phoneNumber;
    String emailId;
    String apartmentNo;
    LocalDate creationDate;

}
