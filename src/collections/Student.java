package collections;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    Integer rollno;

    public Student(String name,Integer rollno){
        this.name = name;
        this.rollno=rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "collections.Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollno, student.rollno);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollno-that.rollno;
    }

//    @Override
//    public int compareTo(collections.Student that) {
//        return this.name.compareTo(that.name);
//    }
}
