package com.ibd.ibd.services;

import java.util.ArrayList;
import java.util.List;

import com.ibd.ibd.dto.DotsData;
import com.ibd.ibd.models.Dots;
import com.ibd.ibd.repositories.DotsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dotsService")
public class DotsService {
    @Autowired
    private DotsRepository dotsRepository;

    public List <DotsData> getAllPrintouts(){
        List < DotsData > dots = new ArrayList < > ();
        List < Dots > dotsList = dotsRepository.findAll();
        for(int i =0; i< dotsList.size();i++ ){
            dots.add(populatePrintoutData(dotsList.get(i)));
        }
        return dots;

    }

    public void deleteDot(long id){
        dotsRepository.deleteById(id);
    }

    private DotsData populatePrintoutData(final Dots dot) {
        DotsData dotsData = new DotsData();
        dotsData.setID(dot.getID());
        dotsData.setPrinter(dot.getIDPrinter());
        dotsData.setTitle(dot.getTitle());
        dotsData.setDate(dot.getDate());
        return dotsData;
    }
}