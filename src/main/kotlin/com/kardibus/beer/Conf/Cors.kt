package com.kardibus.beer.Conf

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer



@Configuration
class Cors {
    fun corsConfigurer(): WebMvcConfigurer? {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:3000").allowedOrigins("https://kardibus-beer.herokuapp.com/")
            }
        }
    }
}