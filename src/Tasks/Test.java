package Tasks;

public class Test  extends Task implements Autochecked{
    private String[] answers;

    public Test(){
        super();
        answers = new String[]{"a","b","c"};
    }

    @Override
    public boolean checkAutomatically() {
        System.out.println("Задание выполнено");
        return true;
    }
}
