package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloTextField : Application() {
    override fun start(primaryStage: Stage?) {
        val tf = TextField().apply { text = "Initial text" }
        val btn = Button("click me to get text")
        btn.onAction = EventHandler { tf.text.run(::println) }
        val vbox = VBox(tf, btn)
        val s = Scene(vbox)
        primaryStage!!.apply {
            title = "TextField showcase"
            scene = s
        }.show()
    }
}

fun main() {
    Application.launch(HelloTextField::class.java)
}