package me.phph.learning.kjavafx11

import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloButton : Application() {
    override fun start(primaryStage: Stage?) {
        val vbox = VBox()

        val btn1 = Button("button with long text")
        btn1.setMaxSize(100.0, 100.0)
        val btn2 = Button("button with long text")
        btn2.setMaxSize(100.0, 100.0)
        btn2.isWrapText = true
        vbox.children += btn1
        vbox.children += btn2

        val imageView = ImageView(Image(Thread.currentThread().contextClassLoader.getResourceAsStream("images/avatar.jpg")))
        val btn3 = Button("image button", imageView)
        vbox.children += btn3

        val btn4 = Button("button")
        btn4.setMinSize(100.0, 50.0);
        vbox.children += btn4

        val btn5 = Button("button")
        btn5.setMaxSize(200.0, 100.0)
        vbox.children += btn5

        val label = Label("This is a label")
        val btn6 = Button("click me")
        btn6.onAction = EventHandler { label.text = "button clicked" }
        vbox.children += btn6
        vbox.children += label
        val btn7 = Button("_Mnemonic")
        btn7.isMnemonicParsing = true
        btn7.onAction = EventHandler { label.text = "mnemonic button clicked" }
        vbox.children += btn7

        val btn8 = Button("Custom Styled Button")
        btn8.style = "-fx-background-color: blue; -fx-text-fill: white;"
        vbox.children += btn8

        val btn9 = Button("disabled button")
        btn9.isDisable = true
        vbox.children += btn9

        primaryStage!!.title = "button showcase"
        primaryStage.scene = Scene(vbox)
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloButton::class.java)
}