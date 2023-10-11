package Fabric;

import Interfaces.IGameItem;
import Product.Hay;

public class HayGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem(){
        return new Hay();
    }
}
