import models.Persion;

public class App {
    public static void main(String[] args) throws Exception {
        // Persion persion = new Persion();
        // persion.setEmpID(1);
        // persion.setName("Khanh");
        // persion.setDateOfBirth(20);
        // persion.setAddress("Danang");

        // System.out.println("ID :" + " " + persion.getEmpID());
        // System.out.println("Name :" + " " + persion.getName());
        // System.out.println("DateOfBirth :" + " " + persion.getDateOfBirth());
        // System.out.println("Address :" + " " + persion.getAddress());

        Persion pr = new Persion(2, "Hoang", 10, "Hanoi");

        int id = pr.getEmpID();
        String name = pr.getName();
        int day = pr.getDateOfBirth();
        String add = pr.getAddress();

        System.out.println("ID : " + ' ' + id);
        System.out.println("Name : " + ' ' + name);
        System.out.println("Day : " + ' ' + day);
        System.out.println("Address : " + ' ' + add);
    }
}
