package Interfaces;

import Persons.Student;

public interface Staff {

    void helpStudent(Student student);

    default void giveAdditionalMaterials(){
        System.out.println("https://habr.com/ru/post/463125/");
    }
}
