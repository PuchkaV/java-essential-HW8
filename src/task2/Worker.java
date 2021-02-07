package task2;



public class Worker {
    private String name;
    private String position;
    private int yearOFemployment;


    public Worker(String name, String position, int yearOFemployment) {
        this.name = name;
        this.position = position;
        this.yearOFemployment = yearOFemployment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearOFemployment() {
        return yearOFemployment;
    }

    public void setYearOFemployment(int yearOFemployment) {
        this.yearOFemployment = yearOFemployment;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", yearOFemployment=" + yearOFemployment;
    }
}
