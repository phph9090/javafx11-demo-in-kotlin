package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.ChoiceBox
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloChoicebox : Application() {
    override fun start(primaryStage: Stage?) {
        val cb1 = ChoiceBox<String>()
        cb1.items.addAll(listOf("Choice 1", "Choice 2", "Choice 3"))
        cb1.onAction = EventHandler { e -> println(e.source.let { it as ChoiceBox<*> }.value.let { it as String }) }

        val cb2 = ChoiceBox<Label>()
        cb2.items.addAll(listOf(Label("label1"), Label("label2"), Label("label3")))
        cb2.onAction = EventHandler { e -> println(e.source.let { it as ChoiceBox<*> }.value.let { it as String }) }

        val vbox = VBox(cb1, cb2)

        primaryStage!!.apply {
            title = "Choicebox showcase"
            scene = Scene(vbox, 200.0, 100.0)
        }.show()
    }
}

fun main() {
    Application.launch(HelloChoicebox::class.java)
}