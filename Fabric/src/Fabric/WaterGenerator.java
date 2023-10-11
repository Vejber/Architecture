package Fabric;

import Interfaces.IGameItem;
import Product.Water;

public class WaterGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem(){
        return new Water();
    }
}
