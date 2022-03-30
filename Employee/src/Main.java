public class Main {
    public static void main(String[] args) {

        Emp e1=new Emp();
        e1.setId(21);
        e1.setFirstName("Yukta");
        e1.setLastName("Yadav");
        e1.setDepartment("Business");
        e1.setPosition("MD");

        System.out.println("Details for employee 1");
        e1.printDetails();


        Emp e2=new Emp(21,"Lucky","Gupta","Business","Junior_Analyst");
        System.out.println("Details for employee 2");
        e2.printDetails();
    }
}