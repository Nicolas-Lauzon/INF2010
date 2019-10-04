package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 10;

    // TODO
    public static BaseShape create_H() {
        BaseShape grandeBarre = new Rectangle(stripeThickness, maxHeight);
        BaseShape petiteBarre = new Rectangle(halfMaxHeight, stripeThickness);
        BaseShape barreGauche = grandeBarre.translate(new Point2d(-halfMaxWidth,0.00));
        BaseShape barreDroite = grandeBarre.translate(new Point2d(halfMaxWidth,0.00));
        BaseShape barreCentre = petiteBarre.translate(new Point2d(0.0, halfMaxHeight));
        barreGauche.add(barreCentre);
        barreGauche.add(barreDroite);
        return barreGauche;

    }

    // TODO
    public static BaseShape create_e() {
        BaseShape cercle = new Ellipse(halfMaxWidth, halfMaxHeight);
        BaseShape cercleNoir = new Ellipse(halfMaxHeight - stripeThickness, halfMaxHeight - stripeThickness);
        BaseShape barreCentre = new Rectangle(maxWidth, maxHeight);
        BaseShape barreNoire = new Rectangle(stripeThickness, 20.0);
        barreNoire.translate(new Point2d(halfMaxWidth + (stripeThickness/2), -(stripeThickness/2 + 20.0)));
        cercle.remove(cercleNoir);
        cercle.add(barreCentre);

        return cercle;
    }

    // TODO
    public static BaseShape create_l() {
        return (new Rectangle(stripeThickness,maxHeight));
    }

    // TODO
    public static BaseShape create_o() {
        BaseShape cercleExt = new Ellipse(halfMaxHeight,halfMaxWidth);
        BaseShape cercleInt = new Ellipse(halfMaxHeight- stripeThickness,halfMaxWidth-stripeThickness);
        cercleExt.remove(cercleInt);
        return cercleExt;
    }

    // On vous donne la lettre W comme exemple.
    public static BaseShape create_W() {
        Double degrees15 = Math.toRadians(8);
        Double spacing = stripeThickness * 2;
        BaseShape mainStripe = new Rectangle(stripeThickness, maxHeight);
        BaseShape leftStripe = mainStripe.rotate(-degrees15).translate(new Point2d(-spacing, 0.0));
        BaseShape middleLeftStripe = mainStripe.rotate(degrees15).translate(new Point2d(-spacing / 3, 0.0));
        BaseShape middleRightStripe = mainStripe.rotate(-degrees15).translate(new Point2d(spacing / 3, 0.0));
        BaseShape rightStripe = mainStripe.rotate(degrees15).translate(new Point2d(spacing, 0.0));
        leftStripe.add(middleLeftStripe);
        leftStripe.add(middleRightStripe);
        leftStripe.add(rightStripe);
        return leftStripe;
    }

    // TODO
    public static BaseShape create_r() {
        BaseShape barreDroite = new Rectangle(stripeThickness, maxHeight);
        BaseShape cercle = new Circle(halfMaxWidth);
        BaseShape cercleNoir = new Circle(halfMaxWidth - stripeThickness);
        cercle.remove(cercleNoir);
        barreDroite.translate(new Point2d(-halfMaxWidth, 0.0));
        cercle.translate(new Point2d(0.0, 50.0));
        barreDroite.add(cercle);
        return barreDroite;
    }

    // TODO
    public static BaseShape create_d() {
        BaseShape cercle = new Circle(halfMaxWidth);
        BaseShape barreDroite = new Rectangle(stripeThickness, maxHeight);
        barreDroite.translate(new Point2d(halfMaxWidth, 0.0));
        BaseShape cercleNoir = new Circle(halfMaxWidth - stripeThickness);
        cercle.remove(cercleNoir);
        cercle.translate(new Point2d(0.0, -50.0));
        cercle.add(barreDroite);
        return null;
    }
}
