package com.enrpan.springbatchtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class FondoItemProcessor implements ItemProcessor<Fondo, FondoData> {

    private static final Logger log = LoggerFactory.getLogger(FondoItemProcessor.class);

    @Override
    public FondoData process(final Fondo fondo) throws Exception {
    	
    	String nombre = fondo.getNombre();
    	Double valor = 34.56;
        
        FondoData transformedFondo = new FondoData(nombre, valor);

        log.info("Converting (" + fondo + ") into (" + transformedFondo + ")");

        return transformedFondo;
    }

}
