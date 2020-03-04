package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Hyperlink
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloHyperlink : Application() {
    override fun start(primaryStage: Stage?) {
        val link = Hyperlink("click me")
        link.onAction = EventHandler { println("The hyperlink is clicked") }
        val vbox = VBox(link)
        val scene = Scene(vbox, 960.0, 600.0)
        with(primaryStage!!) {
            this.scene = scene
            this.title = "Hyperlink Test"
        }
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloHyperlink::class.java)
}