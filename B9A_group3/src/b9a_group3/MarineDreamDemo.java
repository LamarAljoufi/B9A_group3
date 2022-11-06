/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b9a_group3;

/**
 *
 * @author DELL
 */
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
    
}
