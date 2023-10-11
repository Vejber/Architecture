package Fabric;

import Interfaces.IGameItem;
// import Interfaces.iGameItem;
import Product.Gold;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem(){
        return new Gold();
        // check returns of igameitem maybe
    }
}
