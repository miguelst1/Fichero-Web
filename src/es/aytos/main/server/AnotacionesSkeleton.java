
/**
 * AnotacionesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * AnotacionesSkeleton java skeleton for the axisService
 */
public class AnotacionesSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param recibirMensaje
	 */

	public es.aytos.main.RecibirMensajeResponse recibirMensaje(es.aytos.main.RecibirMensaje recibirMensaje) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#recibirMensaje");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param introducirFichero
	 */

	public es.aytos.main.IntroducirFicheroResponse introducirFichero(
			es.aytos.main.IntroducirFichero introducirFichero) {
		es.aytos.main.IntroducirFicheroResponse response = new es.aytos.main.IntroducirFicheroResponse();
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("c:/prueba.txt");
			pw = new PrintWriter(fichero);

			for (int i = 0; i < 10; i++)
				pw.println("Linea " + i);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
