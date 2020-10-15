import Persons.Mentor;
import Persons.Student;
import Tasks.DragAndDrop;
import Tasks.Task;
import Tasks.Test;
import Tasks.WriteCode;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Test test = new Test();
        DragAndDrop dragAndDrop = new DragAndDrop();
        WriteCode writeCode = new WriteCode();
        Task[] task = new Task[]{test, dragAndDrop, test, writeCode, test, writeCode, dragAndDrop};
        Mentor mentor1 = new Mentor("Иванов Павел", 27);
        Mentor mentor2 = new Mentor("Курочкина Анна", 28);
        Student student1 = new Student("Васильев Илья", 18, mentor1,false);
        Student student2 = new Student("Архипенко Дарья", 34, mentor2, false);
        Student[] students = new Student[]{student1, student2};
        while (Student.completedTasksTotal < students.length* task.length){
            Random random = new Random();
            int max = task.length;
        }

    }
}

