package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Stage

class HelloWorld : Application() {
    override fun start(p0: Stage?) {
        val l = Label("Hello JavaFX")
        val s = Scene(l, 200.0, 150.0)
        with(p0!!) {
            scene = s
            width = 800.0
            height = 600.0
            title = "First JavaFX Application"
        }
        p0.show()
    }
}

fun main() {
    Application.launch(HelloWorld::class.java)
}

