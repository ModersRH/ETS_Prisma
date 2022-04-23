package actividad3;

public class Prisma {

	int baseTriangulo;
	int alturaPrisma;
	String nombre;	
	float areaPrisma;
	
	public int getBaseTriangulo() {
		return baseTriangulo;
	}

	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	public int getAlturaPrisma() {
		return alturaPrisma;
	}

	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}
	
	public static float alturaTriangulo (float baseTriangulo) {
		return (float) ((Math.sqrt(3)/2) * baseTriangulo);
	}
	
	public static float areaBase (float baseTriangulo, float alturaTriangulo) {
		return (baseTriangulo * alturaTriangulo/2);
	}
	
	public static float perimetro (float baseTriangulo) {
		return (3 * baseTriangulo);
	}
	
	public static float areaLateral (float perimetro, float alturaPrisma) {
		return (perimetro * alturaPrisma);
	}
	
//	public float areaTotal (float areaBase, float areaLateral) {
//		return (2 * areaBase + areaLateral);
//	}
	
	public static float areaTotal (float baseTriangulo, float alturaPrisma) {
		return (2 * areaBase(baseTriangulo, alturaTriangulo(baseTriangulo)) + areaLateral(perimetro(baseTriangulo), alturaPrisma));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAreaPrisma() {
		return areaPrisma;
	}

	public void setAreaPrisma(float areaPrisma) {
		this.areaPrisma = areaPrisma;
	}
}
