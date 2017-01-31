package herencia_series;

 class Fecha {
	 private int dia;
	 private int mes;
	 private int anyo;
	 
	 public Fecha(){
		 this.dia=1;
		 this.mes=1;
		 this.anyo=2000;
		 
	 }
	 public Fecha(int dia, int mes, int anyo){
		 this.dia=dia;
		 this.mes=mes;
		 this.anyo=anyo;
	 }
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	 public String muestraFecha(Fecha variable){
		 String dias="";String meses="";String anyo=Integer.toString(variable.getAnyo());
		 if(anyo.length()<2){anyo="000"+anyo;}
		 else if(anyo.length()<3){anyo="00"+anyo;}
		 else if(anyo.length()<4){anyo="0"+anyo;}
		 
		 
		 if(variable.getDia()<10){dias="0"+variable.getDia();}
		 else{dias=Integer.toString(variable.getDia());}
		 
		 if(variable.getMes()<10){meses="0"+variable.getMes();}
		 else{meses=Integer.toString(variable.getMes());}
		 
		 String result=dias+"/"+meses+"/"+anyo;
		 return result;
	 }
	 public int calculaSemanaMes(Fecha variable){
		
		 int suma=0;

		 int dia=variable.getDia();
		 int mes=variable.getMes();
		 if((mes==1||mes==8)){suma=dia/7;}else if((mes==2||mes==9)){suma=(dia+2)/7;}else if((mes==3||mes==10)){suma=(dia+4)/7;}
		 else if((mes==4||mes==11)){suma=(dia+6)/7;}else if((mes==5||mes==12)){suma=(dia+1)/7;}else if(mes==6){suma=(dia+3)/7;}
		 else if(mes==7){suma=(dia+5)/7;}
		 
		 if(dia%7!=0){
			 suma=suma+1;
		 }
		 return suma;
	 }
	 public int calculaSemanaAnyo (Fecha variable){
		 int suma=0;
		 int dia =variable.getDia();
		 int mes =variable.getMes();
		 suma= (((mes-1)*30)+dia)/7;
		 
		 if((((mes-1)*30)+dia)%7!=0){
			 suma=suma+1;
		 }
		 return suma;
	 }
	 public boolean esAnyoExtraordinario(Fecha variable){
		 boolean result=false;
		 int dia=variable.getDia();
		 int mes=variable.getMes();
		 int anyo=variable.getAnyo();
		 String suma=Integer.toString(anyo);
		
		 String longAnyo=Integer.toString(anyo);
		 int total=0;
		 if(longAnyo.length()<2){total=anyo;}
		 else if(longAnyo.length()<3){total=suma.charAt(0)+suma.charAt(1);}
		 else if(longAnyo.length()<4){total=suma.charAt(1)+suma.charAt(2);}
		 else{ total=suma.charAt(2)+suma.charAt(3);}
		
		 
		 if (((dia+mes+anyo)%3==0)||((total%5)==0)){
			 result=true;
		 }
		 return result;
	 }
	 public String calculaDiaSemana(Fecha variable){
		 int total=0; String result="";
		 int dia=variable.getDia();
		 int mes=variable.getMes();
		 
		 total=(dia+((mes-1)*30))%7;
		 if(total==1){result="Lunes";}else if(total==2){result="Martes";}else if(total==3){result="Miercoles";}
		 else if(total==4){result="Jueves";}else if(total==5){result="Viernes";}else if(total==6){result="Sabado";}
		 else if(total==0){result="Domingo";}
		 return result;
	 }
	 public boolean esFestivo(Fecha variable){
		 boolean result=false;
		 int total=0;
		 int dia=variable.getDia();
		 int mes=variable.getMes();
		 int anyo=variable.getAnyo();
		 total=(dia+((mes-1)*30))%7;
		 if((total==6)||(total==0)){
			 result=true;
		 }
		 if((mes%2==0)&&(dia==15)){
			 result=true;
		 }
		 
		 return result;
	 }
	 public boolean esLaborable(Fecha variable){
		 boolean result=false;
		 int total=0;
		 int dia=variable.getDia();
		 int mes=variable.getMes();
		 int anyo=variable.getAnyo();
		 total=(dia+((mes-1)*30))%7;
		 if((total==6)||(total==0)){
			 result=false;
		 }
		 if((mes%2==0)&&(dia==15)){
			 result=false;
		 }
		 else{
			 result=true;
		 }
		 return result;
	 }
	
}
