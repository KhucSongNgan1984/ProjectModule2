package Module2Tuan2.Bai7;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
//        Test class extends Animals implements method
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());
        }
//Test class Chicken implements Interface Edible
        Animals[] animals1 = new Animals[2];
        animals1[0] = new Tiger();
        animals1[1] = new Chicken();
        for (Animals animal1 : animals1) {
            System.out.println(animal1.makeSound());
            if (animal1 instanceof Chicken) {
                Edible edible = (Chicken) animal1;
                System.out.println(edible.howToEat());
                }
            }
        }
    }

