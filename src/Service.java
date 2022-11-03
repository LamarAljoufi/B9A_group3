public class Service {

    private String time;
    private String date;
    private int duration;
    private String[] upgradeTypes = {"Basic", "VIP", "VVIP"};
    private String upgrade;
    private double price;

    public Service(String time, String date, int duration) {
        this.time = time;
        this.date = date;
        this.duration = duration;
        this.upgrade = upgradeTypes[0];
    }

    public String[] getUpgradeTypes() {
        return upgradeTypes;
    }

    public void setUpgradeTypes(String[] upgradeTypes) {
        this.upgradeTypes = upgradeTypes;
    }

    public String getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean checkUpgradeTicket(int upgrade) {
        if (upgrade >= 1 && upgrade <= 2) {
            this.upgrade = upgradeTypes[upgrade];
            return true;
        } else {
            return false;
        }

    }

}
