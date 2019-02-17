import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int quantityFigures = 5; // Количество фигур в наборе
		ArrayList<Figures> arrayOfFigures = new ArrayList<Figures>();
		for (int i = 0; i < quantityFigures; i++) {
			if (randomNumberToChooseFigure() == 0) {
				arrayOfFigures.add(new Square());
			} else if (randomNumberToChooseFigure() == 1) {
				arrayOfFigures.add(new Circle());
			} else if (randomNumberToChooseFigure() == 2) {
				arrayOfFigures.add(new Triangle());
			} else {
				arrayOfFigures.add(new Trapezium());
			}
		}
		showAllFigures(arrayOfFigures); 
	}

	static int randomNumberToChooseFigure() { // Рандомное чисто что бы выбрать фигуру
		int a = 0; // Начальное значение диапазона - "от"
		int b = 3; // Конечное значение диапазона - "до"
		int randomNumberOfColor = a + (int) (Math.random() * b);
		return randomNumberOfColor;
	}

	static void showAllFigures(ArrayList<Figures> arrayOfFigures) { // Показать все фигуры в коллекции
		for (Figures figure : arrayOfFigures) {
			System.out.print("Фигура: " + figure.getNAME() + ", площадь: " + figure.figureArea() + " кв. ед.,");
			figure.uniqueMethod();
			System.out.println(" цвет: " + figure.getColor());

		}
	}

}
