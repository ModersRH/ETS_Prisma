package actividad4;

/**
 * Clase que contiene un objeto Circulo
 * @author Alumno2DAM-A
 */

public class Circulo {
	private float x, y;
	private float radio;

    /**
     *
     * @param cX Variable X
     * @param cY Variable Y
     * @param r Radio del circulo
     */
    public Circulo(float cX, float cY, float r) { // constructor
		this.x = cX;
		this.y = cY;
		this.radio = r;
	}
    /**
     * @return Devuelve X
     */
    public float getX() {
		return x;
	}
    
    /**
     * @param x Introduce x
     */
    public void setX(float x) {
		this.x = x;
	}
    /**
     * @return Devuelve Y
     */
    public float getY() {
		return y;
	}
    /**
     * @param y Introduce Y
     */
    public void setY(float y) {
		this.y = y;
	}
    /**
     * @return Devuelve radio
     */
    public float getRadio() {
		return radio;
	}
    /**
     * @param radio Introduce radio
     */
    public void setRadio(float radio) {
		this.radio = radio;
	}
    
    /**
     * Metodo que calcula el area del circulo
     * @return Devuelve el area del circulo
     */
    public float area() {
		return (float) Math.PI * radio * radio;
	}
    /**
     * Metodo que muestra por consola la variable x, y, el radio y el area
     */
    public void imprimir() {
		System.out.print(" x=" + x);
		System.out.print(" y=" + y);
		System.out.print(" r=" + radio);
		System.out.print(" A=" + area());
	}
}