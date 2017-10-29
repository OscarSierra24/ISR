import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Project {
	
	private BufferedReader br;
	private StringTokenizer st;
	
	private static Empresa diegoCompany;
	
	private double n1,
					n2,n3,n4,n5,n6,n7,n8,n9,n10,n11;
	
	private String n12,
					n13,
					n14,
					sUbicacionEnviar,
					sUbicacionGuardar,
					nombreArchivo;
	
	private int posicion;
	
	
	public Project(String UbicacionEnviar) throws IOException{
		
		this.sUbicacionEnviar=UbicacionEnviar;
		
		br=new BufferedReader(new FileReader(this.sUbicacionEnviar));
		
	    String linea;
	    
	    int personas=0;
	    
	    while((linea=br.readLine())!=null){
	    	personas+=1;
	    }
	    br.close();
	    
		diegoCompany=new Empresa(personas);
		posicion=0;
	}
	
	public void setUbicacionGuardar(String sUbicacionGuardar){
		this.sUbicacionGuardar=sUbicacionGuardar;
	}
	
	public void setNombreArchivo(String sNombreArchivo){
		this.nombreArchivo=sNombreArchivo;
	}
	
	public void agregarPersona(){
		
		try{
			br=new BufferedReader(new FileReader(this.sUbicacionEnviar));
		    String linea;
		    
		    while((linea=br.readLine())!=null){
		    	
		    	st=new StringTokenizer(linea,",");
		    	
		    	n13=st.nextToken();
				n14=st.nextToken();
				n1=Double.parseDouble(st.nextToken());
				n2=Double.parseDouble(st.nextToken());
				n3=Double.parseDouble(st.nextToken());
				n4=Double.parseDouble(st.nextToken());
				n5=Double.parseDouble(st.nextToken());
				n6=Double.parseDouble(st.nextToken());
				n7=Double.parseDouble(st.nextToken());
				n8=Double.parseDouble(st.nextToken());
				n9=Double.parseDouble(st.nextToken());
				n10=Double.parseDouble(st.nextToken());
				n11=Double.parseDouble(st.nextToken());
				n12=st.nextToken();
				diegoCompany.nuevoEmpleado(n13,n14,this.posicion, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12);
				Project.diegoCompany.setUbicacionGuardar(this.sUbicacionGuardar, this.nombreArchivo);
				
				this.posicion+=1;
		    }
		   
		    br.close();
		    
		    Project.diegoCompany.escribirArchivo();
		}
		
		catch(FileNotFoundException ex){
			JOptionPane.showMessageDialog(null, "Ocurrió un error");
		}
		catch(IOException ex){
			JOptionPane.showMessageDialog(null, "Ocurrió un error");
		}
		
	}
	
}
