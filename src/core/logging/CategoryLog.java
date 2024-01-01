package core.logging;

public class CategoryLog implements ILogger{
    @Override
    public void log() {
        System.out.println("Category loglandı");
    }
}
