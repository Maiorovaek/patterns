package facade;

public class PopcornPopper {

    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void pop() {
        System.out.println(description + " popping popcorn! ");
    }

    public void off() {
        System.out.println(description + " off");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
