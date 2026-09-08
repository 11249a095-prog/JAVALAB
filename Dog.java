class Animal {
    public final void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}