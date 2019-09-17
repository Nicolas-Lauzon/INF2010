package tp1;

import java.util.*;
import java.util.stream.Collectors;

public final class PointOperator {
    // TODO appliquer la translation sur le vecteur d'entree.
    public static Double[] translate(Double[] vector, Double[] translateVector) {
        if (vector.length == translateVector.length) {
            for (int i = 0; i < vector.length; i++)
                vector[i] += translateVector[i];
            return vector;
        }
        return vector;
    }

    // TODO appliquer la rotation sur le vecteur d'entree.
    public static Double[] rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] temp = new Double[vector.length];
        Double x;
        if (vector.length == rotationMatrix[0].length) {
            for (int i = 0; i < vector.length; i++) {
                x=0.00;
                for (int j = 0; j < vector.length; j++) {
                        x += vector[j] * rotationMatrix[i][j];
                    }
                temp[i]=x;
                }
            return temp;
        }
        return null;
    }

    // TODO appliquer le facteur de division sur le vecteur d'entree.
    public static Double[] divide(Double[] vector, Double divider) {
        for (int i=0 ; i<vector.length ; i++){
            vector[i] /=divider;
        }
        return vector;
    }

    // TODO appliquer le facteur de multiplication sur le vecteur d'entree.
    public static Double[] multiply(Double[] vector, Double multiplier) {
        for (int i=0 ; i<vector.length ; i++){
            vector[i]*=multiplier;
        }
        return vector;
    }

    // TODO appliquer le facteur d'addition sur le vecteur d'entree.
    public static Double[] add(Double[] vector, Double adder) {
        for (int i=0 ; i<vector.length ; i++){
            vector[i]+=adder;
        }
        return vector;
    }

    // TODO retourne la coordonnee avec les plus grandes valeurs en X et en Y.
    public static Point2d getMaxCoord(Collection<Point2d> coords) {
        Double coordXmax = 0.0;
        Double coordYmax = 0.0;
        if(!coords.isEmpty()) {
            coordXmax = Collections.max(coords.stream().map(x -> x.X()).collect(Collectors.toList()));
            coordYmax = Collections.max(coords.stream().map(y -> y.Y()).collect(Collectors.toList()));
        }
        return (new Point2d(coordXmax, coordYmax));
    }

    // TODO retourne la coordonnee avec les plus petites valeurs en X et en Y.
    public static Point2d getMinCoord(Collection<Point2d> coords) {
        Double coordXmin = 0.0;
        Double coordYmin = 0.0;
        if(!coords.isEmpty()) {
            coordXmin = Collections.min(coords.stream().map(x -> x.X()).collect(Collectors.toList()));
            coordYmin = Collections.min(coords.stream().map(x -> x.Y()).collect(Collectors.toList()));
        }
        return (new Point2d(coordXmin, coordYmin));
    }
}
