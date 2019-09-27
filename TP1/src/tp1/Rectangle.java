package tp1;

import java.util.HashSet;
import java.util.Set;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        for (int i = (int) -width/2; i < width/2; i++){
            for (int j = (int) -width/2; j < width/2; j++){
                this.add(new Point2d(width,height));
            }
        }

            }

    // TODO creer un rectangle avec un point contenant la largeur et longueur.
    public Rectangle(Point2d dimensions) {
        Point2d point = new Point2d(dimensions.vector[0], dimensions.vector[1]);
        for (int i = (int) -point.vector[0]/2; i < point.vector[0]/2; i++){
            for (int j = (int) -point.vector[1]/2; j <-point.vector[1]/2; j++){
                this.add(new Point2d(point.vector[0],point.vector[1]));
            }
        }


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
