public abstract class Animals {
    private String name;
    private static int animalCount;
    private static int messageCount;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    protected void numberMessage (String message){
        messageCount++;
        System.out.println(messageCount + ")" + message);
    }
    public static int getAnimalCount(){
        return animalCount;
    }

}
