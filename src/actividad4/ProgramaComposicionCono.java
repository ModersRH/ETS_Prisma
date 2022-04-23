package actividad4;
	/**
	 * Clase que crea cinco objetos Cono con variables determinadas y radio aleatorio y las muestra
	 * @author Modesto Rodriguez Hidalgo
	 *
	 */
public class ProgramaComposicionCono {
	
	/**
	 * Muestra en consola 
	 * @param datos Variable objeto
	 */
	private static void imprimir(Object datos) {
		System.out.println(datos);
	}
	
    /**
     * Crea 5 objetos Cono y muestra por pantalla
     * @param args
     */
    public static void main(String[] args) {
		java.util.Random aleatorio = new java.util.Random();
		for (int i = 1; i <= 5; i++) {
			int radio = aleatorio.nextInt(9) + 1;
			Cono cono = new Cono(0, 0, radio, i, "Azul");
			cono.imprimir();
		}
	}
}