package marinedream;

public class Sailing extends Service {

    private int numOfPeople;

    public Sailing(int numOfPeople, String time, String date, int duration) {
        super(time, date, duration);
        super.setPrice(200 * numOfPeople);
        this.numOfPeople = numOfPeople;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public String upgradeTicket(int upgrade) {
        if (upgrade == 1) {
            super.setPrice(super.getPrice() + 200);
            return "\n----------- Ticket is upgrader to VIP -----------"
                    + "\nVIP services:"
                    + "\n-- Meal of your choice"
                    + "\n-- Sea activites"
                    + "\nUpgraded ticket price: " + super.getPrice() + "$"
                    + "\n\"----------------------------------------------";
        } else {
            super.setPrice(super.getPrice() + 1300);
            return "\n----------- Ticket is upgrader to VVIP -----------"
                    + "\nVVIP services:"
                    + "\n-- Cuisine of your choice"
                    + "\n-- Snorkeling"
                    + "\n-- Jetski"
                    + "\nUpgraded ticket price: " + super.getPrice() + "$"
                    + "\n----------------------------------------------";
        }
    }
}
