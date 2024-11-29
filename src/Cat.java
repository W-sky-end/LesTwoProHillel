public class Cat extends Animals{
    private static final int MAX_RUN = 200;
    private static int catCount = 0;

    public Cat (String name){
        super(name);
        catCount++;
    }


    @Override
    public void run(int distance) {
        if (distance < MAX_RUN) {
            numberMessage(getName() + "was ran " + distance + " meters.");
        } else {
            numberMessage(getName() + " cant run this distance. =(");
        }
    }
    public static int getCatCount() {
        return catCount;
    }
}
