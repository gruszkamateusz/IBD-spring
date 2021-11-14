package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.PrintoutData;
import com.ibd.ibd.models.Printers;
import com.ibd.ibd.models.Printouts;
import com.ibd.ibd.services.PrintoutService;

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
public class PrintoutController {
    
    @Resource(name = "printoutsService")
    private PrintoutService printoutService;
    
    @CrossOrigin
    @GetMapping("/printouts/all")
    public List<PrintoutData> getPrinters() {
        return printoutService.getAllPrintouts();
    }
    @CrossOrigin
    @DeleteMapping("/printouts/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
        printoutService.deletePrinter(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    } 

    @RequestMapping(value = "/printouts/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> insertPrinter(@RequestBody PrintoutData inputPayload){ 

        Printouts printout = new Printouts();
        //printer.setID(inputPayload.getID());
        printout.setPrinter(inputPayload.getPrinter());
        printout.setTitle(inputPayload.getTitle());
        printout.setDate(inputPayload.getDate());
            return new ResponseEntity<>(200,HttpStatus.OK);
        }
}
