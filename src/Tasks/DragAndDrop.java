package Tasks;

public class DragAndDrop extends Task implements Autochecked{
    private String[][] variants;

    public DragAndDrop(){
        super();
        variants = new String[][]{{"1","2","3","4"},{"c","b","a","q"}};
    }

    @Override
    public boolean checkAutomatically() {

    }
}
