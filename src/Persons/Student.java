package Persons;

import Tasks.Autochecked;
import Tasks.Task;

import java.util.Objects;

public class Student extends Person {
    private Mentor mentor;
    private int completedTasks;
    public static int completedTasksTotal;
    private boolean allTasksComplete;

    public Student(String name, int age, Mentor mentor, boolean allTasksComplete){
        super(name, age);
        this.mentor = mentor;
        this.allTasksComplete = allTasksComplete;
        this.completedTasks = 0;
    }

    public void completeTasks(int numberOfTasks, Task[] tasks){

           while (numberOfTasks != 0) {
               completeTask(tasks[completedTasks]);
               if (completedTasks == tasks.length) {
                   System.out.println("Все задачи решены");
                   allTasksComplete = true;
                   break;
               } else {
                   System.out.println("Еще не все задачи решены");
                   allTasksComplete = false;
               }
              numberOfTasks--;
           }
    }

    private void completeTask(Task task){
        if (task instanceof Autochecked){
            System.out.println("Задание выполнено");
            } else{
            boolean checkCodeResult = false;
            while (!checkCodeResult){
                checkCodeResult = mentor.checkCode(task);
            }
        }
        completedTasks++;
        Student.completedTasksTotal++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return completedTasks == student.completedTasks &&
                allTasksComplete == student.allTasksComplete &&
                Objects.equals(mentor, student.mentor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mentor, completedTasks, allTasksComplete);
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public static int getCompletedTasksTotal() {
        return completedTasksTotal;
    }

    public static void setCompletedTasksTotal(int completedTasksTotal) {
        Student.completedTasksTotal = completedTasksTotal;
    }

    public boolean isAllTasksComplete() {
        return allTasksComplete;
    }

    public void setAllTasksComplete(boolean allTasksComplete) {
        this.allTasksComplete = allTasksComplete;
    }
}
