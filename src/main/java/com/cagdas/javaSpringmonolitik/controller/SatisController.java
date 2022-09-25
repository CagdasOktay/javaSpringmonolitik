package com.cagdas.javaSpringmonolitik.controller;


import com.cagdas.javaSpringmonolitik.repository.entity.Satis;
import com.cagdas.javaSpringmonolitik.service.SatisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/satis")
@RequiredArgsConstructor
public class SatisController {

    private  final SatisService satisService;

    @GetMapping ("/Hello")
    public String Hello(){

        return "hello";
    }

    @GetMapping("/save")
    public ResponseEntity<Void> save(String musteriadi,String urunadi,Double fiyat){
        satisService.save(Satis.builder()
                .fiyat(fiyat)
                .urunad(urunadi)
                .musteriad(musteriadi)
                .build());
        return ResponseEntity.ok().build();


    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Satis>> findAll(){
        return ResponseEntity.ok(satisService.findAll());
    }


}
