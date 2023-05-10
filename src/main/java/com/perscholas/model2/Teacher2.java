package com.perscholas.model2;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Teacher2")
public class Teacher2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tit;
    private String salary;
    private String teacherName;
    @ManyToMany(targetEntity = Cohort.class)
    private Set CohortSet;

    public Teacher2(String salary, String teacherName, Set CohortSet) {
        this.salary = salary;
        this.teacherName = teacherName;
        this.CohortSet = CohortSet;
    }

    public Teacher2() {
        super();
    }

    public Set getCohortSet() {
        return CohortSet;
    }

    public void setCohortSet(Set cohortSet) {
        CohortSet = cohortSet;
    }

    public int getTit() {
        return tit;
    }

    public void setTit(int tit) {
        this.tit = tit;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

}
