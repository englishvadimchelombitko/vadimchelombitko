
public abstract class Figures {
	final String[] COLORS = { "синий", "красный", "зеленый", "желтый", "черный", "белый" };
	private String color;

	boolean drawFigure() {
		return true;
	}

	abstract double figureArea();

	abstract String getNAME();

	abstract double uniqueMethod();

	public String getColor() {
		return color;
	}

	public void setColor() {
		this.color = COLORS[randomNumberToChooseColor()];
	}

	int randomNumberToChooseColor() { // Метод для рандомного выбора номера цвета из палитры
		int first = 0; // Начальное значение диапазона - "от"
		int second = 5; // Конечное значение диапазона - "до"
		int randomNumberOfColor = first + (int) (Math.random() * second);
		return randomNumberOfColor;
	}

	double randomNumber() {
		double first = 1; // Начальное значение диапазона - "от"
		double second = 5; // Конечное значение диапазона - "до"
		double randomNumber = first + (Math.random() * second);
		randomNumber = roundToHundredths(randomNumber);
		return randomNumber;
	}

	double roundToHundredths(double value) { // Метод для округления до сотых
		return Math.round(value * 100) / 100.0d;
	}

}
