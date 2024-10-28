package ua.edu.ucu.apps.flowerStore.studentTransition;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Student {
    private String name;
    private String gender;
    @Transient
    private int age;
    @Id
    private long id;

    int getAge() {return age;}
    void setAge(int age) {this.age = age;}
}
