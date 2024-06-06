package dev.eslender.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/movies")
public class movieController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping
    public ResponseEntity<List<Movies>> getAllMovies(){
        return  new ResponseEntity<List<Movies>>(moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movies>>(moviesService.singleMovies(imdbId), HttpStatus.OK);
    }
}
