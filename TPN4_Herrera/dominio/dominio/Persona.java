package dominio;

public class Persona {

	private String apellido;
	private String nombre;
	private String dni;
	
	
	
	public Persona(String apellido, String nombre, String dni) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.dni=dni;

	}
	
	public Persona(){
		this.apellido="";
		this.nombre="";
		this.dni="";
	}
	
	//Getters
	public String getApellido() {
		return this.apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getDni() {
		return this.dni;
	}
	public String getApellidoYNombreConFormato() {
		
		return this.apellido+", "+this.nombre;
	}
	public String getDniConFotmato() {
		
		return "D.N.I.: "+this.dni;
	}
	
	//Setters
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	

	

}
