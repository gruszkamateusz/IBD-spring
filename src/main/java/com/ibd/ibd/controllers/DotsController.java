package com.ibd.ibd.controllers;
import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.DotsData;
import com.ibd.ibd.services.DotsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DotsController {
    @Resource(name = "dotsService")
    private DotsService printoutService;
    
    @CrossOrigin
    @GetMapping("/dots/all")
    public List<DotsData> getPrinters() {
        return printoutService.getAllPrintouts();
    }
    @CrossOrigin
    @DeleteMapping("/dots/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
        printoutService.deleteDot(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    } 
}
