package com.gjh.elasticsearchDemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable {
    private String name;
    private int age;


    @Override
    public int compareTo(Object o) {
        Student stu = (Student) o;
        if (stu.age > this.age) {
            return -1;
        }
        if (stu.age < this.age) {
            return 1;
        }
        return 0;
    }
}

