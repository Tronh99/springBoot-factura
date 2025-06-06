package com.springboot_factura.springboot_factura;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.springboot_factura.springboot_factura.models.Item;
import com.springboot_factura.springboot_factura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding= "UTF-8")
public class AppConfiguration {


    @Bean("deporte")
    List<Item> itemsInvoice() {

        Product p1 = new Product("Camara", 800);
        Product p2 = new Product("Bicicleta Bianchi", 1200);
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4));
        
    }

    @Bean("office")
    List<Item> itemsInvoiceOffice() {

        Product p1 = new Product("Monitor ASUS 24´", 700);
        Product p2 = new Product("NoteBook Rezer", 2400);
        Product p3 = new Product("Impresora HP ", 800);
        Product p4 = new Product(" Escritorio Oficina", 900);
        return Arrays.asList(new Item(p1, 4), new Item(p2, 6), new Item(p3, 1), new Item(p4, 4));
        
    }

}
 