package com.ibd.ibd.services;

import java.util.ArrayList;
import java.util.List;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.models.Printers;
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

    private PrintersData populatePrintersData(final Printers printersData) {
        PrintersData printer = new PrintersData();
        printer.setID(printersData.getID());
        printer.setOwner(printersData.getOwner());
        printer.setLocalization(printersData.getLocalization());
        printer.setType(printersData.getType());
        return printer;
    }
}


