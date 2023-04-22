package models;

/**
 * Persion
 */
public class Persion {
    public int empID;
    public String name;
    public int dateOfBirth;
    public String address;

    public Persion() {
    }

    public Persion(int empID, String name, int dateOfBirth, String address) {
        this.empID = empID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}