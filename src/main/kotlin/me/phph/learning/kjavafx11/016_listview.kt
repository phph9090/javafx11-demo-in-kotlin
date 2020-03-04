package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.ListView
import javafx.scene.control.SelectionMode
import javafx.stage.Stage

class HelloListView : Application() {
    override fun start(primaryStage: Stage?) {
        val lv = ListView<String>().apply {
            items.addAll("Item 1", "Item 2", "Item 3")
            selectionModel.selectionMode = SelectionMode.MULTIPLE
            onMouseClicked = EventHandler { e -> e.source.let { it as ListView<*> }.selectionModel.selectedIndices.forEach(::println) }
        }
        primaryStage!!.apply {
            title = "ListView showcase"
            scene = Scene(lv, 200.0, 100.0)
        }.show()
    }
}

fun main() {
    Application.launch(HelloListView::class.java)
}