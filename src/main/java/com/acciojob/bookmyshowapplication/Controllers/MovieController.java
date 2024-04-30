package com.acciojob.bookmyshowapplication.Controllers;

import com.acciojob.bookmyshowapplication.Models.Movie;
import com.acciojob.bookmyshowapplication.Requests.UpdateMovieRequest;
import com.acciojob.bookmyshowapplication.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody Movie movie){
        String response = movieService.addMovie(movie);
        return response;
    }

    @PutMapping("/updateMovieAttributes")
    public String updateMovieAttributes(@RequestBody UpdateMovieRequest movieRequest) {
        //You have made sure that only relevant attributes
        //are expose to the client
        UpdateMovieRequest UpdateMovieRequest;
        String result = movieService.updateMovieAttributes(movieRequest);
        return result;
    }
}