
public class PersonaProyecto {
	
	private ISR impuestos;
	
	private double[] TextFieldsD;
		
	private double sueldoMensual,
					aguinaldo,
					primaVacacional,
					medicosHospitales,
					gastosFunerarios,
					seguroMedico,
					hipotecarios,
					donativos,
					subcuentaRetiro,
					transporteEscolar,
					totalColegiatura;
	
	private String nivelEducativo;
	
	private String nombre,
					rfc;
	
	public PersonaProyecto(){
		impuestos=new ISR();
		
		this.sueldoMensual=0.0;
		this.aguinaldo=0.0;
		this.primaVacacional=0.0;
		this.medicosHospitales=0.0;
		this.gastosFunerarios=0.0;
		this.seguroMedico=0.0;
		this.hipotecarios=0.0;
		this.donativos=0.0;
		this.subcuentaRetiro=0.0;
		this.transporteEscolar=0.0;
		this.totalColegiatura=0.0;
		
		this.nivelEducativo="null";
	}
	
	public PersonaProyecto(String nivelEscolar){
		TextFieldsD=new double[11];
		System.out.println(nivelEscolar);
		
	}
	public PersonaProyecto(String nombre, String rfc, double sueldoMensual, double aguinaldo, double primaVacacional, double medicosHospitales, double gastosFunerarios, double seguroMedico, double hipotecarios, double donativos, double subcuentaRetiro, double transporteEscolar,	double totalColegiatura, String nivelEducativo){
		
		impuestos=new ISR();
		this.nombre=nombre;
		this.rfc=rfc;
		this.sueldoMensual=sueldoMensual;
		this.aguinaldo=aguinaldo;
		this.primaVacacional=primaVacacional;
		this.medicosHospitales=medicosHospitales;
		this.gastosFunerarios=gastosFunerarios;
		this.seguroMedico=seguroMedico;
		this.hipotecarios=hipotecarios;
		this.donativos=donativos;
		this.subcuentaRetiro=subcuentaRetiro;
		this.transporteEscolar=transporteEscolar;
		this.totalColegiatura=totalColegiatura;
		
		this.nivelEducativo=nivelEducativo;
		
		this.crearImpuesto();
	}
	
	public void setTextFieldsD(double[] TextFieldsD){
		this.TextFieldsD=TextFieldsD;
	}
	
	public void setNivelEducativo(String nivelEducativo){
		this.nivelEducativo=nivelEducativo;
	}
	
	public void setDatos(){
		
		impuestos=new ISR();
		
		this.sueldoMensual=this.TextFieldsD[0];
		this.aguinaldo=this.TextFieldsD[1];
		this.primaVacacional=this.TextFieldsD[2];
		this.medicosHospitales=this.TextFieldsD[3];
		this.gastosFunerarios=this.TextFieldsD[4];
		this.seguroMedico=this.TextFieldsD[5];
		this.hipotecarios=this.TextFieldsD[6];
		this.donativos=this.TextFieldsD[7];
		this.subcuentaRetiro=this.TextFieldsD[8];
		this.transporteEscolar=this.TextFieldsD[9];
		this.totalColegiatura=this.TextFieldsD[10];
		
		this.crearImpuesto();
	}
	
	public double[] doubleImpuestos(){
		return (this.impuestos.metodoLista());
	}
	
	public void crearImpuesto(){
		
		impuestos.sueldoAnual(this.sueldoMensual);
		impuestos.ingresoAnual(this.aguinaldo, this.primaVacacional);
		impuestos.aguinaldoExento(this.sueldoMensual);
		impuestos.aguinaldoGravado(this.aguinaldo);
		impuestos.primaVacacionalExenta();
		impuestos.primaVacacionalGravada(this.primaVacacional);
		impuestos.totalIngresosGravan(this.aguinaldo, this.primaVacacional);
		
		impuestos.montoDeducirColegiatura(this.nivelEducativo);
		impuestos.montoDeducirRetiro(this.subcuentaRetiro);
		impuestos.totalDeduccionesSinRetiro(this.medicosHospitales, this.gastosFunerarios, this.seguroMedico, this.hipotecarios, this.donativos, this.transporteEscolar, this.totalColegiatura);
		impuestos.totalDeducciones();
		impuestos.montoCalcularISR();
		impuestos.cuotaFijaYExcedente();
		impuestos.pagoExcedenteLimite();
		
		impuestos.totalPagar();
	}
	
	
	public String toString(){

		String sSaldoMensual=""+this.sueldoMensual;
		String sAguinaldo=this.aguinaldo+"";
		String sPrimaVacacional=""+this.primaVacacional;
		String sMedicosHospitales=""+this.medicosHospitales;
		String sGastosFunerarios=""+this.gastosFunerarios;
		String sSeguroMedico=""+this.seguroMedico;
		String sHipotecarios=""+this.hipotecarios;
		String sDonativos=""+this.donativos;
		String sSubcuentaRetiro=""+subcuentaRetiro;
		String sTransporteEscolar=""+this.transporteEscolar;
		String sTotalColegiatura=""+this.totalColegiatura;

		return("Nombre: "+this.nombre+", "+"RFC: "+this.rfc+", "+"Salario Mensual: "+sSaldoMensual+", "+"Aguinaldo: "+sAguinaldo+", "+"Prima Vacacional: "+sPrimaVacacional+", "+"Gastos Medicos: "+sMedicosHospitales+", "+"Gastos Funerarios: "+sGastosFunerarios+", "+ "Seguro Medico: "+sSeguroMedico + ", "+ "Gastos Hipotecarios: "+sHipotecarios+", "+"Donativos: "+sDonativos+", "+"Subcuenta de Retiro: "+sSubcuentaRetiro+", "+"Transporte Escolar: "+sTransporteEscolar+", "+"Colegiatura Escolar: "+sTotalColegiatura+ ", "+"Nivel educativo: "+this.nivelEducativo+","+this.impuestos);	
		
	}
	
	public String imprimirPantalla(){

		String sSaldoMensual=""+this.sueldoMensual;
		String sAguinaldo=this.aguinaldo+"";
		String sPrimaVacacional=""+this.primaVacacional;
		String sMedicosHospitales=""+this.medicosHospitales;
		String sGastosFunerarios=""+this.gastosFunerarios;
		String sSeguroMedico=""+this.seguroMedico;
		String sHipotecarios=""+this.hipotecarios;
		String sDonativos=""+this.donativos;
		String sSubcuentaRetiro=""+subcuentaRetiro;
		String sTransporteEscolar=""+this.transporteEscolar;
		String sTotalColegiatura=""+this.totalColegiatura;

		return(this.impuestos.paraPantalla());	
		
	}
}
