/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9a_group3;

public class Fishing extends Service {

    private int fishingPayLoad;


    public Fishing(String time, String date, int duration) {
        super(time, date, duration);
        super.setPrice(2000);
        this.fishingPayLoad = 50;

    }

    public int getFishingPayLoad() {
        return fishingPayLoad;
    }

    public void setFishingPayLoad(int fishingPayLoad) {
        this.fishingPayLoad = fishingPayLoad;
    }

    public String upgradeTicket(int upgrade) {
        if (upgrade == 1) {
            super.setPrice(super.getPrice() + 1500);
            return "\n----------- Ticket is upgrader to VIP -----------"
                    + "\nVIP services:"
                    + "\n-- Fisherman helper"
                    + "\n-- 2x Fishing payload"
                    + "\n-- Inshore fishing"
                    + "\nUpgraded ticket price: " + super.getPrice() + "$"
                    + "\n\"----------------------------------------------";
        } else {
            super.setPrice(super.getPrice() + 3000);
            return "\n----------- Ticket is upgrader to VVIP -----------"
                    + "\nVVIP services:"
                    + "\n-- Fisherman helper"
                    + "\n-- 3x Fishing payload"
                    + "\n-- Deep sea fishing"
                    + "\nUpgraded ticket price: " + super.getPrice() + "$"
                    + "\n\"----------------------------------------------";
        }
    }
}
