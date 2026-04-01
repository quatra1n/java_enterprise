package frameworks.employees_hiber.employees_hiber.entity;
//    OOP. 1
//Прізвище
//Рік народження
//Посада
//Зарплата
//Освіта
//Визначити наймолодшого працівника та надрукувати відомості про нього.

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employee")
@DynamicUpdate
@DynamicInsert
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int yearOfBirth;
    private String position;
    private int salary;
    private String education;

    public Employee(String name, int yearOfBirth, String position, int salary, String education) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.position = position;
        this.salary = salary;
        this.education = education;
    }
}
