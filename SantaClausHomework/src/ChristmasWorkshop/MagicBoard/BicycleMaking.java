package ChristmasWorkshop.MagicBoard;

public class BicycleMaking implements MagicWords{

    private Wishes santasWishes;

    public BicycleMaking(Wishes santasWishes){
        this.santasWishes = santasWishes;
    }

    public void words(){
        santasWishes.makeBicycles();
    }
}
