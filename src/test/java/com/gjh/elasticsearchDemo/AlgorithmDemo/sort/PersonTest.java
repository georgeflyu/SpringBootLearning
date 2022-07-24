package com.gjh.elasticsearchDemo.AlgorithmDemo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void compareTo() {
        Person person1 = new Person("乔治", 4);
        Person person2 = new Person("佩奇", 6);
        System.out.println(person1.compareTo(person2));
    }
}