public class Emp {
    int id;
    String firstName;
    String lastName;
    String department;
    String position;

    public Emp(){

    }

    public Emp(int id, String firstName, String lastName, String department, String position){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.position=position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    void printDetails(){
        System.out.println("id:"+this.getId());
        System.out.println("firstName:"+this.getFirstName());
        System.out.println("lastName:"+this.getLastName());
        System.out.println("Department:"+this.getDepartment());
        System.out.println("Position:"+this.getPosition());
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
