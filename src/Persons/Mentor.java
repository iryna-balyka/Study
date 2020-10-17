package Persons;
import Interfaces.Staff;
import Tasks.Task;

import java.util.Random;

public class Mentor extends Person implements Staff{
    private boolean mood;
    Random random = new Random();

    public Mentor(String name, int age) {
        super(name, age);
        this.mood = true;
    }

    public void helpStudent(Student student){
        System.out.println(student.getName() + ", у вас все хорошо получается");
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "mood=" + mood +
                ", random=" + random +
                '}';
    }

    boolean checkCode(Task task){
        if (random.nextInt(2000) > 1000) {
            System.out.println("Задача принята");
            return true;
        }
        else {
            System.out.println("Задание номер " + task.number + "не принято");
            return false;}
    }
}
