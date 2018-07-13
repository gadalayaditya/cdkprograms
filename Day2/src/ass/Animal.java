package ass;

/**
 * Created by gadalaya on 7/7/2017.
 */
public abstract class Animal {
    String pet_name;

    Animal(String name)
    {
        pet_name = name;
    }

    abstract void speak();
}

class Donkey extends Animal{
    Donkey(String pet_name)
    {
        super(pet_name);
    }

    void speak() {
        System.out.println(this.pet_name + " bray!");
    }
}

class Monkey extends Animal{
    Monkey(String pet_name)
    {
        super(pet_name);
    }

    void speak() {
        System.out.println(this.pet_name + " chatter!");
    }
}
class cal {
    public static void main(String[] args) {
        Animal a1 = new Monkey("mon");
        Animal a2 = new Donkey("don");
        a1.speak();
        a2.speak();
    }

}