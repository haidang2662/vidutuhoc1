public class Employee extends Person{
    private double exp;
    private String placeWork;

    public Employee(int id, String name, int age) {
        super(id, name, age);
    }

    public Employee(int id, String name, int age, double exp, String placeWork) {
        super(id, name, age);
        this.exp = exp;
        this.placeWork = placeWork;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Employee{" +"id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", exp=" + exp + '\'' +
                ", placeWork='" + placeWork + '\'' +
                '}';
    }
}
