package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Cursor
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloScene : Application() {
    override fun start(primaryStage: Stage?) {
        val vb = VBox(Label("this is a label"))
        val s = Scene(vb, 300.0, 200.0)
        s.cursor = Cursor.CROSSHAIR
        primaryStage!!.scene = s
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloScene::class.java)
}