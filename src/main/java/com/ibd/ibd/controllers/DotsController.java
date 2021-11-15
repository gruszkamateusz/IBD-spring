package com.ibd.ibd.controllers;
import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.DotsData;
import com.ibd.ibd.models.Dots;
import com.ibd.ibd.services.DotsService;

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
public class DotsController {
    @Resource(name = "dotsService")
    private DotsService dotsService;
    
    @CrossOrigin
    @GetMapping("/dots/all")
    public List<DotsData> getPrinters() {
        return dotsService.getAllPrintouts();
    }
    @CrossOrigin
    @DeleteMapping("/dots/{id}")
    public ResponseEntity<Integer> deletePrinter(@PathVariable(value = "id") long id) {
        dotsService.deleteDot(id);; 
        return new ResponseEntity<>(200,HttpStatus.OK);
    } 

    @RequestMapping(value = "/dots/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> insertPrinter(@RequestBody DotsData inputPayload){ 

        Dots dot = new Dots();
        //printer.setID(inputPayload.getID());
        dot.setIDPrinter(inputPayload.getPrinter());
        dot.setTitle(inputPayload.getTitle());
        dot.setDate(inputPayload.getDate());
        dotsService.save(dot);
            return new ResponseEntity<>(200,HttpStatus.OK);
        }
}
