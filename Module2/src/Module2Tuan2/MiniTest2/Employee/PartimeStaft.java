package Module2Tuan2.MiniTest1.Employee;

public class PartimeStaft extends Staft {
    private double workHours;
    public void PartimeStaft() {}
    public double getPaidPartime() {
        return workHours * 100000;
    }
}
