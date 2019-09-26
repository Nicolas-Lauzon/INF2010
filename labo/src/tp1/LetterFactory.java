package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 10;

    // TODO
    public static BaseShape create_H() {
        /*BaseShape barreDroite = new Rectangle(stripeThickness, maxHeight);
        BaseShape barreGauche = new Rectangle(stripeThickness, maxHeight);
        BaseShape barreCentre = new Rectangle(halfMaxHeight, stripeThickness);
        barreDroite.translate(new Point2d(halfMaxHeight,0.00));
        barreCentre.translate(new Point2d(stripeThickness, halfMaxHeight));
        barreGauche.add(barreCentre);
        barreGauche.add(barreDroite);
        return barreGauche;*/
        BaseShape barreDroite = new Rectangle(stripeThickness,maxHeight);
        BaseShape barreGauche = barreDroite.translate(new Point2d(halfMaxHeight,0.00));
        BaseShape barreCentre = new Rectangle(halfMaxHeight,stripeThickness).translate(new Point2d(stripeThickness,halfMaxHeight));
        barreGauche.add(barreDroite);
        barreGauche.add(barreCentre);
        return barreGauche;
    }

    // TODO
    public static BaseShape create_e() {

        return null;
    }

    // TODO
    public static BaseShape create_l() {
        return (new Rectangle(stripeThickness,maxHeight));
    }

    // TODO
    public static BaseShape create_o() {
        BaseShape cercleExt = new Ellipse(maxHeight,maxWidth);
        BaseShape cercleInt = new Ellipse(maxHeight-(stripeThickness*2),maxWidth-(stripeThickness*2));
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
        return null;
    }

    // TODO
    public static BaseShape create_d() {
        return null;
    }
}
