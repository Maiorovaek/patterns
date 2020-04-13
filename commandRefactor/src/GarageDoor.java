public class GarageDoor implements Command {
    public void up() {
        System.out.println("Open door");
    }
    public void close() {
        System.out.println("Close door");
    }

    @Override
    public void execute() {
    }
}
