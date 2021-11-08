package com.ibd.ibd.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.models.Localization;
import com.ibd.ibd.models.Printers;
import com.ibd.ibd.repositories.LocalizationRepository;
import com.ibd.ibd.repositories.PrintersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("printersService")
public class PrintersService{

    @Autowired
    private PrintersRepository printersRepository;

    public List <PrintersData> getAllPrinters(){
        List < PrintersData > printers = new ArrayList < > ();
        List < Printers > printersList = printersRepository.findAll();
        for(int i =0; i< printersList.size();i++ ){
            printers.add(populatePrintersData(printersList.get(i)));
        }
        return printers;

    }
    public void deletePrinter(long id){
        printersRepository.deleteById(id);
    }

    private PrintersData populatePrintersData(final Printers printer) {

        PrintersData printerData = new PrintersData();
        printerData.setID(printer.getID());
        printerData.setOwner(printer.getOwner());
        printerData.setLocalization(printer.getLocalization());
        printerData.setType(printer.getType());
        return printerData;
    }
    
    public void save(Printers document) {
        printersRepository.save(document);
    }
}


