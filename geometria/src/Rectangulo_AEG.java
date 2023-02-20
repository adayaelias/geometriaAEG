/**
 * @author Adaya El�as
 * @version 1.2
 * 20/02/2023
 */

//clase rectangulo que hereda de la clase figura geom�trica.
public class Rectangulo_AEG extends FiguraGeometrica_AEG {

	//declaraci�n de variables
	private double l1;
	private double l2;

	//metodo rect�ngulo define los lados.
	public Rectangulo_AEG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	//m�todo para calcular el �rea
	@Override
	public double area() {
		return l1 * l2;
	}

	//m�todo para calcular el per�metro.
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
