/**
 * @author Adaya Elías
 * @version 1.2
 * 20/02/2023
 */

//clase rectangulo que hereda de la clase figura geométrica.
public class Rectangulo_AEG extends FiguraGeometrica_AEG {

	//declaración de variables
	private double l1;
	private double l2;

	//metodo rectángulo define los lados.
	public Rectangulo_AEG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	//método para calcular el área
	@Override
	public double area() {
		return l1 * l2;
	}

	//método para calcular el perímetro.
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
