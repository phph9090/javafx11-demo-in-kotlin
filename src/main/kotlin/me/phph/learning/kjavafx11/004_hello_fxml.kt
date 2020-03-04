package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloFXML : Application() {
    override fun start(primaryStage: Stage?) {
        val loader = FXMLLoader()
        loader.location = Thread.currentThread().contextClassLoader.getResource("004_hello_fxml.fxml")
        val vb = loader.load<VBox>()
        val s = Scene(vb)
        primaryStage!!.scene = s
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloFXML::class.java)
}