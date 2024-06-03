package DesignPatterns;

    interface Cookie {
        void bake(); //method declaration
    }
    class ChocolateChipCookie implements Cookie {
        public void bake() {
            System.out.println("Baking a chocolate chip cookie!");
        }
    }

    class OatmealCookie implements Cookie {
        public void bake() {
            System.out.println("Baking an oatmeal cookie!");
        }
    }
    abstract class CookieFactory {
        // The recipe method
        public abstract Cookie createCookie();

        public void bakeCookie() {
            Cookie c = createCookie(); //magic point where the type is decided as per the method calls and not pre-decided
            c.bake();
        }
    }
    class ChocolateChipCookieFactory extends CookieFactory {
        public Cookie createCookie() {
            return new ChocolateChipCookie();
        }
    }
    class OatmealCookieFactory extends CookieFactory {
        public Cookie createCookie() {
            return new OatmealCookie();
        }
    }
    public class FactoryMethod {
        public static void main(String[] args) {
            CookieFactory cc = new ChocolateChipCookieFactory();
            cc.bakeCookie();  // Output: Baking a chocolate chip cookie!

            CookieFactory om = new OatmealCookieFactory();
            om.bakeCookie();  // Output: Baking an oatmeal cookie!
        }
    }

// First we create an object called cc of CookieFactory and instantiate it to ChocolateChipCookieFactory, now we called the method
//bakeCookie() on cc object. The system will first check for bakeCookie(); in ChocolateChipCookieFactory(since it is instantiated to it)
//if not found it would check CookieFactory. In this case it will find bakeCookie(); in CookieFactory and not in ChocolateChipCookieFactory
// therefore bakeCookie() method of CookieFactory is executed. Within this method, we create an object called c of Cookie and
//call createCookie() method, since createCookie(); method will be found in ChocolateChipCookieFactory, that is executed.
//This createCookie() method of ChocolateChipCookieFactory returns an object of ChocolateChipCookie and this object is assigned to c.
//bake() method is now called on c. The system checks bake method in ChocolateChipCookie as it is an object instantiated to ChocolateChipCookie
//Since ChocolateChipCookie will have bake() it will execute it and print "Baking a chocolate chip cookie!"