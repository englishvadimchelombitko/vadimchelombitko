
public class Circle extends Figures {
	public Circle() {
		setColor();
		setRadius(randomNumber());
	}

	private final String NAME = "круг";

	@Override
	double uniqueMethod() { // Радиус
		System.out.print(" радиус: " + getRadius() + " ед.,");
		return getRadius();
	}

	public String getNAME() {
		return NAME;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double figureArea() {
		double figureArea = Math.PI * getRadius() * getRadius();
		figureArea = Math.round(figureArea * 10) / 10.0d;// Округление до сотых
		return figureArea;
	}
}
