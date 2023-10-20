package ru.levelup.devops_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevopsAppApplication

fun main(args: Array<String>) {
    runApplication<DevopsAppApplication>(*args)
}
