/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customer;

/**
 *
 * @author Linathi
 */
public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isMember;
    
    //Constructor to initialize our variables
    public Customer(String name, String email, String phoneNumber, boolean isMember){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isMember = isMember;
    }
    
    //Function for displaying the results
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Email: " +email);
        System.out.println("Phone Number: " +phoneNumber);
        System.out.println("Member: " + (isMember ? "Yes" : "No"));
        System.out.println();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create array f books
        Customer[] customer = new Customer[5];
        
        customer[0] = new Customer("Alice Johnson", "alicej@gmail.com", "655-2134",true);
        customer[1] = new Customer("Bob Smith", "bobs@yahoo@gmail.com", "655-2208", false);
        customer[2] = new Customer("Carol White", "carolw@outlook.com", "655-2203", true);
        customer[3] = new Customer("David Brown", "davidb@cput.ac.za", "655-2247", false);
        
        for(int i = 0; i < 4; i++){
            customer[i].display();
        }
    }
    
}
