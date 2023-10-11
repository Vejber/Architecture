package Fabric;

import Interfaces.IGameItem;
import Product.Fire;

public class FireGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem(){
        return new Fire();
    }
}
