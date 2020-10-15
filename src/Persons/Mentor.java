package Persons;
import Interfaces.Staff;
import Tasks.Task;

import java.util.Random;

public class Mentor extends Person implements Staff{
    private boolean mood;
    private Random random;

    public Mentor(String name, int age) {
        super(name, age);
        this.mood = true;
    }

    public void helpStudent(Student student){
        System.out.println(student.getName() + ", у вас все хорошо получается");
    }

    boolean checkCode(Task task){
        Random random = new Random();


        if (random.nextInt() > 1000) {
            System.out.println("Задача принята");
            return true;
        }
        else {
            System.out.println("Задание номер " + task + "не принято");
            return false;}
    }
}
