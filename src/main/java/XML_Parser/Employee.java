package XML_Parser;

public class Employee {
    public String name;
    public String job;
    public String floor;
    public String room;

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
