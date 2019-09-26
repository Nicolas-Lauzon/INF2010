package tp1;

import java.util.HashSet;
import java.util.Set;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        this.add(new Point2d(width,height));
    }

    // TODO creer un rectangle avec un point contenant la largeur et longueur.
    public Rectangle(Point2d dimensions) {
        this.add(dimensions);
    }

    private Rectangle(Set<Point2d> coords) {
        super(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Rectangle translate(Point2d point) {
        return (new Rectangle(this.translateAll(point)));
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Rectangle rotate(Double angle) {

        return (new Rectangle(this.rotateAll(angle)));
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Rectangle clone() {
        return (new Rectangle(this.getCoords()));
    }
}
