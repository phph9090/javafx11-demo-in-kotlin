package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloCssStyling : Application() {
    override fun start(primaryStage: Stage?) {
        val button1 = Button("Button 1")
        val scene1 = Scene(button1, 200.0, 100.0)
        scene1.stylesheets.add(Thread.currentThread()
                .contextClassLoader.getResource("css/button-style.css")!!.toExternalForm())
        primaryStage!!.scene = scene1

        val stage = Stage()

        val vbox1 = VBox()
        val vbox2 = VBox()
        vbox2.stylesheets += Thread.currentThread()
                .contextClassLoader.getResource("css/button-style2.css")!!.toExternalForm()
        val button2 = Button("Button 2")
        vbox2.children += button2;
        val button3 = Button("Button 3")
        vbox1.children += vbox2
        vbox1.children += button3
        val scene2 = Scene(vbox1, 400.0, 200.0)
        stage.scene = scene2

        val button4 = Button("Button 4")
        button4.style = "-fx-background-color: #0000ff;" + "-fx-border-color: #ff0000;"
        vbox1.children += button4

        primaryStage.show()
        stage.show()
    }
}

fun main() {
    Application.launch(HelloCssStyling::class.java)
}