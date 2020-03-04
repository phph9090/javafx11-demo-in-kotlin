package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Modality
import javafx.stage.Stage
import javafx.stage.StageStyle

class HelloStage:Application() {
    override fun start(primaryStage: Stage?) {
        val l = Label("I'm a label")
        val s = Scene(l)
        with(primaryStage!!) {
            title = "this is a stage demo"
            width = 800.0
            height = 600.0
            x = 100.0
            y = 100.0
            scene = s
//            initStyle(StageStyle.UNDECORATED)
            initStyle(StageStyle.UNIFIED)
            isFullScreen = true
        }
        val stage = Stage()
        stage.initModality(Modality.WINDOW_MODAL)
//        stage.initModality(Modality.NONE)
//        stage.initModality(Modality.APPLICATION_MODAL)
        stage.initOwner(primaryStage)
        primaryStage.show()
        stage.showAndWait()
    }
}

fun main() {
    Application.launch(HelloStage::class.java)
}