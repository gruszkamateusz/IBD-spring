package com.ibd.ibd.services;

import java.util.ArrayList;
import java.util.List;

import com.ibd.ibd.dto.LocalizationData;
import com.ibd.ibd.models.Localization;
import com.ibd.ibd.repositories.LocalizationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("localizationService")
public class LocalizationService {
    @Autowired
    private LocalizationRepository localizationRepository;

    public List <LocalizationData> getAllLocalization(){
        List < LocalizationData > localizations = new ArrayList < > ();
        List < Localization > localizationsList = localizationRepository.findAll();
        for(int i =0; i< localizationsList.size();i++ ){
            localizations.add(populatePrintoutData(localizationsList.get(i)));
        }
        return localizations;

    }

    public void deleteLocalization(long id){
        localizationRepository.deleteById(id);
    }

    private LocalizationData populatePrintoutData(final Localization localization) {
        LocalizationData localizationData = new LocalizationData();
        localizationData.setID(localization.getID());
        localizationData.setCity(localization.getCity());
        localizationData.setPostcode(localization.getPostcode());
        localizationData.setStreet(localization.getStreet());

        return localizationData;
    }
    public void save(Localization localization) {
        localizationRepository.save(localization);
    }
}