package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.PrintoutData;
import com.ibd.ibd.services.PrintoutService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintoutController {
    
    @Resource(name = "printoutsService")
    private PrintoutService printoutService;

    @GetMapping("/printouts/all")
    public List<PrintoutData> getPrinters() {
        return printoutService.getAllPrintouts();
    }
    
    @DeleteMapping("/printouts/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
        printoutService.deletePrinter(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    } 
}
