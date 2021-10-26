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
    private PrintersRepository customerRepository;

    public List <PrintersData> getAllPrinters(){
        List < PrintersData > customers = new ArrayList < > ();
        List < Printers > customerList = customerRepository.findAll();
        for(int i =0; i< customerList.size();i++ ){
            customers.add(populateCustomerData(customerList.get(i)));
        }
        return customers;

    }
    private PrintersData populateCustomerData(final Printers customerData) {
        PrintersData customer = new PrintersData();
        customer.setID(customerData.getID());
        customer.setOwner(customerData.getOwner());
        customer.setLocalization(customerData.getLocalization());
        customer.setType(customerData.getType());
        return customer;
    }
}


