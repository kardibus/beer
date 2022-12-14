package com.kardibus.beer

import com.kardibus.beer.model.Beer
import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import com.kardibus.beer.model.WorkModel
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private var beerService: BeerService) {

    @GetMapping
    fun getState(): StateModel {
        return beerService.state()
    }

    @GetMapping("/test")
    fun getWorkTime(): Beer {
        return beerService.calculateWorkTime()
    }

    @GetMapping("/work")
    fun getWork(): WorkModel {
        return beerService.work()
    }
}