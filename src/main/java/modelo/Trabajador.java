package modelo;

public class Trabajador extends Persona {
	private String isapre;
	private String afp;
	private Empresa empresa;

	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.isapre = isapre;
		this.afp = afp;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("RUT: " + this.rut);
		System.out.println("Isapre: " + this.isapre);
		System.out.println("AFP: " + this.afp);
	}
	public String getIsapre() {
		return this.isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}