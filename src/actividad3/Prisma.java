package actividad3;

// TODO: Auto-generated Javadoc
/**
 * Clase que contiene el objeto Prisma.
 *
 * @author Modesto
 */
public class Prisma {

	/** base triangulo. */
	int baseTriangulo;

	/** altura prisma. */
	int alturaPrisma;

	/** nombre. */
	String nombre;

	/** area prisma. */
	float areaPrisma;

	/**
	 * Devuelve base triangulo.
	 *
	 * @return base triangulo
	 */
	public int getBaseTriangulo() {
		return baseTriangulo;
	}

	/**
	 * Introduce base triangulo.
	 *
	 * @param baseTriangulo es la nueva base triangulo
	 */
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	/**
	 * Devuelve altura prisma.
	 *
	 * @return altura prisma
	 */
	public int getAlturaPrisma() {
		return alturaPrisma;
	}

	/**
	 * Introduce altura prisma.
	 *
	 * @param alturaPrisma es la nueva altura prisma
	 */
	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}

	/**
	 * Altura triangulo.
	 *
	 * @param baseTriangulo es la base triangulo
	 * @return raiz cuadrada de 3 partido de dos por la base del triangulo, lo cual
	 *         es la altura
	 */
	public static float alturaTriangulo(float baseTriangulo) {
		return (float) ((Math.sqrt(3) / 2) * baseTriangulo);
	}

	/**
	 * Area base.
	 *
	 * @param baseTriangulo   es la base triangulo
	 * @param alturaTriangulo es la altura triangulo
	 * @return base de triangulo por la mitad de la altura del mismo
	 */
	public static float areaBase(float baseTriangulo, float alturaTriangulo) {
		return (baseTriangulo * alturaTriangulo / 2);
	}

	/**
	 * Perimetro.
	 *
	 * @param baseTriangulo es la base triangulo
	 * @return tres (tres lados) por la base del triangulo
	 */
	public static float perimetro(float baseTriangulo) {
		return (3 * baseTriangulo);
	}

	/**
	 * Area lateral.
	 *
	 * @param perimetro    es el perimetro
	 * @param alturaPrisma es la altura prisma
	 * @return perimetro por altura del prisma
	 */
	public static float areaLateral(float perimetro, float alturaPrisma) {
		return (perimetro * alturaPrisma);
	}

//	public float areaTotal (float areaBase, float areaLateral) {
//		return (2 * areaBase + areaLateral);
//	}

	/**
	 * Area total.
	 *
	 * @param baseTriangulo es la base triangulo
	 * @param alturaPrisma  es la altura prisma
	 * @return 2 por la suma del area de la base y el area lateral
	 */
	public static float areaTotal(float baseTriangulo, float alturaPrisma) {
		return (2 * areaBase(baseTriangulo, alturaTriangulo(baseTriangulo))
				+ areaLateral(perimetro(baseTriangulo), alturaPrisma));
	}

	/**
	 * Devuelve el nombre.
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Introduce nombre.
	 *
	 * @param nombre es el nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve area prisma.
	 *
	 * @return area prisma
	 */
	public float getAreaPrisma() {
		return areaPrisma;
	}

	/**
	 * Introduce area prisma.
	 *
	 * @param areaPrisma es el nuevo area prisma
	 */
	public void setAreaPrisma(float areaPrisma) {
		this.areaPrisma = areaPrisma;
	}
}
