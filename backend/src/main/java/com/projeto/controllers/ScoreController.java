package com.projeto.controllers;

import com.projeto.dto.MovieDTO;
import com.projeto.dto.ScoreDTO;
import com.projeto.services.MovieService;
import com.projeto.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO savaScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = scoreService.saveScore(dto);
        return movieDTO;
    }

 }
