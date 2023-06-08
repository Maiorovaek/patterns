public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;


    public GumballMachine(int numberGumballs) {

        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }


    public void insertQuarter() {
        state.insertQuarter();

    }


    void refill(int count) {
        this.count += count;
        System.out.println("the gumball machine was just refilled; it's new count is:  " + this.count);
        state.refill();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turnCrank() {
        state.turnCrank();
        System.out.println("STATE " + getState());
        state.dispense();
    }

     void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }

    }

    //
//    final static int SOLD_OUT = 0; // нет шариков
//    final static int NO_QUARTER = 1; //  нет монетки
//    final static int HAS_QUARTER = 2; //есть монетка
//    final static int SOLD = 3; // шарик продан
//    final static  int WINNER = 4;
//
//    int state = SOLD_OUT;
//    int count = 0;
//
//    public GumballMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER; //ожидает, когда кинут монетку
//        }
//    }
//
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can't insert another quarter");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("you inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can't insert a quarter, th  machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we're already giving you a gumball");
//        }
//    }
//
//    public void ejectQuarter() { //если покупатель захочет вернуть монетку
//        if (state == HAS_QUARTER) {
//            System.out.println("Quarter returned");
//            state = NO_QUARTER;
//        } else if (state == NO_QUARTER) {
//            System.out.println("you haven't inserted a quarter");
//        } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned the crank");
//        } else if (state == SOLD_OUT) {
//            System.out.println("you can't eject a quarter , you haven't inserted a quarter yet ");
//        }
//    }
//
//    public void turnCrank() { //покупатель пытается дернуть за рычаг
//        if (state == SOLD) {
//            System.out.println("Turning twice doesn't get you another gumball");
//        } else if (state == NO_QUARTER) {
//            System.out.println("you turned but there's no quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("you turned but there's are no gumballs");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("you turned...");
//            state = SOLD;
//            dispense();
//        }
//    }
//
    @Override
    public String toString() {
        return "State{" +
                "state=" + state.getClass().getName() +
                ", count=" + count +
                '}';
    }


//
//    private void dispense() { //вызывается для выдач шарика
//        if (state == SOLD) {
//            System.out.println("A gumball comes rolling out the slot"); //Жевательная резинка выкатывается из слота
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Oops, out of gumballs");
//                state = SOLD_OUT;// нет шариков
//            } else {
//                state = NO_QUARTER;//нет монетки
//            }
//        } else if (state == NO_QUARTER) {
//            System.out.println("you need to pay first");
//        } else if (state == SOLD_OUT) {
//            System.out.println("no gumball dispensed");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispensed");
//        }
//    }
}
