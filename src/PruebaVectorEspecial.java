import java.util.Arrays;
import java.util.Scanner;

class VectorEspecial{
	Scanner entrada=new Scanner(System.in);
		//declaracion
	int edades[];
	
	public VectorEspecial(int tamaño) {
		//	Creacion
		this.edades=new int[tamaño];
	}
	public void llenarVector() {
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Ingresa edad: "+(i+1)+" :");
			edades[i]=entrada.nextInt();
		}
		
	}
	public void mostrarVector() {
		System.out.println(Arrays.toString(edades));
	}
	
}
public class PruebaVectorEspecial {

	public static void main(String[] args) {
		
		VectorEspecial ve1=new VectorEspecial(0);
		System.out.println(ve1.edades);

		VectorEspecial ve2=new VectorEspecial(5);
		System.out.println(ve1.edades);
		System.out.println(Arrays.toString(ve2.edades));
		
		VectorEspecial ve3=new VectorEspecial(3);
		ve3.llenarVector();
		ve3.mostrarVector();
	}

}
