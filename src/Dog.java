public class Dog extends Animals implements Swimmable {
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }


    @Override
    public void run(int distance) {
        if (distance < MAX_RUN) {
            numberMessage(getName() + " was ran " + distance + " meters.");
        } else {
            numberMessage(getName() + " cant run this distance. =(");
        }
    }


    @Override
    public void swim(int distance) {
        if (distance < MAX_SWIM) {
            numberMessage(getName() + "was swam " + distance + " meters.");
        } else {
            numberMessage(getName() + " cant swim this distance ");
        }
    }
        public static int getDogCount() {
            return dogCount;

    }
}

