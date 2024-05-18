package io.github.malise.employeeservice.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {

    
    @Id
    @Column(name = "emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeNumber;
    
    @Column(name = "birth_date")
    @Past(message = "birth date needs to be past")
    private LocalDate birthdate;

    @Column(name = "first_name")
    @NotEmpty
    private String firstname;

    @Column(name = "last_name")
    @NotEmpty
    private String lastname;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "higher_date")
    @PastOrPresent(message = "hire date needs to be past or present")
    private LocalDate higherDate;
}
