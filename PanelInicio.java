import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelInicio extends JPanel{	
	private String Panel="Inicio";
	
	private String isrPersona,
					mensaje,
					ingresoAnual,
					sueldoAnual,
					aguinaldoExento,
					aguinaldoGravado,
					primaVacacionalExenta,
					primaVacacionalGravada,
					totalIngresosGravan,
					montoDeducirColegiatura,
					montoDeducirRetiro,
					totalDeduccionesSinRetiro,
					totalDeduccion,
					montoCalcularISR,
					cuotaFija,
					excedenteLimite,
					pagoExcedente,
					limiteInferior,
					totalPagar;
	
	private double[] doubleFinal;
	
	private double DingresoAnual,
					DsueldoAnual,
					DaguinaldoExento,
					DaguinaldoGravado,
					DprimaVacacionalExenta,
					DprimaVacacionalGravada,
					DtotalIngresosGravan,
					DmontoDeducirColegiatura,
					DmontoDeducirRetiro,
					DtotalDeduccionesSinRetiro,
					DtotalDeduccion,
					DmontoCalcularISR,
					DcuotaFija,
					DexcedenteLimite,
					DpagoExcedente,
					DlimiteInferior,
					DtotalPagar;

	public PanelInicio(){
		this.isrPersona="";
		this.mensaje="";
		this.setPreferredSize(new Dimension(902,768)); 
		this.setBackground(Color.decode("#CED3D8"));
		this.setVisible(true);
		this.ingresoAnual="";
		this.sueldoAnual="";
		this.aguinaldoExento="";
		this.aguinaldoGravado="";
		this.primaVacacionalExenta="";
		this.primaVacacionalGravada="";
		this.totalIngresosGravan="";
		this.montoDeducirColegiatura="";
		this.montoDeducirRetiro="";
		this.totalDeduccionesSinRetiro="";
		this.totalDeduccion="";
		this.montoCalcularISR="";
		this.cuotaFija="";
		this.excedenteLimite="";
		this.pagoExcedente="";
		this.limiteInferior="";
		this.totalPagar="";
	}
	
	public void setDatos(){	
		this.DingresoAnual=Math.round(this.doubleFinal[0] * 100.0) / 100.0;
		this.DsueldoAnual=Math.round(this.doubleFinal[1]*100)/100;
		this.DaguinaldoExento=Math.round(this.doubleFinal[2] * 100.0) / 100.0;
		this.DaguinaldoGravado=Math.round(this.doubleFinal[3] * 100.0) / 100.0;
		this.DprimaVacacionalExenta=Math.round(this.doubleFinal[4] * 100.0) / 100.0;
		this.DprimaVacacionalGravada=Math.round(this.doubleFinal[5] * 100.0) / 100.0;
		this.DtotalIngresosGravan=Math.round(this.doubleFinal[6] * 100.0) / 100.0;
		this.DmontoDeducirColegiatura=Math.round(this.doubleFinal[7] * 100.0) / 100.0;
		this.DmontoDeducirRetiro=Math.round(this.doubleFinal[8] * 100.0) / 100.0;
		this.DtotalDeduccionesSinRetiro=Math.round(this.doubleFinal[9] * 100.0) / 100.0;
		this.DtotalDeduccion=Math.round(this.doubleFinal[10] * 100.0) / 100.0;
		this.DmontoCalcularISR=Math.round(this.doubleFinal[11] * 100.0) / 100.0;
		this.DcuotaFija=Math.round(this.doubleFinal[12] * 100.0) / 100.0;
		this.DexcedenteLimite=Math.round(this.doubleFinal[13] * 100.0) / 100.0;
		this.DpagoExcedente=Math.round(this.doubleFinal[14] * 100.0) / 100.0;
		this.DlimiteInferior=Math.round(this.doubleFinal[15] * 100.0) / 100.0;
		this.DtotalPagar=Math.round(this.doubleFinal[16] * 100.0) / 100.0;
		
		this.ingresoAnual=this.DingresoAnual+"";
		this.sueldoAnual=this.DsueldoAnual+"";
		this.aguinaldoExento=this.DaguinaldoExento+"";
		this.aguinaldoGravado=this.DaguinaldoGravado+"";
		this.primaVacacionalExenta=this.DprimaVacacionalExenta+"";
		this.primaVacacionalGravada=this.DprimaVacacionalGravada+"";
		this.totalIngresosGravan=this.DtotalIngresosGravan+"";
		this.montoDeducirColegiatura=this.DmontoDeducirColegiatura+"";
		this.montoDeducirRetiro=this.DmontoDeducirRetiro+"";
		this.totalDeduccionesSinRetiro=this.DtotalDeduccionesSinRetiro+"";
		this.totalDeduccion=this.DtotalDeduccion+"";
		this.montoCalcularISR=this.DmontoCalcularISR+"";
		this.cuotaFija=this.DcuotaFija+"";
		this.excedenteLimite=this.DexcedenteLimite+"";
		this.pagoExcedente=this.DpagoExcedente+"";
		this.limiteInferior=this.DlimiteInferior+"";
		this.totalPagar=this.DtotalPagar+"";
		
		this.repaint();
	}
	
	public void setDatosNulos(){
		this.ingresoAnual="";
		this.sueldoAnual="";
		this.aguinaldoExento="";
		this.aguinaldoGravado="";
		this.primaVacacionalExenta="";
		this.primaVacacionalGravada="";
		this.totalIngresosGravan="";
		this.montoDeducirColegiatura="";
		this.montoDeducirRetiro="";
		this.totalDeduccionesSinRetiro="";
		this.totalDeduccion="";
		this.montoCalcularISR="";
		this.cuotaFija="";
		this.excedenteLimite="";
		this.pagoExcedente="";
		this.limiteInferior="";
		this.totalPagar="";
		
		this.repaint();
	}
	
	public void setPanel(String Panel){
		this.Panel=Panel;
		this.repaint();
	}
	
	public void setIsrPersona(String isrPersona){
		this.isrPersona=isrPersona;
		this.repaint();
	}
	
	public void setMensaje(){
		this.mensaje="Archivo creado";
		this.repaint();
	}
	
	public void setMensajeNulo(){
		this.mensaje="";
		this.repaint();
	}
	
	public void setDouble(double[] miDouble){
		this.doubleFinal=miDouble;
	}	

	
	public void paintComponent(Graphics g){
		if(Panel.equals("Inicio")){
		
			super.paintComponent(g);
			this.isrPersona="";
			this.mensaje="";
			g.setColor(Color.decode("#292A2B"));
			g.fillRect(0, 0, 902, 70);
			Font texto1 = new Font("Times New Roman", Font.CENTER_BASELINE, 32);
			g.setColor(Color.decode("#292A2B"));
			g.setFont(texto1);
			g.drawString("Bienvenido, Calcula tu ISR o el de tus empleados",130,310);
			g.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 40));
			g.setColor(Color.decode("#F2F8FF"));
			g.drawString("INICIO", 401, 50);
		}
		else if(this.Panel.equals("PanelIndividual")){
			

			super.paintComponent(g);
			g.fillRect(0, 0, 902, 70);
			g.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 40));
			g.setColor(Color.decode("#F2F8FF"));
			g.drawString("INDIVIDUAL", 351, 50);
			g.setColor(Color.black);
			g.setFont(new Font("TImes New Roman", Font.CENTER_BASELINE,18));
			g.drawString("Ingreso Anual:", 20, 100);
			g.drawString("Sueldo Anual:", 20, 150);
			g.drawString("Aguinaldo Exento:", 20, 200);
			g.drawString("Aguinaldo Gravado:", 20, 250);
			g.drawString("Prima vacacional exenta:", 20, 300);
			g.drawString("Prima vacacional gravada:", 20, 350);
			g.drawString("Total de ingresos gravan:", 20, 400);
			g.drawString("Monto a deducir de colegiatura:", 20, 450);
			g.drawString("Monto a deducir de retiro:", 20, 500);
			g.drawString("Total a deducir sin retiro:", 470, 100);
			g.drawString("Total de deducciones:", 470, 150);
			g.drawString("Cantidad para calcular el ISR:", 470, 200);
			g.drawString("Cuota fija:", 470, 250);
			g.drawString("Excedente Limite:", 470, 300);
			g.drawString("Pago excedente:", 470, 350);
			g.drawString("Limite inferior:", 470, 400);
			g.drawString("Total a pagar:", 470, 450);
			
			g.drawString("$"+this.ingresoAnual, 310, 100);
			g.drawString("$"+this.sueldoAnual, 310, 150);
			g.drawString("$"+this.aguinaldoExento, 310, 200);
			g.drawString("$"+this.aguinaldoGravado, 310, 250);
			g.drawString("$"+this.primaVacacionalExenta, 310, 300);
			g.drawString("$"+this.primaVacacionalGravada, 310, 350);
			g.drawString("$"+this.totalIngresosGravan, 310, 400);
			g.drawString("$"+this.montoDeducirColegiatura, 310, 450);
			g.drawString("$"+this.montoDeducirRetiro, 310, 500);
			g.drawString("$"+this.totalDeduccionesSinRetiro, 750, 100);
			g.drawString("$"+this.totalDeduccion, 750, 150);
			g.drawString("$"+this.montoCalcularISR, 750, 200);
			g.drawString("$"+this.cuotaFija, 750, 250);
			g.drawString(this.excedenteLimite+"%", 750, 300);
			g.drawString("$"+this.pagoExcedente, 750, 350);
			g.drawString("$"+this.limiteInferior, 750, 400);
			g.drawString("$"+this.totalPagar, 750, 450);
			
			g.drawLine(20, 110, 400, 110);
			g.drawLine(20, 160, 400, 160);
			g.drawLine(20, 210, 400, 210);
			g.drawLine(20, 260, 400, 260);
			g.drawLine(20, 310, 400, 310);
			g.drawLine(20, 360, 400, 360);
			g.drawLine(20, 410, 400, 410);
			g.drawLine(20, 460, 400, 460);
			g.drawLine(20, 510, 400, 510);
			
			g.drawLine(470, 110, 850, 110);
			g.drawLine(470, 160, 850, 160);
			g.drawLine(470, 210, 850, 210);
			g.drawLine(470, 260, 850, 260);
			g.drawLine(470, 310, 850, 310);
			g.drawLine(470, 360, 850, 360);
			g.drawLine(470, 410, 850, 410);
			g.drawLine(470, 460, 850, 460);
		}
		else if(this.Panel.equals("PanelColectivo")){
			super.paintComponent(g);
			g.fillRect(0, 0, 902, 70);
			g.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 40));
			g.drawString(this.mensaje,350,310);
			g.setColor(Color.decode("#F2F8FF"));
			g.drawString("COLECTIVO", 351, 50);
		}
	}
}