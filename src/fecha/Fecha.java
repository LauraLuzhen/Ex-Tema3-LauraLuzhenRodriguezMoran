package fecha;

/**
 * Clase Fecha donde se van a establecer una fecha con su día, mes y año. Esta clase tendrá una sería de funciones.
 * @author ll.rodriguez
 */
public class Fecha {
<<<<<<< HEAD
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
=======
	public static final int DIEZ = 10;
	private int diaFecha; //d�a
	private int mesFecha; //mes
	private int anioFecha; //a�o
>>>>>>> PMD-Refactor

	
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
		this.diaFecha = dia;
		this.mesFecha = mes;
		this.anioFecha = anio;
	}

	/**
	 * Método fechaCorrecta que verifica que la fecha está dentro del rango normal
	 * @return Si la fecha está bien escrita (true) o mal (false)
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = anioFecha > 0;
		mesCorrecto = mesFecha >= 1 && mesFecha <= 12;
		boolean diaMayor1 = diaFecha >= 1;
		switch (mesFecha) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && diaFecha <= 29;
			} else {
				diaCorrecto = diaMayor1 && diaFecha <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && diaFecha <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && diaFecha <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

<<<<<<< HEAD
	/**
	 * Método esBisiesto que dice si el año es bisiesto o no
	 * @return Si el año es bisiesto o no
	 */
=======
>>>>>>> PMD-Refactor
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	private boolean esBisiesto() {
		return anioFecha % 4 == 0 && anioFecha % 100 != 0 || anioFecha % 400 == 0;
	}

<<<<<<< HEAD
	/**
	 * Método diaSiguiente que con la fecha correcta le aumenta un día a la fecha
	 */
	// M�todo diaSiguiente
	public void diaSiguiente() {
		d++;
=======
	// M�todo diaSiguiente
	public void nextDay() {
		diaFecha++;
>>>>>>> PMD-Refactor
		if (!fechaCorrecta()) {
			diaFecha = 1;
			mesFecha++;
			if (!fechaCorrecta()) {
				mesFecha = 1;
				anioFecha++;
			}
		}
	}

<<<<<<< HEAD
	/**
	 * Método toString de Fecha, el orden es día, mes y año
	 */
=======
>>>>>>> PMD-Refactor
	// M�todo toString
	public String toString() {
		String cadena;
		if (diaFecha < DIEZ && mesFecha < DIEZ) {
			cadena = "0" + diaFecha + "-0" + mesFecha + "-" + anioFecha;
		} else if (diaFecha < DIEZ && mesFecha >= DIEZ) {
			cadena = "0" + diaFecha + "-" + mesFecha + "-" + anioFecha;
		} else if (diaFecha >= DIEZ && mesFecha < DIEZ) {
			cadena = diaFecha + "-0" + mesFecha + "-" + anioFecha;
		} else {
			cadena = diaFecha + "-" + mesFecha + "-" + anioFecha;
		}
		return cadena;
	}

}
