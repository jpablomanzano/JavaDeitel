import java.util.ArrayList;

public class ColeccionesArrayList
{
	public static void main(String[] args)
	{
		//crea un nuevo objeto ArrayList de tipo String de 10 elemenos

		ArrayList<String> elementos = new ArrayList<String>();

		elementos.add("rojo"); //adjunta un elemento a la lista
		elementos.add(0, "amarillo"); //inserta elemento "amarillo" al índice 0

		System.out.print(
				"Mostrar el contenido de una lista por ciclo controlado por contador: ");

		for (int i = 0; i < elementos.size(); i++)
		{
			System.out.printf(" %s", elementos.get(i));
		}

		mostrar(elementos, "\nMostrar elementos con instruccion for mejorado");

		elementos.add("verde");
		elementos.add("amarillo");
		mostrar(elementos, "\nLista con dos elementos nuevos: ");

		elementos.remove("amarillo"); //elimina el primer amarillo
		mostrar(elementos, "\nLista de elementos después de eliminar a amarillo: ");

		elementos.remove(1); //elimina el elemento con el índice 1
		mostrar(elementos, "\nLista después de elimimar el elemento 'verde': ");

		//verifica si hay un valor en la lista

		System.out.printf("'rojo' %sesta en la lista\n", elementos.contains("rojo") ? "": "no ");

		//Imprime el tamaño de la lista
		System.out.printf("Tamanio: %s\n", elementos.size());

		elementos.add("negro");
		System.out.printf("Tamanio: %s\n", elementos.size());

	} //fin main

	public static void mostrar(ArrayList<String> elementos, String encabezado)
	{
		System.out.print(encabezado);

		for (String elemento : elementos)
		{
			System.out.printf(" %s", elemento);
		}
		System.out.println();
	}

} //fin clase
