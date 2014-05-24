package com.home.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


/**
 * Archivos planos.
 * */
public class ArchivosTextosPlanos 
{
	private File file;
	
	
	public void crearArchivo(){
		try 
		{
			file = new File("E:\\Programacion\\ParaPruebas\\prueba.txt");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void escribirArchivo(){
		try 
		{
			FileWriter fr = new FileWriter(file);
			fr.write("Esta es la prueba de escritura de archivo.\n En otra linea.");
			fr.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void leerArchivo(){
		try 
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) 
			{
				System.out.println(linea);
				
			}
			
			br.close();
			fr.close();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
