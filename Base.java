public class Base{

	String usuario;
	String password;
	int puerto;

	private static Base Labasedatos;

	private Base(){}

	public static Base Labasedatos(){

	if(Labasedatos == null){
	Labasedatos = new Base();

	}
	return Labasedatos;

	}

	public void ejecutarQuery(String query){
	Sytem.out.println("Ejecutando query");
	}
	public void desconectar(String desc){
	Sytem.out.println("Desconectandooo");
	}


	}