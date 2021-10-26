package com.ibd.ibd.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.services.PrintersService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/printers")
public class PrintersController {

    @Resource(name = "printersService")
    private PrintersService customerService;

    @RequestMapping("/printers/all")
    public List<PrintersData> getCustomers() {
        return customerService.getAllPrinters();
    }
}
