package model;

import java.util.Arrays;

public class SchoolYear {

    private Integer year;

    private Student[] preToddlers;

    private Teacher preToddlersTeacher;

    private Student[] toddlers;

    private Teacher toddlersTeacher;

    public SchoolYear() {
    }

    public SchoolYear(Integer year, Student[] preToddlers, Teacher preToddlersTeacher, Student[] toddlers,
                      Teacher toddlersTeacher) {
        this.year = year;
        this.preToddlers = preToddlers;
        this.preToddlersTeacher = preToddlersTeacher;
        this.toddlers = toddlers;
        this.toddlersTeacher = toddlersTeacher;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Student[] getPreToddlers() {
        return preToddlers;
    }

    public void setPreToddlers(Student[] preToddlers) {
        this.preToddlers = preToddlers;
    }

    public Teacher getPreToddlersTeacher() {
        return preToddlersTeacher;
    }

    public void setPreToddlersTeacher(Teacher preToddlersTeacher) {
        this.preToddlersTeacher = preToddlersTeacher;
    }

    public Student[] getToddlers() {
        return toddlers;
    }

    public void setToddlers(Student[] toddlers) {
        this.toddlers = toddlers;
    }

    public Teacher getToddlersTeacher() {
        return toddlersTeacher;
    }

    public void setToddlersTeacher(Teacher toddlersTeacher) {
        this.toddlersTeacher = toddlersTeacher;
    }

    @Override
    public String toString() {
        return "SchoolYear{" +
                "year=" + year +
                ", preToddlers=" + Arrays.toString(preToddlers) +
                ", preToddlersTeacher=" + preToddlersTeacher +
                ", toddlers=" + Arrays.toString(toddlers) +
                ", toddlersTeacher=" + toddlersTeacher +
                '}';
    }
}
