package ChristmasWorkshop.MagicBoard;

public class DollMaking implements MagicWords{
    private Wishes santasWishes;

    public DollMaking(Wishes santasWishes){
        this.santasWishes = santasWishes;
    }

    public void words(){
        santasWishes.makeDolls();
    }
}
