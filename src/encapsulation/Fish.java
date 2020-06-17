package encapsulation;

public class Fish {

    private String fishName;
    private double price;
    private String DOB;
    private int fishId;

    public Fish(){
    }

    public Fish(String fishName, double price) {
        this.fishName = fishName;
        this.price = price;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getFishId() {
        return fishId;
    }

    public void setFishId(int fishId) {
        this.fishId = fishId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
