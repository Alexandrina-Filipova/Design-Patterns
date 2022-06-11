package ChristmasWorkshop.Toys;

public class ToysFactoryMain {

    public static void main(String[] args) {
        ToysFactory toysFactory = new ToysFactory();

            Toys doll = toysFactory.beginMaking("DOLL");
            doll.play();

            Toys bicycle = toysFactory.beginMaking("BICYCLE");
            bicycle.play();

    }
}
