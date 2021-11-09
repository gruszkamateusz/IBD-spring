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
    private PrintoutsRepository printoutsRepository;

    public List <PrintoutData> getAllPrintouts(){
        List < PrintoutData > printouts = new ArrayList < > ();
        List < Printouts > printoutsList = printoutsRepository.findAll();
        for(int i =0; i< printoutsList.size();i++ ){
            printouts.add(populatePrintoutData(printoutsList.get(i)));
        }
        return printouts;

    }

    public void deletePrinter(long id){
        printoutsRepository.deleteById(id);
    }

    private PrintoutData populatePrintoutData(final Printouts printout) {
        PrintoutData printoutsData = new PrintoutData();
        printoutsData.setID(printout.getID());
        printoutsData.setIDPrinter(printout.getIDPrinter());
        printoutsData.setTitle(printout.getTitle());
        printoutsData.setDate(printout.getDate());
        return printoutsData;
    }
    public void save(Printouts printout) {
        printoutsRepository.save(printout);
    }
}
