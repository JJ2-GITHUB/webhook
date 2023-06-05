package com.erika.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Horas {

    public static void main(String[] args) throws ParseException {
	
	Calendar calendario = Calendar.getInstance();
	int hora, minutos, segundos;
	hora = calendario.get(Calendar.HOUR_OF_DAY);
	minutos = calendario.get(Calendar.MINUTE);
	segundos = calendario.get(Calendar.SECOND);
	System.out.println(hora + ":" + minutos + ":" + segundos);
	// TODO Auto-generated method stub

	String dActual ="";// "00:50";
	dActual=hora+":"+minutos;
	System.out.println("hora:"+hora+", min:"+minutos);
	System.out.println("dActual:"+dActual);
	String dInicial1 = "09:00";
	String dFinal1 = "14:30";
	
	String dInicial2 = "14:29";
	String dFinal2 = "14:59";
	
	String dInicial3 = "14:59";
	String dFinal3 = "23:59";	

	String dInicial4 = "00:00";
	String dFinal4 = "09:59";
	
	Date actual = new SimpleDateFormat("HH:mm").parse(dActual.trim());
	      
	      Date inicial1 = new SimpleDateFormat("HH:mm").parse(dInicial1.trim());
	      Date finalDate1 = new SimpleDateFormat("HH:mm").parse(dFinal1.trim());
	      
	      Date inicial2 = new SimpleDateFormat("HH:mm").parse(dInicial2.trim());
	      Date finalDate2 = new SimpleDateFormat("HH:mm").parse(dFinal2.trim());
	      
	      Date inicial3 = new SimpleDateFormat("HH:mm").parse(dInicial3.trim());
	      Date finalDate3 = new SimpleDateFormat("HH:mm").parse(dFinal3.trim());

	      Date inicial4 = new SimpleDateFormat("HH:mm").parse(dInicial4.trim());
	      Date finalDate4 = new SimpleDateFormat("HH:mm").parse(dFinal4.trim());
	      
	System.out.println("actual::"+actual);

	

	      if(actual.after(inicial1) && actual.before(finalDate1)){
		  System.out.println("Entra horario 09:00 - 14:30 :"+actual);
	      }
	      if(actual.after(inicial2) && actual.before(finalDate2)){
		  System.out.println("Entra horario 14:30 - 15:00 :"+actual);
	      }
	      if(actual.after(inicial3) && actual.before(finalDate3)){
		  System.out.println("1Entra horario despues de las 15:00 :"+actual);
	      }      
	      if(actual.after(inicial4) && actual.before(finalDate4)){
		  System.out.println("2Entra horario despues de las 15:00 :"+actual);
	      }	  	      
	      
    }
}