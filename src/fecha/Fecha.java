package fecha;

/**
 * Clase Fecha donde se van a establecer una fecha con su día, mes y año. Esta clase tendrá una sería de funciones.
 * @author ll.rodriguez
 */
public class Fecha {
	/**
	 * Atributo que guarda el día de la fecha
	 */
	private int d; //d�a
	/**
	 * Atributo que guarda el mes de la fecha
	 */
	private int m; //mes
	/**
	 * Atributo que guarda el año de la fecha
	 */
	private int a; //a�o

	
	/**
	 * Constructor Fecha
	 */
	public Fecha() {

	}

	/**
	 * Constructor Fecha que establece los parámetros de entrada con sus correspondientes valores
	 * @param dia El día de la fecha
	 * @param mes El mes de la fecha
	 * @param anio El año de la fecha
	 */
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * Método fechaCorrecta que verifica que la fecha está dentro del rango normal
	 * @return Si la fecha está bien escrita (true) o mal (false)
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Método esBisiesto que dice si el año es bisiesto o no
	 * @return Si el año es bisiesto o no
	 */
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	/**
	 * Método diaSiguiente que con la fecha correcta le aumenta un día a la fecha
	 */
	// M�todo diaSiguiente
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Método toString de Fecha, el orden es día, mes y año
	 */
	// M�todo toString
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
