package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.models.Printers;
import com.ibd.ibd.services.PrintersService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/printers")
public class PrintersController {

    @Resource(name = "printersService")
    private PrintersService printersService;
    
    @CrossOrigin
    @GetMapping("/printers/all")
    public List<PrintersData> getPrinters() {
        return printersService.getAllPrinters();
    }
    @CrossOrigin
    @DeleteMapping("/printers/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
         printersService.deletePrinter(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    }

    // @RequestMapping(value = "/printers/add", method = RequestMethod.POST)
    // @ResponseBody
    // public ResponseEntity<Integer> insertPrinter(@RequestParam("idprinters") Long idprinters,@RequestParam("idlocalization") Long idlocalization,@RequestParam("owner") String owner,@RequestParam("type") String type){

    //         Printers document = new Printers(idprinters,idlocalization,owner,type);
    //         printersService.save(document);

    //         return new ResponseEntity<>(200,HttpStatus.OK);
    //     }
}
