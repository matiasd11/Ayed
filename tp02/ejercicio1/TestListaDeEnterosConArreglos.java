package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosConArreglos obj = new ListaDeEnterosConArreglos();
		if (args.length  == 0){
	       	 System.out.println("El programa se ejecutó sin parametros");
	        }
	        else if (args.length > 1) {
	    		int num = 0;
	    		Integer numero;
	        	while (num < args.length) {
				numero = Integer.parseInt(args[num]);
				num++;
				obj.agregarFinal(numero);
	        	}
			}
			obj.comenzar();
			while (!obj.fin()) {
				System.out.println(obj.proximo());
			}
		}
}
