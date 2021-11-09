package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.LocalizationData;
import com.ibd.ibd.models.Localization;
import com.ibd.ibd.services.LocalizationService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalizationController {
    @Resource(name = "localizationService")
    private LocalizationService localizationService;
    
    @CrossOrigin
    @GetMapping("/localizations/all")
    public List<LocalizationData> getPrinters() {
        return localizationService.getAllLocalization();
    }
    @CrossOrigin
    @DeleteMapping("/localizations/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
         localizationService.deleteLocalization(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    }
    @RequestMapping(value = "/localizations/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> insertPrinter(@RequestBody LocalizationData inputPayload){ 

        Localization localization = new Localization();
        localization.setCity(inputPayload.getCity());
        localization.setStreet(inputPayload.getStreet());
        localization.setPostcode(inputPayload.getPostcode());
        localizationService.save(localization);

            return new ResponseEntity<>(200,HttpStatus.OK);
        }
}
