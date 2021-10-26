package com.ibd.ibd.services;

import java.util.ArrayList;
import java.util.List;

import com.ibd.ibd.dto.PrintoutData;
import com.ibd.ibd.models.Printouts;
import com.ibd.ibd.repositories.PrintoutsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("printoutsService")
public class PrintoutService {
    @Autowired
    private PrintoutsRepository printersRepository;

    public List <PrintoutData> getAllPrintouts(){
        List < PrintoutData > printouts = new ArrayList < > ();
        List < Printouts > printoutsList = printersRepository.findAll();
        for(int i =0; i< printoutsList.size();i++ ){
            printouts.add(populatePrintoutData(printoutsList.get(i)));
        }
        return printouts;

    }

    public void deletePrinter(long id){
        printersRepository.deleteById(id);
    }

    private PrintoutData populatePrintoutData(final Printouts printoutsData) {
        PrintoutData printout = new PrintoutData();
        printout.setID(printoutsData.getID());
        printout.setIDPrinter(printoutsData.getIDPrinter());
        printout.setTitle(printoutsData.getTitle());
        printout.setDate(printoutsData.getDate());
        return printout;
    }
}
