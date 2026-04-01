package frameworks.students_hiber.students_hiber.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

//OOP. 2
//Прізвище
//Група
//Рік народження
//оцінка з фізики
//оцінка з математики
//оцінка з інформатики
//
//Надрукувати прізвища студентів, які склали математику на «95», і визначити їхню кількість.
@Entity
@Table(name = "student")
@DynamicUpdate
@DynamicInsert
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String surname;
    private String group;
    private int yearOfBirth;
    private int gradePhysics;
    private int gradeMath;
    private int gradeCompScience;

    public Student(String surname, String group, int yearOfBirth, int gradePhysics, int gradeMath, int gradeCompScience) {
        this.surname = surname;
        this.group = group;
        this.yearOfBirth = yearOfBirth;
        this.gradePhysics = gradePhysics;
        this.gradeMath = gradeMath;
        this.gradeCompScience = gradeCompScience;
    }
}
