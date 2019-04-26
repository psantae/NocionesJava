
public class mainArrays {
	public static void main(String[] args) {
		int numero = 5;
		int[] arrayNumeros = new int[5];
		//este tipo de arrays son arrays estaticos, es decir,
		//una vez inicializado el array a un tamanyo, siempre
		//sera ese tamanyo
		
		//para meter valores....
		System.out.println("arrays.........");
		arrayNumeros[0] = 23;
		arrayNumeros[1] = 45;
		
		for (int i=0;i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		//otra manera de recorrer arrays, que mola mas
		for (int i: arrayNumeros) {
			System.out.println(i);
		}
		
	}
}
