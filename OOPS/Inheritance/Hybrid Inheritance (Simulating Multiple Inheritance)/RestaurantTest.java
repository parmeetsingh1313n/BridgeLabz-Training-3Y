// Superclass Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface Worker
interface Worker {
    void performDuties();
}

// Chef extends Person + implements Worker
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}

// Waiter extends Person + implements Worker
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Ankit", 1);
        Worker w2 = new Waiter("Amit", 2);

        w1.performDuties();
        w2.performDuties();
    }
}
