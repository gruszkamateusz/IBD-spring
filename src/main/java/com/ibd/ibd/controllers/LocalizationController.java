package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.LocalizationData;
import com.ibd.ibd.services.LocalizationService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalizationController {
    @Resource(name = "localizationService")
    private LocalizationService printersService;
    
    @CrossOrigin
    @GetMapping("/localizations/all")
    public List<LocalizationData> getPrinters() {
        return printersService.getAllLocalization();
    }
    @CrossOrigin
    @DeleteMapping("/localizations/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
         printersService.deleteLocalization(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    }
}
