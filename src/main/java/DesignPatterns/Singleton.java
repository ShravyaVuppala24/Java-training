package DesignPatterns;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getObject() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
        public static void main(String[] args) {
            Singleton singleton1 = Singleton.getObject();
            Singleton singleton2 = Singleton.getObject();
            System.out.println(singleton1);
            System.out.println(singleton2);

    }
}
