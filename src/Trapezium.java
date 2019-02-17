
public class Trapezium extends Figures {
	public Trapezium() {
		setColor();
		setDownSide(randomNumber());
		setHeight(randomNumber());
		setUpperSide(randomNumber());
	}

	private double upperSide;
	private double downSide;
	private double height;

	private final String NAME = "трапеция";

	@Override
	double uniqueMethod() { // Средняя линия
		double middleLine = (getDownSide() + getUpperSide()) / 2;
		middleLine = roundToHundredths(middleLine);
		System.out.print(" средняя линия: " + middleLine + " ед.,");
		return middleLine;
	}

	@Override
	double figureArea() {
		double figureArea = ((getDownSide() + getUpperSide()) / 2) * getHeight();
		figureArea = roundToHundredths(figureArea);
		return figureArea;
	}

	public double getUpperSide() {
		return upperSide;
	}

	public void setUpperSide(double upperSide) {
		this.upperSide = upperSide;
	}

	public double getDownSide() {
		return downSide;
	}

	public void setDownSide(double downSide) {
		this.downSide = downSide;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getNAME() {
		return NAME;
	}
}
