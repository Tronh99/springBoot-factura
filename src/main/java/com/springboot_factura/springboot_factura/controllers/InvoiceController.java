package com.springboot_factura.springboot_factura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_factura.springboot_factura.models.Invoice;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class InvoiceController {

    @Autowired
    private Invoice invoice;


    @GetMapping("/show") 
    public Invoice show() {
        return invoice;
    }


}
