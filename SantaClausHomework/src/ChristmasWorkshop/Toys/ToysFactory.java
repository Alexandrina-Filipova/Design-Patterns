package ChristmasWorkshop.Toys;

public class ToysFactory {

    public Toys beginMaking(String modelToys){

        if(modelToys == null){
            return null;
        }

        if(modelToys.equalsIgnoreCase("DOLL")){
            return new Doll();
        } else if(modelToys.equalsIgnoreCase("BICYCLE")){
            return new Bicycle();
        }

        return null;
    }
}
