package com.meg.springservices.ResidentInfo.api;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@Validated
public class ResidentRequest {

    @NotBlank
    @Size(min = 1, max = 10)
    String firstName;

    @NotNull
    @Size(min = 1, max = 10)
    String lastName;

    @NotNull
    @Size(min = 1, max = 15)
    String phoneNumber;

    @NotNull
    @Size(min = 1, max = 10)
    String emailId;

    @NotNull
    @Size(min = 1, max = 10)
    String apartmentNo;

    @FutureOrPresent
    LocalDate creationDate;
}
