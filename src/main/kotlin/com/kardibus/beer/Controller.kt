package com.kardibus.beer

import com.kardibus.beer.model.DateModel
import com.kardibus.beer.model.StateModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private var beerService: BeerService) {

    @GetMapping
    fun getState(): StateModel {
        return beerService.state()
    }

    @GetMapping("/test")
    fun getTest(): DateModel {
        return beerService.time()
    }
}