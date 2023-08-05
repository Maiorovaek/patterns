public class DuckSimulatorTest {

    public static void main(String[] args) {
        DuckSimulatorTest duckSimulator = new DuckSimulatorTest();

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        System.out.println("\nDuck simulator");
        System.out.println("\nDuck simulator with composite - Flocks");
        Flock flockOfDuck = new Flock();
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDuck.add(flockOfMallards);

        System.out.println("\nDuck Simulator: with Observer");
        Quackologistic quackologist = new Quackologistic();
        flockOfDuck.registerObserver(quackologist);

        simulate(flockOfDuck);


        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times!");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }


}
