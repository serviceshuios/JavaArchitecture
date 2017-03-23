package com.objis.democamel.simple ;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.builder.RouteBuilder;

public class DemoRouteCamel {
	public static void main(String[] args) throws Exception {
		// 1. Création contexte Camel
		CamelContext context = new DefaultCamelContext(); 
		
		// 2. Ajout d'une Route dans le contexte.
		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("file:c:/dev/camel/in").to("file:c:/dev/camel/out");
			}
		});
		// 3. Démarrage puis arrêt du contexte
		context.start();
		Thread.sleep(100000);
		context.stop();
	}
}
