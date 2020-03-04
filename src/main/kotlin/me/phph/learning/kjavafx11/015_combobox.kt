package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.layout.HBox
import javafx.stage.Stage

class HelloCombobox:Application() {
    override fun start(primaryStage: Stage?) {
        val cb1 = ComboBox<String>()
        cb1.items.addAll(listOf("Item 1", "Item 2", "Item 3"))

        val cb2 = ComboBox<String>().apply { isEditable = true }
        cb2.items.addAll(listOf("Item 1", "Item 2", "Item 3"))

        val btn = Button("get value")
        btn.onAction = EventHandler{e -> println(cb2.value)}

        val hbox = HBox(cb1, cb2, btn)
        primaryStage!!.apply {
            title = "Combobox showcase"
            scene = Scene(hbox)
        }.show()
    }
}

fun main() {
    Application.launch(HelloCombobox::class.java)
}