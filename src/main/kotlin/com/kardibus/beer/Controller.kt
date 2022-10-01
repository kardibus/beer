package com.kardibus.beer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(var stateModel: StateModel) {

    @GetMapping
    fun getState(): StateModel {
        return stateModel
    }
}