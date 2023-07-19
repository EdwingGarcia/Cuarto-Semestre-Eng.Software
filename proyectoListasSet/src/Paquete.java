public class Paquete {
   private int TrackingNum;
   private String addr;
   private float weight;
   private String city;
   private String ownerName;

    public Paquete(int trackingNum, String addr, float weight, String city, String ownerName) {
        TrackingNum = trackingNum;
        this.addr = addr;
        this.weight = weight;
        this.city = city;
        this.ownerName = ownerName;
    }

    public int getTrackingNum() {
        return TrackingNum;
    }

    public void setTrackingNum(int trackingNum) {
        TrackingNum = trackingNum;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Paquete" +
                "\tTrackingNum: " + TrackingNum +
                "\taddr: " + addr +
                "\tweight: " + weight +
                "\tcity: " + city +
                "\townerName: " + ownerName;
    }
}
