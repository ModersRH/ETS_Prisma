package actividad4;
/**
 * Clase que contiene el objeto Cono
 * @author Modesto Rodriguez Hidalgo
 *
 */
public class Cono {
	private Circulo base;
	private float altura;
	private String color;

    /**
     *
     * @param cX Variable X
     * @param cY Variable Y
     * @param r Variable que contiene el radio del cono
     * @param h Variable que contiene la altura del cono
     * @param color Variable que contiene el color del cono
     */
    public Cono(float cX, float cY, float r, float h, String color) { // constructor
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}

    /**
     * @return Devuelve la base
     */
    public Circulo getBase() {
		return base;
	}
    
    /**
     * @param base Introduce la base
     */
    public void setBase(Circulo base) {
		this.base = base;
	}

    /**
     * @return Devuelve la base
     */
    public float getAltura() {
		return altura;
	}

    /**
     * @param altura Introduce la altura
     */
    public void setAltura(float altura) {
		this.altura = altura;
	}

    /**
     * @return Devuelve el color
     */
    public String getColor() {
		return color;
	}

    /**
     * @param color Introduce el color
     */
    public void setColor(String color) {
		this.color = color;
	}

    /**
     * Metodo que muestra altura y color del cono
     */
    public void imprimir() {
		base.imprimir();
		System.out.println(" h=" + altura + " c=" + color);
	}
}
