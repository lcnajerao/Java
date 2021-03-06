package isr;

public class Calculator {
	private double sueldoMensual,//
				   aguinaldo,
				   primaVac,
				   gastosMedicos,
				   gastosFunerarios,
				   seguroMedico,
				   creditoHipotecario,
				   donativos,
				   cuentaRetiro,
				   transporteEscolar,
				   colegiaturaTotal;
	
	private String nivelEscolar;

	private double ingresoAnual,
	   				aguinaldoEx,
	   				aguinaldoGra,
				    primaVacEx,
					primaVacGra,
					ingresoTotalGra,
					maxDeducirEscolar,
				    maxDeducirRetiro,
					deduccionTotal, //SinRetiro
				    deduccionesPermitidas,
					montoCalcIsr,
					cuotaFija,
					excedente,
					pagoExcedente,
					totalPagar;
	public Calculator(double sueldoMensual,double aguinaldo,double primaVac,double gastosMedicos,double gastosFunerarios,double seguroMedico,double creditoHipotecario,double donativos,double cuentaRetiro,double transporteEscolar,double colegiaturaTotal,String nivelEscolar){
		this.sueldoMensual = sueldoMensual;
		this.aguinaldo = aguinaldo;
		this.primaVac = primaVac;
		this.gastosMedicos = gastosMedicos;
		this.gastosFunerarios = gastosFunerarios;
		this.seguroMedico = seguroMedico;
		this.creditoHipotecario = creditoHipotecario;
		this.donativos = donativos;
		this.cuentaRetiro = cuentaRetiro;
		this.transporteEscolar = transporteEscolar;
		this.colegiaturaTotal = colegiaturaTotal;
		this.nivelEscolar = nivelEscolar;
		this.nivelEscolar = this.nivelEscolar.toUpperCase();
		
		
		ingresoAnual = sueldoMensual*12 ;
		
		if(aguinaldo<=sueldoMensual/2){
			this.aguinaldoEx = aguinaldo;
		}
		else{
			this.aguinaldoEx = sueldoMensual/2;
		}
		
		if(aguinaldo>sueldoMensual/2){
			aguinaldoGra = aguinaldo - aguinaldoEx;
		}
		else{
			this.aguinaldoGra = 0;
		}
		
		if(primaVac <= 80.04*15 ){
			primaVacEx = primaVac;
		}
		else{
			primaVacEx = 80.04*15;
		}
		
		if(primaVac <= 80.04*15){
			primaVacGra = 0;
		}
		else{
			primaVacGra = primaVac - primaVacEx;
		}
		
		ingresoTotalGra = ingresoAnual + aguinaldoGra + primaVacGra;
		
		if(this.nivelEscolar.equals("PREESCOLAR")){
			maxDeducirEscolar = 14200;
		}
		else if (this.nivelEscolar.equals("PRIMARIA")){
			maxDeducirEscolar = 12900;
		}
		else if(this.nivelEscolar.equals("SECUNDARIA")){
			maxDeducirEscolar = 19900;
		}
		else if(this.nivelEscolar.equals("PREPARATORIA") || nivelEscolar.equals("BACHILLERATO")){
			maxDeducirEscolar = 24500;
		}
		else if(this.nivelEscolar.equals("PROFESIONAL") || nivelEscolar.equals("TECNICO")){
			maxDeducirEscolar = 17100;
		}
		else{
			System.out.println("El Valor de Nivel Educativo no es Valido");
			maxDeducirEscolar = 0;
		}
		
		if(cuentaRetiro < (ingresoAnual + aguinaldo + primaVac)*0.1){
			maxDeducirRetiro = cuentaRetiro;
		}
		else{
			maxDeducirRetiro = (ingresoAnual + aguinaldo + primaVac)*0.1;
		}
		
		if(colegiaturaTotal>(maxDeducirEscolar)){
			deduccionTotal = gastosMedicos + donativos + transporteEscolar + maxDeducirEscolar + gastosFunerarios + seguroMedico + creditoHipotecario;
		}
		else{
			deduccionTotal = gastosMedicos + donativos + transporteEscolar + colegiaturaTotal + gastosFunerarios + seguroMedico + creditoHipotecario;
		}
		
		if(deduccionTotal <= ingresoTotalGra*.10)
		{
			deduccionesPermitidas = deduccionTotal + maxDeducirRetiro;
		}
		else{
			deduccionesPermitidas = (ingresoTotalGra*.10)+maxDeducirRetiro;
		}
		
		montoCalcIsr =ingresoTotalGra - deduccionesPermitidas;
		
		if(montoCalcIsr>0.01 && montoCalcIsr<=5952.84){
			cuotaFija  =  0;
			excedente = .0192;
		}
		else if(montoCalcIsr>5952.85 && montoCalcIsr<=50524.92){
			cuotaFija = 114.29;
			excedente = .0640;
		}
		else if(montoCalcIsr>50524.93 && montoCalcIsr<=88793.04){
			cuotaFija = 2966.91;
			excedente = 0.1088;
		}
		else if(montoCalcIsr>88793.05 && montoCalcIsr<=103218.00){
			cuotaFija = 7130.48;
			excedente = 0.16;
		}
		else if(montoCalcIsr>103218.01 && montoCalcIsr<=123580.20){
			cuotaFija = 9438.47;
			excedente =.1792;
		}
		else if(montoCalcIsr>123580.21 && montoCalcIsr<=249243.48){
			cuotaFija = 13087.37;
			excedente =.2136;
		}
		else if(montoCalcIsr>249243.49 && montoCalcIsr<=392841.96){
			cuotaFija = 39929.05;
			excedente =.2352;
		}
		else if(montoCalcIsr>392841.97 && montoCalcIsr<=750000.00){
			cuotaFija = 73703.41;
			excedente =.30;
		}
		else if(montoCalcIsr>750000.01 && montoCalcIsr<=1000000.00){
			cuotaFija = 180850.82;
			excedente =.32;
		}
		else if(montoCalcIsr>1000000.01 && montoCalcIsr<=3000000.00){
			cuotaFija = 260850.81;
			excedente =.34;
		}
		else if(montoCalcIsr>3000000.01){
			cuotaFija = 940850.81;
			excedente =.35;
		}
		
		if(montoCalcIsr>=3000000.01){
			pagoExcedente = montoCalcIsr -3000000.01*excedente;
		}
		else if(montoCalcIsr<3000000 && montoCalcIsr>=1000000.01){
			pagoExcedente  =(montoCalcIsr-1000000.01)*excedente;
		}
		else if(montoCalcIsr<1000000 && montoCalcIsr>=750000.01){
			pagoExcedente  =(montoCalcIsr-750000.01)*excedente;
		}
		else if(montoCalcIsr<750000 && montoCalcIsr>=392841.97){
			pagoExcedente  =(montoCalcIsr-392841.97)*excedente;
		}
		else if(montoCalcIsr<392841.97 && montoCalcIsr>=249243.49){
			pagoExcedente  =(montoCalcIsr-249243.49)*excedente;
		}
		else if(montoCalcIsr<249243.49 && montoCalcIsr>=123580.21){
			pagoExcedente  =(montoCalcIsr-123580.21)*excedente;
		}
		else if(montoCalcIsr<123580.21 && montoCalcIsr>=103218.01){
			pagoExcedente  =(montoCalcIsr-103218.01)*excedente;
		}
		else if(montoCalcIsr<103218.01 && montoCalcIsr>=88793.05){
			pagoExcedente  =(montoCalcIsr-88793.05)*excedente;
		}
		else if(montoCalcIsr<88793.05 && montoCalcIsr>=50524.93){
			pagoExcedente  =(montoCalcIsr-50524.93)*excedente;
		}
		else if(montoCalcIsr<50524.93 && montoCalcIsr>=5952.85){
			pagoExcedente  =(montoCalcIsr-5952.85)*excedente;
		}
		else if(montoCalcIsr<5952.85 && montoCalcIsr>=0.01){
			pagoExcedente  =(montoCalcIsr-0.01)*excedente;
		}
		else{
			pagoExcedente = 192;
		}
		
		totalPagar = getCuotaFija() + getPagoExcedente();
		
	}
	
	
	public double getIngresoAnual(){
		return(ingresoAnual);
	}
	
	public double getAguinaldoEx(){
		return(aguinaldoEx);
	}
	
	public double getAguinaldoGra(){
		
		return(aguinaldoGra);
	}
	
	public double getPrimaVacEx(){
		return(primaVacEx);
	}
	
	public double getPrimaVacGra(){
		return(primaVacGra);
	}
	
	public double getIngresoTotalGra(){
		return(ingresoTotalGra);
	}
	
	public String getNivelEscolar(){
		return(nivelEscolar);
	}
	
	public double getMaxDeducirEscolar(){
		return(maxDeducirEscolar);
	}
	
	public double getMaxDeducirRetiro(){
		return(maxDeducirRetiro);
	}
	
	public double getDeduccionTotal(){
		return(deduccionTotal);
	}
	
	public double getDeduccionesPermitidas(){
		return(deduccionesPermitidas);
	}
	
	public double getMontoCalcIsr(){
		return(montoCalcIsr);
	}
	
	public double getCuotaFija(){
		return(cuotaFija);
	}
	
	public double getExcedente(){
		return(excedente);
	}
	
	public double getPagoExcedente(){
		return(pagoExcedente);
	}
	
	public double getTotalPagar(){
		return(totalPagar);
	}

	
	public static void main(String[] args) {
		Calculator test;
		test = new Calculator(3000.00,6000.00, 1500,5000 ,0, 15000, 3000, 0, 3000, 5500, 25000,"preescolar");
		System.out.println(test.getAguinaldoEx());
		System.out.println(test.getAguinaldoGra());
		System.out.println(test.getPrimaVacEx());
		System.out.println(test.getPrimaVacGra());
		System.out.println(test.getIngresoTotalGra());
		System.out.println(test.getNivelEscolar());
		System.out.println(test.getMaxDeducirEscolar());
		System.out.println(test.getMaxDeducirRetiro());
		System.out.println(test.getDeduccionTotal());
		System.out.println(test.getDeduccionesPermitidas());
		System.out.println(test.getMontoCalcIsr());
		System.out.println(test.getCuotaFija());
		System.out.println(test.getExcedente());
		System.out.println(test.getPagoExcedente());
		System.out.println(test.getTotalPagar());
	}

}
