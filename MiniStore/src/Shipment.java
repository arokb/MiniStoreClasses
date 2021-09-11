public class Shipment {
    public Destination destination;
    private double shipValue;

    public Shipment() {

    }

    public Shipment(Destination dest, double value) {
        this.destination = dest;
        this.setShipValue(value);
    }

    public double getShipValue() {
        if(shipValue == 0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
        return shipValue;
    }

    public void setShipValue(double shipValue) {
        this.shipValue = shipValue;
    }

    public void addShipValue(double value) {
        if(shipValue == 0) {
            throw new IllegalArgumentException("Value cannot be zero");
        }
        shipValue+=value;
    }

    public String toString() {
        return "Your destination is: " + destination + " " + shipValue;

    }


}
