package basetask;

public class Bee {

    private String gender;

    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public static void printBeeDetails(String gender, long weight) {
        long weightDifference = 500 / weight;

        System.out.println("Я легче лося в " + weightDifference + " раз");
    }

}
