package isr;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class leectorArchivos{
	protected JFileChooser fc = new JFileChooser();
	private StringTokenizer st;
	private Calculator2 usuario;
	

	public leectorArchivos(){

		
		


	}
	public static void leer(String ruta){
		try {
			
			BufferedReader bf;
			bf= new BufferedReader(new FileReader(ruta));


			Calculator2 usuario = null;
			String Linea;
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber=0;
			String nombre="hola", 
					rfc="hola",
					sueldoMensual="hola",
					aguinaldoRecibido="hola",
					primaRecibida="hola",
					gastosMedicos="hola",
					gastosFunerarios="hola",
					sgmm="hola",
					hipotecarios="hola",
					donativos="hola",
					retiro="hola",
					transporteEscolar="hola",
					nivelEducativo="hola",
					colegiaturaAnual="hola";
			 

			while((Linea = bf.readLine()) != null){
				lineNumber++;
				st = new StringTokenizer(Linea,",");
				System.out.println(Linea);
				while(st.hasMoreTokens()){
					tokenNumber++;
//					if(tokenNumber == 0){
//						System.out.println(nombre = st.nextToken());
//					}
//					
//					else if(tokenNumber ==1){
//						System.out.println(rfc = st.nextToken());
//					}
//					
//					else if(tokenNumber ==2){
//						System.out.println(sueldoMensual = st.nextToken());
//					}
//					
//					else if(tokenNumber ==3){
//						System.out.println(aguinaldoRecibido = st.nextToken());
//					}
//					
//					else if(tokenNumber ==4){
//						System.out.println(primaRecibida = st.nextToken());
//					}
//					
//					else if(tokenNumber ==5){
//						System.out.println(gastosMedicos = st.nextToken());
//					}
//					
//					else if(tokenNumber ==6){
//						System.out.println(gastosFunerarios = st.nextToken());
//					}
//					
//					else if(tokenNumber ==7){
//						System.out.println(sgmm = st.nextToken());
//					}
//					
//					else if(tokenNumber ==8){
//						System.out.println(hipotecarios = st.nextToken());
//					}
//					
//					else if(tokenNumber ==9){
//						System.out.println(donativos = st.nextToken());
//					}
//					
//					else if(tokenNumber ==10){
//						System.out.println(retiro = st.nextToken());
//					}
//					
//					else if(tokenNumber ==11){
//						System.out.println(transporteEscolar = st.nextToken());
//					}
//					
//					else if(tokenNumber ==12){
//						System.out.println(nivelEducativo = st.nextToken());
//					}
//					
//					else if(tokenNumber ==13){
//						System.out.println(colegiaturaAnual = st.nextToken());
//						tokenNumber = 0;
//					}
				}
				usuario = new Calculator2(Double.parseDouble(sueldoMensual),Double.parseDouble(aguinaldoRecibido),Double.parseDouble(primaRecibida),Double.parseDouble(gastosMedicos),Double.parseDouble(gastosFunerarios),Double.parseDouble(sgmm),Double.parseDouble(hipotecarios),Double.parseDouble(donativos),Double.parseDouble(retiro),Double.parseDouble(transporteEscolar),Double.parseDouble(colegiaturaAnual),nivelEducativo);
				
			}
			bf.close();


		} catch (FileNotFoundException e) {
			System.err.println("No se encontro el archivo " + e);
		}
		catch(IOException e){
			System.err.println("Error al leer ");
		}
		catch(NullPointerException e){
			System.err.println("Error");
		}

	}
	
//	public static void main(String[] args){
//		leer();
//		
//		
//	}



}