package b9a_group3;

public class MarineDreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      //crearting customer object (fill info)
    static Customer createCustomer() {
        System.out.print("\n------- Customer Information -------");
        System.out.print("\n-- Enter your first name: ");
        String name = input.next();

        System.out.print("-- Enter your age: ");
        int age = input.nextInt();

        System.out.print("-- Enter your phone number: ");
        String phone = input.next();

        return new Customer(name, phone, age);
    }
    static void displayUgrade(Service service, int choice) {
        if (service instanceof Fishing) {
            output.println(((Fishing) service).upgradeTicket(choice));
        } else {
            output.println(((Sailing) service).upgradeTicket(choice));
        }
    }
}
