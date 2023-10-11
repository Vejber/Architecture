package Fabric;

import Interfaces.IGameItem;
import Product.Metal;

public class MetalGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem(){
        return new Metal();
    }
}
