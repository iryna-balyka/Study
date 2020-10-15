package Tasks;

public interface Autochecked {
    default void completeTasks(){
        System.out.println("Задание выполнено");
    };
    boolean checkAutomatically();
}
