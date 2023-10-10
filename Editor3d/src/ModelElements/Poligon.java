package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();


    // automatic constructor:
    // public Poligon(List<Point3d> points) {
    //     this.points = points;
    // }

    // from seminar constructor:
    public Poligon(Point3D point) {
        points.add(point);
    }

}
