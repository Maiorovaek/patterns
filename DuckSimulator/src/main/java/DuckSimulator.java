public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        //  Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();
//        Quackable mallardDuck = new QuackCounter(new MallardDuck());
//        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
//        Quackable duckCall = new QuackCounter(new DuckCall());
//        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        //  Quackable goose = new GooseAdapter(new Goose());

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

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDuck);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println();
        //  simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);


        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times!");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }


}
