package jp31;

public class UserTemporales {
String Nombre;
String Apellido;
String DNI;
public UserTemporales(String nombre, String apellido, String dNI) {
	super();
	Nombre = nombre;
	Apellido = apellido;
	DNI = dNI;
}

public UserTemporales() {
	super();
}

public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
};

}
