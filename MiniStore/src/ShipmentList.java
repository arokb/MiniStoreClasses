import java.util.ArrayList;

public class ShipmentList {
    private ArrayList<Shipment> shipmentList = new ArrayList<>();

    public ShipmentList() {

    }

    public Shipment get(int index) {
        return shipmentList.get(index);
    }

    public void add(Shipment shipment) {
        shipmentList.add(shipment);


    }

    public int findShipment(Destination dest) {
        return 0;
    }

    public int length() {
        return shipmentList.size();
    }

    public String toString() {
        return shipmentList + "";
    }
}
