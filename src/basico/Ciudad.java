package basico;

public class Ciudad {

	private int idCiudad;
	private String nombre;
	private String pais;
	
	public Ciudad() {
		
	}
	
	public Ciudad(int idCiudad, String nombre, String pais) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.pais = pais;
	}
	public int getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ciudad [idCiudad=");
		builder.append(idCiudad);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", pais=");
		builder.append(pais);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
