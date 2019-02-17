
public class Triangle extends Figures {

	public Triangle() {
		setColor();
		setLeg1(randomNumber());
		setLeg2(randomNumber());
	}

	private final String NAME = "треугольник";

	@Override
	double uniqueMethod() { // Гипотенуза
		double hypotenuse = Math.sqrt(this.getLeg1() * this.getLeg1() + this.getLeg2() * this.getLeg2());
		hypotenuse = roundToHundredths(hypotenuse); 
		System.out.print(" гипотенуза: " + hypotenuse + " ед.,");
		return hypotenuse;
	}

	public String getNAME() {
		return NAME;
	}

	private double leg1;
	private double leg2;

	public double getLeg1() {
		return leg1;
	}

	public void setLeg1(double leg1) {
		this.leg1 = leg1;
	}

	public double getLeg2() {
		return leg2;
	}

	public void setLeg2(double leg2) {
		this.leg2 = leg2;
	}

	@Override
	double figureArea() {
		double figureArea = (getLeg1() * getLeg2()) / 2;
		figureArea = roundToHundredths(figureArea);
		return figureArea;
	}

}
