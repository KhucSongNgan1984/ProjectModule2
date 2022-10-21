package Module2Tuan2.Bai7;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck";

    }
    @Override
    public String howToEat() {
        return "could be Fried";
    }
}
