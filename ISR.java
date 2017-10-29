
public class ISR{
	
	private double ingresoAnual,
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
	
	private double[] listaISR;
	
	public ISR(){
		this.ingresoAnual=0;
		this.sueldoAnual=0;
		this.aguinaldoExento=0;
		this.aguinaldoGravado=0;
		this.primaVacacionalExenta=0;
		this.primaVacacionalGravada=0;
		this.totalIngresosGravan=0;
		this.montoDeducirColegiatura=0;
		this.montoDeducirRetiro=0;
		this.totalDeduccionesSinRetiro=0;
		this.totalDeduccion=0;
		this.montoCalcularISR=0;
		this.cuotaFija=0;
		this.excedenteLimite=0;
		this.pagoExcedente=0;
		this.limiteInferior=0;
		this.totalPagar=0;
	}
	
	public double[] metodoLista(){
		
		this.listaISR=new double[17];
		this.listaISR[0]=this.ingresoAnual;
		this.listaISR[1]=this.sueldoAnual;
		this.listaISR[2]=this.aguinaldoExento;
		this.listaISR[3]=this.aguinaldoGravado;
		this.listaISR[4]=this.primaVacacionalExenta;
		this.listaISR[5]=this.primaVacacionalGravada;
		this.listaISR[6]=this.totalIngresosGravan;
		this.listaISR[7]=this.montoDeducirColegiatura;
		this.listaISR[8]=this.montoDeducirRetiro;
		this.listaISR[9]=this.totalDeduccionesSinRetiro;
		this.listaISR[10]=this.totalDeduccion;
		this.listaISR[11]=this.montoCalcularISR;
		this.listaISR[12]=this.cuotaFija;
		this.listaISR[13]=this.excedenteLimite;
		this.listaISR[14]=this.pagoExcedente;
		this.listaISR[15]=this.limiteInferior;
		this.listaISR[16]=this.totalPagar;
		
		return listaISR;	
	}
	
	public void sueldoAnual(double sueldoMensual){
		this.sueldoAnual=sueldoMensual*12;
	}
	
	public void ingresoAnual(double aguinaldo, double primaVacacional){
		this.ingresoAnual=this.sueldoAnual+aguinaldo+primaVacacional;
	}
	
	public void aguinaldoExento(double sueldoMensual){
		this.aguinaldoExento=(sueldoMensual/30)*15;
	}
	
	public void aguinaldoGravado(double aguinaldo){
		this.aguinaldoGravado=aguinaldo-this.aguinaldoExento;
	}
	
	public void primaVacacionalExenta(){
		this.primaVacacionalExenta=80.04*15;
	}
	
	public void primaVacacionalGravada(double primaVacacional){
		if(primaVacacional>this.primaVacacionalExenta){
			this.primaVacacionalGravada=primaVacacional-this.primaVacacionalExenta;
		}
		else if(primaVacacional<this.primaVacacionalExenta && primaVacacional>0){
			this.primaVacacionalGravada=primaVacacional;
		}
		
		else{
			this.primaVacacionalGravada=0;
		}
	}
	
	public void totalIngresosGravan(double aguinaldo, double primaVacacional){
		this.totalIngresosGravan=this.sueldoAnual+aguinaldo+primaVacacional-this.aguinaldoExento-this.primaVacacionalExenta;
	}
	
	public void montoDeducirColegiatura(String nivelEducativo){
		
		if(nivelEducativo=="preescolar"){ 
			this.montoDeducirColegiatura=14200;
		}
		else if(nivelEducativo=="primaria"){
			this.montoDeducirColegiatura=12900;
		}
		else if(nivelEducativo=="secundaria"){
			this.montoDeducirColegiatura=19900;
		}
		else if(nivelEducativo=="profesional técnico"){
			this.montoDeducirColegiatura=17100;
		}
		else if(nivelEducativo=="bachillerato"){ //Bachillerato
			this.montoDeducirColegiatura=24500;
		}
		else{
			this.montoDeducirColegiatura=0;
		}
	}
	
	public void montoDeducirRetiro(double subcuentaRetiro){
		if((this.ingresoAnual*.1)>146073 && subcuentaRetiro>146073){
			this.montoDeducirRetiro=146973;
		}
		else if((this.ingresoAnual*.1)>146073 && subcuentaRetiro<146073){
			this.montoDeducirRetiro=subcuentaRetiro;
		}
		else if((this.ingresoAnual*.1)<146073 && subcuentaRetiro<146073){
			this.montoDeducirRetiro=subcuentaRetiro;
		}
		else{ //this.ingresoAnual*.1)<146073 && subcuentaRetiro>146073
			this.montoDeducirRetiro=this.ingresoAnual*.1;
		}
	}
	
	public void totalDeduccionesSinRetiro(double medicosHospitales, double gastosFunerarios, double seguroMedico, double hipotecarios, double donativos, double transporteEscolar, double totalColegiatura){
		if(totalColegiatura>=this.montoDeducirColegiatura){
			this.totalDeduccionesSinRetiro=medicosHospitales+gastosFunerarios+seguroMedico+hipotecarios+donativos+transporteEscolar+this.montoDeducirColegiatura;
		}
		else{
			this.totalDeduccionesSinRetiro=medicosHospitales+gastosFunerarios+seguroMedico+hipotecarios+donativos+transporteEscolar+totalColegiatura;
		}
	}
	
	public void totalDeducciones(){
		this.totalDeduccion=(this.ingresoAnual*.1)+this.montoDeducirRetiro;
	}
	
	public void montoCalcularISR(){
		this.montoCalcularISR=this.totalIngresosGravan-this.totalDeduccion;
	}
	
	public void cuotaFijaYExcedente(){
		if(this.montoCalcularISR>0 && 5952.85>this.montoCalcularISR){
			this.limiteInferior=.01;
			this.cuotaFija=0;
			this.excedenteLimite=.0192;
		}
		else if(this.montoCalcularISR>5952.84 && 50524.93>this.montoCalcularISR){
			this.limiteInferior=5952.85;
			this.cuotaFija=114.29;
			this.excedenteLimite=.06;
		}
		else if(this.montoCalcularISR>50524.92 && 88793.05>this.montoCalcularISR){
			this.limiteInferior=50524.93;
			this.cuotaFija=2966.91;
			this.excedenteLimite=.1088;
		}
		else if(this.montoCalcularISR>88793.04 && 103218.01>this.montoCalcularISR){
			this.limiteInferior=88793.05;
			this.cuotaFija=7130.48;
			this.excedenteLimite=.16;
		}
		else if(this.montoCalcularISR>103218 && 123580.21>this.montoCalcularISR){
			this.limiteInferior=103218.01;
			this.cuotaFija=9438.47;
			this.excedenteLimite=17.92;
		}
		else if(this.montoCalcularISR>123580.2 && 249243.49>this.montoCalcularISR){
			this.limiteInferior=123580.21;
			this.cuotaFija=13087.37;
			this.excedenteLimite=.2136;
		}
		else if(this.montoCalcularISR>249243.48 && 392841.97>this.montoCalcularISR){
			this.limiteInferior=249243.49;
			this.cuotaFija=39929.05;
			this.excedenteLimite=.2352;
		}
		else if(this.montoCalcularISR>392841.96 && 750000.01>this.montoCalcularISR){
			this.limiteInferior=392841.97;
			this.cuotaFija=73703.41;
			this.excedenteLimite=.3;
		}
		else if(this.montoCalcularISR>750000 && 1000000.01>this.montoCalcularISR){
			this.limiteInferior=750000.01;
			this.cuotaFija=180850.82;
			this.excedenteLimite=.32;
		}
		else if(this.montoCalcularISR>1000000 && 3000000.01>this.montoCalcularISR){
			this.limiteInferior=1000000.01;
			this.cuotaFija=260850.81;
			this.excedenteLimite=.34;
		}
		else if(this.montoCalcularISR>3000000){
			this.limiteInferior=3000000.01;
			this.cuotaFija=940850.81;
			this.excedenteLimite=.35;
		}
		else{
			this.limiteInferior=0;
			this.cuotaFija=0;
			this.excedenteLimite=0;
		}
	}
	
	public void pagoExcedenteLimite(){
		this.pagoExcedente=(this.montoCalcularISR-this.limiteInferior)*this.excedenteLimite;
	}
	
	public void totalPagar(){
		this.totalPagar=this.pagoExcedente+this.cuotaFija;
	}
	

		
	public String paraPantalla(){
		String sIngresoAnual=this.ingresoAnual+"";
		String sSueldoAnual=this.sueldoAnual+"";
		String sAguinaldoExento=this.aguinaldoExento+"";
		String sAguinaldoGravado=this.aguinaldoGravado+"";
		String sPrimaVacacionalExenta=this.primaVacacionalExenta+"";
		String sPrimaVacacionalGravada=this.primaVacacionalGravada+"";
		String sTotalIngresosGravan=this.totalIngresosGravan+"";
		
		String sMontoDeducirColegiatura=this.montoDeducirColegiatura+"";
		String sMontoDeducirRetiro=this.montoDeducirRetiro+"";
		String sTotalDeduccionesSinRetiro=this.totalDeduccionesSinRetiro+"";
		String sTotalDeduccion=this.totalDeduccion+"";
		String sMontoCalcularISR=this.montoCalcularISR+"";
		String sCuotaFija=this.cuotaFija+"";
		String sExcedenteLimite=this.excedenteLimite+"";
		String sPagoExcedente=this.pagoExcedente+"";
		String sLimiteInferior=this.limiteInferior+"";
		String sTotalPagar=this.totalPagar+"";

		return("Sueldo anual: "+ sSueldoAnual+"\n"+"Aguinaldo Exento: "+sAguinaldoExento+"\n"+"Aguinaldo gravado: "+sAguinaldoGravado+"\n"+"Prima v. exenta: "+sPrimaVacacionalExenta+"\n"+"Prima v gravada: "+ sPrimaVacacionalGravada+"\n"+"Total ingresos gravan: " + sTotalIngresosGravan+"\n"+"Ingreso Anual: "+ sIngresoAnual+"\n"+"Deducir colegiatura: "+sMontoDeducirColegiatura+"\n "+"Monto deducir retiro: "+sMontoDeducirRetiro+"\n"+"Total deduccions sin retiro: "+sTotalDeduccionesSinRetiro+"\n"+"Total deduccion: "+sTotalDeduccion+"\n"+"Monto para calcular isr: "+sMontoCalcularISR+"\n"+"Cuota fija: "+sCuotaFija+"\n"+"Limite inferior: "+sLimiteInferior+"\n"+"Excedente limite: "+sExcedenteLimite+"\n "+"Pago excedente: "+sPagoExcedente+"\n "+"Total a pagar: "+sTotalPagar);
				
	}
	
	public String toString(){
		String sIngresoAnual=this.ingresoAnual+"";
		String sSueldoAnual=this.sueldoAnual+"";
		String sAguinaldoExento=this.aguinaldoExento+"";
		String sAguinaldoGravado=this.aguinaldoGravado+"";
		String sPrimaVacacionalExenta=this.primaVacacionalExenta+"";
		String sPrimaVacacionalGravada=this.primaVacacionalGravada+"";
		String sTotalIngresosGravan=this.totalIngresosGravan+"";
		
		String sMontoDeducirColegiatura=this.montoDeducirColegiatura+"";
		String sMontoDeducirRetiro=this.montoDeducirRetiro+"";
		String sTotalDeduccionesSinRetiro=this.totalDeduccionesSinRetiro+"";
		String sTotalDeduccion=this.totalDeduccion+"";
		String sMontoCalcularISR=this.montoCalcularISR+"";
		String sCuotaFija=this.cuotaFija+"";
		String sExcedenteLimite=this.excedenteLimite+"";
		String sPagoExcedente=this.pagoExcedente+"";
		String sLimiteInferior=this.limiteInferior+"";
		String sTotalPagar=this.totalPagar+"";

		return("Salario anual: "+ sSueldoAnual+", "+"Aguinaldo Exento: "+sAguinaldoExento+", "+"Aguinaldo gravado: "+sAguinaldoGravado+", "+"Prima v. exenta: "+sPrimaVacacionalExenta+", "+"Prima v gravada: "+ sPrimaVacacionalGravada+", "+"Total ingresos gravan: " + sTotalIngresosGravan+", "+"Ingreso Anual: "+ sIngresoAnual+"Deducir colegiatura: "+", "+sMontoDeducirColegiatura+", "+"Monto deducir retiro: "+sMontoDeducirRetiro+", "+"Total deduccions sin retiro: "+sTotalDeduccionesSinRetiro+", "+"Total deduccion: "+sTotalDeduccion+", "+"Monto para calcular isr: "+sMontoCalcularISR+", "+"Cuota fija: "+sCuotaFija+", "+"Limite inferior: "+sLimiteInferior+", "+"Excedente limite: "+sExcedenteLimite+", "+"Pago excedente: "+sPagoExcedente+", "+"Total a pagar: "+sTotalPagar);
				
	}
		
}