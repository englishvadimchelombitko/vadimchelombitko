
public class Square extends Figures {
	public Square() {
		setColor();
		setSizeOfSide(randomNumber());
	}

	private final String NAME = "квадрат";

	public String getNAME() {
		return NAME;
	}

	@Override
	double uniqueMethod() { // Длинна стороны
		System.out.print(" длинна стороны: " + getSizeOfSide() + " ед.,");
		return getSizeOfSide();
	}

	private double sizeOfSide;

	@Override
	double figureArea() {
		double figureArea = getSizeOfSide() * getSizeOfSide();
		return roundToHundredths(figureArea);
	}

	public double getSizeOfSide() {
		return sizeOfSide;
	}

	public void setSizeOfSide(double sizeOfSide) {
		this.sizeOfSide = sizeOfSide;
	}

}
