package actividad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AreaPrisma {

	public static void main(String[] args) {
		int numeroPrismas = 3;
		ArrayList<Prisma> lista = new ArrayList<>(numeroPrismas);
		Prisma prisma;
		
		for (int i = 0 ; i < numeroPrismas ; i++) {
			prisma = new Prisma();
			int base = (int) (Math.random() * 30);
			int altura = (int) (Math.random() * 20);
			((Prisma) prisma).setNombre("Prisma"+ (lista.size()+1));
			((Prisma) prisma).setBaseTriangulo(base);
			((Prisma) prisma).setAlturaPrisma(altura);
			((Prisma) prisma).setAreaPrisma(Prisma.areaTotal(base,altura));
			lista.add(prisma);
		}
		
		for (Prisma item : lista) {
			System.out.println("Se ha creado " + item.nombre);
			System.out.println("Base: " + item.baseTriangulo);
			System.out.println("Altura: " + item.alturaPrisma);
			System.out.println("Area Total: " + item.areaPrisma);
			System.out.println("----------------------");
		}
		
		Collections.sort(lista, new Comparator<Prisma>() {
			@Override
			public int compare(Prisma p1, Prisma p2) {
				return new Float(p2.getAreaPrisma()).compareTo(new Float(p1.getAreaPrisma()));
			}
		});
		
		System.out.println("");
		System.out.println("Ordenado de Mayor a menor");
		for (Prisma item : lista) {
			System.out.println(item.nombre);
			System.out.println("Base: " + item.baseTriangulo);
			System.out.println("Altura: " + item.alturaPrisma);
			System.out.println("Area Total: " + item.areaPrisma);
			System.out.println("----------------------");
		}
	}
}
