package dev.eslender.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movies> allMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movies> singleMovies(String imdbId){
        return moviesRepository.findMoviesByimdbId(imdbId);
    }
}
