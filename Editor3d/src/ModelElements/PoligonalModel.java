package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;
    
    public PoligonalModel(List<Texture> Textures) { //Textures - отношение агрегации, поэтому текстурес создаются вне класса
        this.Textures = Textures;
        this.Poligons = new ArrayList<>(); // полигонс - отношение компонента, поэтому они создаются внутри класса
    
        this.Poligons.add(new Poligon(new Point3D()));
    }
    
}
