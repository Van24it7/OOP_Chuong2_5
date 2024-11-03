public class TestAccount {
    public static void main(String[] args) {
        Customer c1 = new Customer(113, "Nguyen Hoa Van", 'm');
        System.out.println(c1);

        Account a1 = new Account(226, c1, 200.0);
        System.out.println(a1);
        a1.setBalance(300.0);
        System.out.println(a1);
        System.out.println("id is: "+a1.getId());
        System.out.println("Customer is: "+a1.getCustomer());
        System.out.println("balance is:$"+a1.getBalance());
        System.out.println("Customer's Name is: "+a1.getCustomerName());
        a1.deposit(200.0);
        a1.withdraw(100.0);
        System.out.println(a1);

    }
}
