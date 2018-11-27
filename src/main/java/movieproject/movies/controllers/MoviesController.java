package movieproject.movies.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MoviesController {
    List<String> movies;

    public MoviesController() {

        this.movies = new ArrayList<String>();

        int count = 10;
        for (int i = 0; i < count; i++) {
            movies.add("Movie #" + (i + 1));
        }
    }
    //Get /api/movies -> all movies"['
    @RequestMapping(value="/movies",method = RequestMethod.GET)
    public List<String> getAll() {
        return this.movies;
    }

    //Post /api/movies -> create new movie
    @PostMapping("/movies")
    public String addMovie(String newMovie) {
        this.movies.add(newMovie);
        return newMovie;
    }
    //get /api/movies/MOVIE_ID -> detailed info about movie

    //put /api/movies/MOVIE_ID -> vote for movie
}
