package com.cagdas.javaSpringmonolitik.service;


import com.cagdas.javaSpringmonolitik.repository.ISatisRepository;
import com.cagdas.javaSpringmonolitik.repository.entity.Satis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SatisService {
    private final ISatisRepository satisRepository;

    public Satis save(Satis satis){
        return satisRepository.save(satis);

    }

    public List<Satis> findAll(){

        return satisRepository.findAll();

    }
}
