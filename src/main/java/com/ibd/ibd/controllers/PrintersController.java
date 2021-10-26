package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.services.PrintersService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/printers")
public class PrintersController {

    @Resource(name = "printersService")
    private PrintersService printersService;

    @GetMapping("/printers/all")
    public List<PrintersData> getPrinters() {
        return printersService.getAllPrinters();
    }
    
    @DeleteMapping("/printers/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
         printersService.deletePrinter(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    }
}
