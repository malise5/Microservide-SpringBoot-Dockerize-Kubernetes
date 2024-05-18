package io.github.malise.employeeservice.model;

import java.time.LocalDate;

import io.github.malise.employeeservice.entity.Gender;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeCreateRequest {
    
    @Past(message = "birth date needs to be past")
    private LocalDate birthdate;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    private Gender gender;

    @PastOrPresent(message = "hire date needs to be past or present")
    private LocalDate higherDate;
}
