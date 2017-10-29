
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class PanelControles extends JPanel implements ActionListener, MouseListener, FocusListener{
	private String sUbicacionGuardar,
				   sUbicacionEnviar,
				   snombreArchivo;
		
	private JButton individual,
					colectivo,
					inicio,
					enviarArchivo,
					enviarDatos;
	
	private JTextField aguinaldo,
					   primaVacacional,
					   sueldoMensual,
					   gastosMedicos,
					   gastosFunerarios,
					   sGMM,
					   fileChooserTextField,
					   hipotecarios,
					   donativos,
					   subcuentaRetiro,
					   ubicacionGuardarArchivo,
					   totalColegiatura,
					   transporteEsc,
					   tfnombreArchivo;

	private double aguinaldoD,
				   primaVacacionalD,
				   sueldoMensualD,
				   gastosMedicosD, 
				   gastosFunerariosD,
				   sGMMD,	
				   hipotecariosD,	
				   donativosD,
				   subcuentaRetiroD,
				   totalColegiaturaD,
				   transporteEscD;

	private JTextField[] TextFieldsA={aguinaldo, primaVacacional, sueldoMensual, gastosMedicos, gastosFunerarios, sGMM, hipotecarios, donativos, subcuentaRetiro, transporteEsc, totalColegiatura};
	
	private double[] TextFieldsD={aguinaldoD, primaVacacionalD, sueldoMensualD, gastosMedicosD, gastosFunerariosD, sGMMD, hipotecariosD, donativosD, subcuentaRetiroD, transporteEscD , totalColegiaturaD};
	
	private JComboBox<String> nivelEducativo;
	
	private String[] nivelEducativoS = {"Nivel Educativo","preescolar","primaria","secundaria","profesional técnico","bachillerato","ninguno"};
	
	private JLabel ingresos,
		   ingreseArchivo,
		   deducciones,
		   ubicacionGuardar;
	
	private PanelInicio PI;
	
	private PersonaProyecto PP;
	
	private Project PJ;
	
	private JFileChooser fc,
						fc2;
	
	private Color colorBotones,
				  colorMarcoControles;
	
	public PanelControles(PanelInicio PI, PersonaProyecto PP) throws IOException{
	this.PP=PP;
	this.PI=PI;
	
	this.colorBotones=(Color.decode("#CED3D8"));
	this.colorMarcoControles=(Color.decode("#292A2B"));
	
	this.setPreferredSize(new Dimension(200,768));
	this.setBackground(colorMarcoControles);
	
	this.inicio=new JButton("Inicio");
	this.BotonFormato(inicio);
	
	this.individual=new JButton("Individual");
	this.BotonFormato(individual);
	this.add(this.individual);
	
	this.enviarDatos=new JButton("enviar");
	this.enviarDatos.addActionListener(this);
	this.add(this.enviarDatos);
	
	this.colectivo=new JButton("Colectivo");
	this.BotonFormato(colectivo);
	this.add(this.colectivo);

	this.enviarArchivo=new JButton("Enviar");
	this.enviarArchivo.addActionListener(this);
	this.add(this.enviarArchivo);
	
	this.sueldoMensual=new JTextField("Sueldo Mensual");
	this.TextFieldFormato(sueldoMensual);
	this.sueldoMensual.setToolTipText("Sueldo Mensual");
	this.sueldoMensual.addMouseListener(this);
	this.add(this.sueldoMensual);
	
	this.aguinaldo=new JTextField("Aguinaldo");
	this.aguinaldo.setToolTipText("Aguinaldo");
	this.TextFieldFormato(aguinaldo);
	this.add(this.aguinaldo);
	
	this.primaVacacional=new JTextField("Prima Vacacional");
	this.primaVacacional.setToolTipText("Prima Vacacional");
	this.TextFieldFormato(primaVacacional);
	this.add(this.primaVacacional);
	
	this.gastosMedicos=new JTextField("Gastos Medicos");
	this.gastosMedicos.setToolTipText("Gastos Medicos");
	this.TextFieldFormato(this.gastosMedicos);
	this.add(this.gastosMedicos);
	
	this.gastosFunerarios=new JTextField("Gastos Funerarios");
	this.gastosFunerarios.setToolTipText("Gastos Funerarios");
	this.TextFieldFormato(this.gastosFunerarios);
	this.add(this.gastosFunerarios);
	
	this.sGMM=new JTextField("Seguro De Gastos Médicos Mayores");
	this.sGMM.setToolTipText("Seguro de gastos medicos mayores");
	this.TextFieldFormato(sGMM);
	this.add(sGMM);
	
	this.hipotecarios=new JTextField("Gastos Hipotecarios");
	this.hipotecarios.setToolTipText("Gastos hipotecarios");
	this.TextFieldFormato(hipotecarios);
	this.add(hipotecarios);
	
	this.donativos=new JTextField("Donativos");
	this.donativos.setToolTipText("Donativos");
	this.TextFieldFormato(donativos);
	this.add(donativos);
	
	this.subcuentaRetiro=new JTextField("Subcuenta Retiro");
	this.subcuentaRetiro.setToolTipText("Subcuenta Retiro");
	this.TextFieldFormato(subcuentaRetiro);
	this.add(subcuentaRetiro);
	
	this.transporteEsc=new JTextField("Transporte Escolar");
	this.transporteEsc.setToolTipText("Transporte Escolar");
	this.TextFieldFormato(transporteEsc);
	this.add(transporteEsc);

	this.totalColegiatura=new JTextField(" ");
	this.TextFieldFormato(this.totalColegiatura);
	this.totalColegiatura.setToolTipText("Costo de colegiatura");
	this.add(this.totalColegiatura);
	
	this.fileChooserTextField=new JTextField(" ");
	this.TextFieldFormato(fileChooserTextField);
	this.add(fileChooserTextField);
	
	this.ubicacionGuardarArchivo=new JTextField(" ");
	this.TextFieldFormato(this.ubicacionGuardarArchivo);
	this.add(this.ubicacionGuardarArchivo);
	
	
	this.ingresos=new JLabel("Ingresos");
	this.LabelFormato(ingresos);
	this.add(this.ingresos);
	
	this.deducciones=new JLabel("Deducciones");
	this.LabelFormato(deducciones);
	this.add(this.deducciones);
	
	this.ingreseArchivo=new JLabel("Ingrese el archivo");
	this.LabelFormato(ingreseArchivo);
	this.add(this.ingreseArchivo);
	
	this.ubicacionGuardar=new JLabel("Ubicaci�n donde guardar");
	this.LabelFormato(this.ubicacionGuardar);
	this.add(this.ubicacionGuardar);
	
	this.tfnombreArchivo=new JTextField("Nombre del archivo a crear");
	this.tfnombreArchivo.setToolTipText("Nombre del archivo a crear");
	this.TextFieldFormato(this.tfnombreArchivo);
	this.add(this.tfnombreArchivo);
	
	this.nivelEducativo=new JComboBox<String>(this.nivelEducativoS);
	this.nivelEducativo.setSelectedIndex(0);
	this.nivelEducativo.setBackground(this.colorBotones);
	this.nivelEducativo.setFont(new Font("Times New Roman", Font.ITALIC, 16));
	this.nivelEducativo.addActionListener(this);
	this.add(nivelEducativo);
	
	this.fc=new JFileChooser();
	this.fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
	this.add(fc);
	
	this.fc2=new JFileChooser();
	this.fc2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	this.add(fc2);
	
	this.PI_INI();
	}
	
	public void setTextFieldA(JTextField sueldoMensual, JTextField aguinaldo,JTextField primaVacacional,JTextField gastosMedicos, JTextField gastosFunerarios,JTextField sGMM, JTextField hipotecarios,JTextField donativos,JTextField subcuentaRetiro,JTextField transporteEsc, JTextField totalColegiatura){
	this.TextFieldsA[0]=sueldoMensual;
	this.TextFieldsA[1]=aguinaldo;
	this.TextFieldsA[2]=primaVacacional;
	this.TextFieldsA[3]=gastosMedicos;
	this.TextFieldsA[4]=gastosFunerarios;
	this.TextFieldsA[5]=sGMM;
	this.TextFieldsA[6]=hipotecarios;
	this.TextFieldsA[7]=donativos;
	this.TextFieldsA[8]=subcuentaRetiro;
	this.TextFieldsA[9]=transporteEsc;
	this.TextFieldsA[10]=totalColegiatura;
	}
	
	public void TextFieldFormato(JTextField x){
		x.addMouseListener(this);
		x.addFocusListener(this);
		x.setPreferredSize(new Dimension(150,40));
		x.setBackground(this.colorBotones);
		x.setFont(new Font("Times New Roman", Font.ITALIC, 20));	
	}
	
	public void BotonFormato(JButton x){
		x.addActionListener(this);
		x.setBackground(colorBotones);
		x.setPreferredSize(new Dimension(150,100));
		x.setForeground(this.colorMarcoControles);
		x.setFont(new Font("Times New Roman", Font.BOLD, 25));	
	}
	
	public void LabelFormato(JLabel x){
		x.setForeground(Color.decode("#F2F8FF"));
		x.setFont(new Font("Times New Roman", Font.BOLD, 18));
	}
	
	public void PI_INI(){
		this.removeAll();
		this.add(this.individual);
		this.add(this.colectivo);
		this.PI.setDatosNulos();
		this.PI.setMensajeNulo();
		this.ubicacionGuardarArchivo.setText(" ");
		this.fileChooserTextField.setText(" ");
		this.repaint();
	}
	
	public void PI_IND(){
		this.TextFieldFormato(sueldoMensual);
		this.TextFieldFormato(aguinaldo);
		this.TextFieldFormato(primaVacacional);
		this.TextFieldFormato(donativos);
		this.TextFieldFormato(gastosFunerarios);
		this.TextFieldFormato(gastosMedicos);
		this.TextFieldFormato(hipotecarios);
		this.TextFieldFormato(sGMM);
		this.TextFieldFormato(subcuentaRetiro);
		this.TextFieldFormato(transporteEsc);
		this.TextFieldFormato(totalColegiatura);
		
		this.sueldoMensual.setText("Sueldo Mensual");
		this.aguinaldo.setText("Aguinaldo");
		this.donativos.setText("Donativos");
		this.gastosFunerarios.setText("Gastos Funerarios");
		this.gastosMedicos.setText("Gastos Medicos");
		this.hipotecarios.setText("Hipotecarios");
		this.nivelEducativo.setSelectedIndex(0);
		this.primaVacacional.setText("Prima Vacacional");
		this.subcuentaRetiro.setText("Subcuenta Retiro");
		this.transporteEsc.setText("Transporte Escolar");
		this.sGMM.setText("Seguro Gastos Medicos Mayores");
		this.totalColegiatura.setText("Costo de colegiatura");
		this.setTextFieldA(sueldoMensual, aguinaldo, primaVacacional, gastosMedicos, gastosFunerarios, sGMM, hipotecarios, donativos, subcuentaRetiro, transporteEsc, totalColegiatura);
		this.removeAll();
		
		this.add(this.inicio);
		for(int i=0;i<this.TextFieldsA.length;i++){
			if(this.TextFieldsA[i].getText().equals("Sueldo Mensual")){
				this.add(this.ingresos);
			}
			else if(this.TextFieldsA[i].getText().equals("Gastos Medicos")){
				this.add(this.deducciones);
			}
			this.add(this.TextFieldsA[i]);
		}
		this.add(this.nivelEducativo);		
		this.add(this.enviarDatos);
		
		this.revalidate();
		this.repaint();
	}
	
	public void PI_COL(){
		this.tfnombreArchivo.setBackground(this.colorBotones);
		this.ubicacionGuardarArchivo.setBackground(this.colorBotones);
		this.fileChooserTextField.setBackground(this.colorBotones);
		this.removeAll();
		this.add(this.inicio);
		
		this.add(this.ingreseArchivo);
		this.add(this.fileChooserTextField);
		
		this.add(this.ubicacionGuardar);
		this.add(this.ubicacionGuardarArchivo);
		
		this.TextFieldFormato(this.tfnombreArchivo);
		this.tfnombreArchivo.setText("Nombre del archivo:");
		this.add(this.tfnombreArchivo);
		this.add(this.enviarArchivo);
		this.revalidate();
		this.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.inicio){
			this.PI_INI();
			this.PI.setPanel("Inicio"); 
			
			for(int i=0;i<this.TextFieldsD.length;i++){
				this.TextFieldsD[i]=0;
			}	
		}
		else if(e.getSource()==this.individual){
			this.PI.setPanel("PanelIndividual");
			this.PI_IND();
		}
		else if(e.getSource()==this.colectivo){
			this.PI.setPanel("PanelColectivo");
			this.PI_COL();
		}
		else if(e.getSource()==this.enviarDatos){
			this.PI.setDatosNulos();
			//reinicia el color de los textfields al volver a pulsar enviar
			for(int i=0;i<this.TextFieldsA.length;i++){
				this.TextFieldsA[i].setBackground(this.colorBotones);
			}
			
			for(int i=0;i<TextFieldsA.length;i++){
				try{
					if(Double.parseDouble(this.TextFieldsA[i].getText())<0){
						this.TextFieldsD[i]=0;
						this.TextFieldsA[i].setText("");
					}
					TextFieldsD[i]=Double.parseDouble(this.TextFieldsA[i].getText());
				}
				catch(NumberFormatException nfe){
					TextFieldsA[i].setBackground(Color.decode("#FE2E2E"));
				}
			}
	//Aqui se hace el panel individual
			this.PP.setTextFieldsD(this.TextFieldsD);
			this.PP.setNivelEducativo((String) this.nivelEducativo.getSelectedItem());
			this.PP.setDatos();		
			this.PI.setDouble(this.PP.doubleImpuestos());
			this.PI.setDatos();
		
	}	
	//aqui se hace el panel colectivo
	else if(e.getSource()==this.enviarArchivo){
		this.tfnombreArchivo.setBackground(this.colorBotones);
		this.ubicacionGuardarArchivo.setBackground(this.colorBotones);
		this.fileChooserTextField.setBackground(this.colorBotones);
		JTextField[] jtf={this.tfnombreArchivo,this.ubicacionGuardarArchivo,this.fileChooserTextField};
		
		boolean value=true;
		for(int i=0; i<jtf.length;i++){	
			if(jtf[i].getText().equals("Nombre del archivo:") || jtf[i].getText().equals(" ")){
				jtf[i].setBackground(Color.decode("#FE2E2E"));
				value=false;
			}
		}
		if(value){
			this.sUbicacionEnviar=this.fileChooserTextField.getText();
			this.sUbicacionGuardar=this.ubicacionGuardarArchivo.getText();
			this.snombreArchivo=this.tfnombreArchivo.getText();
			
			try {
				this.PJ=new Project(sUbicacionEnviar);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			this.PJ.setUbicacionGuardar(sUbicacionGuardar);
			this.PJ.setNombreArchivo(this.snombreArchivo);
			this.PJ.agregarPersona();
			this.PI.setMensaje();
		}
	}
}
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==this.fileChooserTextField){
			this.fc.showOpenDialog(this.PI);
			this.fileChooserTextField.setText(this.fc.getSelectedFile().toString());
		}
		else if(e.getSource()==this.ubicacionGuardarArchivo){
			this.fc2.showOpenDialog(this.PI);
			this.ubicacionGuardarArchivo.setText(this.fc2.getSelectedFile().toString());
		}
	}
		
	public void mouseEntered(MouseEvent e) {
		for(int i=0;i<this.TextFieldsA.length;i++){
			if(e.getSource()==this.TextFieldsA[i] && this.TextFieldsA[i].getText().matches("[A-Za-z ]*")){
				this.TextFieldsA[i].setText("");
			}
		}
		if(e.getSource()==this.tfnombreArchivo && this.tfnombreArchivo.getText().equals("Nombre del archivo:")){
			this.tfnombreArchivo.setText("");
		}
	}
	
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==this.sueldoMensual){
			if(this.sueldoMensual.getText().equals("")){
				this.sueldoMensual.setText("Sueldo Mensual");
			}
		}
		else if(e.getSource()==this.aguinaldo){ 
			if(this.aguinaldo.getText().equals("")){
				this.aguinaldo.setText("Aguinaldo");
			}
		}
		else if(e.getSource()==this.primaVacacional){{
				if(this.primaVacacional.getText().equals(""))
				this.primaVacacional.setText("Prima Vacacional");
			}
		}
		else if (e.getSource()==this.gastosMedicos) {
			if(this.gastosMedicos.getText().equals("")){
				this.gastosMedicos.setText("Gastos Medicos");
			}
		}
		else if(e.getSource()==this.gastosFunerarios){ 
			if(this.gastosFunerarios.getText().equals("")){
				this.gastosFunerarios.setText("Gastos Funerarios");
			}
		}
		else if(e.getSource()==this.sGMM){ 
			if(this.sGMM.getText().equals("")){
				this.sGMM.setText("Seguro de Gastos Medicos Mayores");
			}
		}
		else if(e.getSource()==this.hipotecarios){
			if(this.hipotecarios.getText().equals("")){
				this.hipotecarios.setText("Hipotecarios");
			}
		}
		else if(e.getSource()==this.donativos){
			if(this.donativos.getText().equals("")){
				this.donativos.setText("Donativos");
			}
		}
		else if(e.getSource()==this.subcuentaRetiro){
			 if(this.subcuentaRetiro.getText().equals("")){
				 this.subcuentaRetiro.setText("Subcuenta Retiro");
			}
		}
		else if(e.getSource()==this.transporteEsc){
			if(this.transporteEsc.getText().equals("")){
				this.transporteEsc.setText("Transporte Escolar");
			}
		}
		else if(e.getSource()==this.totalColegiatura){
			if(this.totalColegiatura.getText().equals("")){
				this.totalColegiatura.setText("Costo de colegiatura");
			}
		}
		else if(this.tfnombreArchivo.getText().equals("")){
			this.tfnombreArchivo.setText("Nombre del archivo:");
		}
	}

	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	
	public void focusGained(FocusEvent e) {
		for(int i=0;i<this.TextFieldsA.length;i++){
			if(e.getSource()==this.TextFieldsA[i] &&this.TextFieldsA[i].getText().matches("[A-Za-z ]*")){
				this.TextFieldsA[i].setText("");
			}
		}
	}
	public void focusLost(FocusEvent e) {
		if(this.sueldoMensual.getText().equals("")){
			if(e.getSource()==this.sueldoMensual){
				this.sueldoMensual.setText("Sueldo Mensual");
			}
		}
		else if(this.aguinaldo.getText().equals("")){
			if(e.getSource()==this.aguinaldo){
				this.aguinaldo.setText("Aguinaldo");
			}
		}
		else if(this.primaVacacional.getText().equals("")){
			if(e.getSource()==this.primaVacacional){
				this.primaVacacional.setText("Prima Vacacional");
			}
		}
		else if(this.gastosMedicos.getText().equals("")){
			if(e.getSource()==this.gastosMedicos){
				this.gastosMedicos.setText("Gastos Medicos");
			}
		}
		else if(this.gastosFunerarios.getText().equals("")){
			if(e.getSource()==this.gastosFunerarios){
				this.gastosFunerarios.setText("Gastos Funerarios");
			}
		}
		else if(this.sGMM.getText().equals("")){
			if(e.getSource()==this.sGMM){
				this.sGMM.setText("Seguro de Gastos Medicos Mayores");
			}
		}
		else if(this.hipotecarios.getText().equals("")){
			if(e.getSource()==this.hipotecarios){
				this.hipotecarios.setText("Hipotecarios");
			}
		}
		else if(this.donativos.getText().equals("")){
			if(e.getSource()==this.donativos){
				this.donativos.setText("Donativos");
			}
		}
		else if(this.subcuentaRetiro.getText().equals("")){
			if(e.getSource()==this.subcuentaRetiro){
				this.subcuentaRetiro.setText("Subcuenta Retiro");
			}
		}
		else if(this.transporteEsc.getText().equals("")){
			if(e.getSource()==this.transporteEsc){
				this.transporteEsc.setText("Transporte Escolar");
			}
		}
		else if(this.totalColegiatura.getText().equals("")){
			if(e.getSource()==this.totalColegiatura){
				this.totalColegiatura.setText("Costo de colegiatura");
			}
		}
		else if(this.tfnombreArchivo.getText().equals("")){
			this.tfnombreArchivo.setText("Nombre del archivo:");
		}
	}	
}