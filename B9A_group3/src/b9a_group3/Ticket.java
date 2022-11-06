package b9a_group3;

public class Ticket {


    private int ticketID;
    private Customer customer;
    private Fishing fishing;
    private Sailing sailing;

    public Ticket(Customer customer, Fishing fishing) {
        this.ticketID = (int) ((Math.random() * (1000 - 100)) + 100);
        this.customer = customer;
        this.fishing = fishing;
    }

    public Ticket(Customer customer, Sailing sailing) {
        this.ticketID = (int) ((Math.random() * (1000 - 100)) + 100);
        this.customer = customer;
        this.sailing = sailing;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getBooking() {
        if (fishing != null) {
            return fishing;
        } else {
            return sailing;
        }
    }

    public void setBooking(Service service) {
        if (service instanceof Fishing) {
            this.fishing = (Fishing) service;
        } else {
            this.sailing = (Sailing) service;
        }
    }

    
    public Fishing getFishing() {
        return fishing;
    }

    public Sailing getSailing() {
        return sailing;
    }
    
    
    public String displayTicket() {

        if (fishing != null) {
            return "\n----------- Thank you for your reserveation from Marine Dream -----------"
                    + "\nCustomer details: "
                    + "\n-- Name: " + customer.getName() + "\t Phone: " + customer.getPhone() + "\tAge: " + customer.getAge()
                    + "\nTicket details:"
                    + "\n-- Service type: Fishing - Basic, ID: " + getTicketID() + "\tTime: " + fishing.getTime() + "\tDate: " + fishing.getDate() + "\tDuration: " + fishing.getDuration()
                    + "\n-- Fishing Payload: " + fishing.getFishingPayLoad() + "\tequipments: basic "
                    + "\n"
                    + "\nTicket price: " + fishing.getPrice() + "$"
                    + "\n----------------------------------------------";
        } else {

            return "\n----------- Thank you for your reserveation from Marine Dream -----------"
                    + "\nCustomer details: "
                    + "\n-- Name: " + customer.getName() + "\t Phone: " + customer.getPhone() + "\tAge: " + customer.getAge()
                    + "\nTicket details:"
                    + "\n-- Service type: Sailing - Basic, ID: " + getTicketID() + "\tTime: " + sailing.getTime() + "\tDate: " + sailing.getDate() + "\tDuration: " + sailing.getDuration()
                    + "\tNumber of people: " + sailing.getNumOfPeople()
                    + "\nTicket price " + sailing.getPrice() + "$"
                    + "\n--------------------------------------------------";
        }
    }
}
