import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	private PanelControles PC;
	private PanelInicio PI;
	private PersonaProyecto PP;
	
	public Ventana(PanelControles PC, PanelInicio PI){
		super("Impuestos sobre la renta");
		this.PC=PC;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.PI=PI;
		this.add(PI, BorderLayout.EAST);
		
		this.add(PC, BorderLayout.WEST);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) throws IOException{
		PanelInicio PI=new PanelInicio();
		PersonaProyecto PP=new PersonaProyecto();
		PanelControles PC=new PanelControles(PI, PP);
		Ventana Base=new Ventana(PC,PI);
	}	
}