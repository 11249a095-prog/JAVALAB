class StaticDemo {
    static int num = 10;
    static void display() {
        System.out.println("Static value: " + num);
    }
    public static void main(String[] args) {
        StaticDemo.display();
    }
}