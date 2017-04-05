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
	StringTokenizer st;


	public leectorArchivos(){

		
		


	}
	public static void leer(String ruta){
		try {
			
			BufferedReader bf;
			bf= new BufferedReader(new FileReader(ruta));


			String Linea;

			while((Linea = bf.readLine()) != null){

				System.out.println(Linea);
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