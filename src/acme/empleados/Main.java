package acme.empleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bienvenido al Sistema de ACME");
		
		 try {

	            File f = new File("data.txt");

	            BufferedReader b = new BufferedReader(new FileReader(f));

	            String readLine = "";

	            System.out.println("Reading file using Buffered Reader");

	            while ((readLine = b.readLine()) != null) {
	                System.out.println(readLine);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}