package com.projeto.services;

import com.projeto.dto.MovieDTO;
import com.projeto.entities.Movie;
import com.projeto.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional
    public MovieDTO findById(Long id){
       Movie result = movieRepository.findById(id).get();
       MovieDTO dto = new MovieDTO(result);
       return dto;
    }
}
