package ChristmasWorkshop.MagicBoard;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<MagicWords>magicWordsList = new ArrayList<MagicWords>();
    public void takeMagicWords(MagicWords magicWords){
        magicWordsList.add(magicWords);
    }

    public void placeMagicWords(){
        for (MagicWords magicWords : magicWordsList){
            magicWords.words();
        }

        magicWordsList.clear();
    }

}
