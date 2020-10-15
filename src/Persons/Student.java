package Persons;

import Tasks.Task;

public class Student extends Person {
    public static final int MAX_MODULE_COUNT = 20;
    private String name;
    private int age;
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


//        Студенту передаётся число задач, которые он должен решить и ссылка на массив с заданиями
//➜ У студента есть количество задач, которые он уже решил, а значит вы можете вычислить, с какой задачи начинать решение.
//➜ Для решения задач студент вызывает метод Решить задачу.
//➜ Если студент решил все задачи из массива, то напечатать об этом сообщение и выставить true в соответствующее поле
//➜ Иначе напечатать сообщение о том, что не все задачи решены и вернуть false
//        completedTasksTotal++;
//        System.out.println("Задание выполнено!");
    }

    private void completeTask(Task task){

        //        Если задание проверяется автоматически, то напечатать сообщение о том, что задание выполнено и закончить работу метода
//        Иначе у текущего отправлять ментору задание на проверку до тех пор, пока оно не будет зачтено
//        Не забудьте увеличить число решенных студентом и всеми студентами задач
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
