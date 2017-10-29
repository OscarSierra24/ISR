import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Empresa {
	
	private PersonaProyecto[] persona;
	
	private int totalPersonas;
	
	private String sUbicacionGuardar,
					nombreArchivo;
	
	public Empresa(int totalPersonas) throws IOException{
		this.totalPersonas=totalPersonas;
		this.persona=new PersonaProyecto[this.totalPersonas];
	}
	
	public void nuevoEmpleado(String nombre, String rfc, int posicion, double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10, double n11, String n12){
		this.persona[posicion]=new PersonaProyecto(nombre, rfc, n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12);
	}
	
	public void setUbicacionGuardar(String sUbicacionGuardar, String nombreArchivo){
		this.sUbicacionGuardar=sUbicacionGuardar;
		this.nombreArchivo=nombreArchivo;
	}
	
	public void escribirArchivo(){
		try{
			PrintWriter pw=new PrintWriter(new FileWriter(this.sUbicacionGuardar +"/"+this.nombreArchivo+".csv"));
			for(int i=0;i<this.persona.length;i++){
				pw.println(this.persona[i]);
			}
			pw.close();
		}
		catch(IOException ex){
			System.out.println("Ocurrió un error" + ex);	
		}
	}
}