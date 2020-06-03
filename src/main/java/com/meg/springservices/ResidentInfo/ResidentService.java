package com.meg.springservices.ResidentInfo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ResidentService {

    public List<ResidentDao> getAllResidents(){
        // DB Call;
        ResidentDao residentDao = ResidentDao.builder()
                .firstName("Meg")
                .lastName("Gurram")
                .build();
        return Arrays.asList(residentDao);
    }
}
