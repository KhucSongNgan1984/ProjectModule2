package Module2Tuan2.MiniTest1.Employee;

public class FulltimeStaft extends Staft {
    private double bonus;
    private double fine;
    private double salary;
    public void FulltimeStaft(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }
    public double getPaidFulltime() {
        return (salary + bonus - fine);
    }
}
