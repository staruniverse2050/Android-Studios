package com.example.mi_primer_trabajo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myCheckBox = findViewById<CheckBox>(R.id.checkBox)
        val myCheckBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val myRadioButton = findViewById<RadioButton>(R.id.radioButton)
        val myRadioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val myswitch = findViewById<Switch>(R.id.switch1)
        val mytoggleButton = findViewById<ToggleButton>(R.id.toggleButton2)


        val myButton = findViewById<Button>(R.id.Oprimeme)

        myButton.setOnClickListener {

            val message = StringBuilder()

            val Numbertxt : EditText = findViewById(R.id.editTextNumber)
            val Number = Numbertxt.text.toString()
            message.append("$Number \n")


            if(myRadioButton.isChecked && myRadioButton2.isChecked){
                message.append("Radio 1 y Radio 2 están seleccionados. \n")
            }else if(myRadioButton2.isChecked) {
                message.append("Radio 2 está seleccionado. \n")
            }else if (myRadioButton.isChecked){
                message.append("Radio 1 está seleccionado. \n")
            }else {
                message.append("Radio NO está seleccionado. \n")
            }

            if (myCheckBox.isChecked && myCheckBox2.isChecked) {
                message.append("Check 1 y Check 2 están seleccionados. \n")
            }else if(myCheckBox.isChecked){
                message.append("Check 1 seleccionado. \n")
            }else if(myCheckBox2.isChecked) {
                message.append("Check 2 seleccionado. \n")
            }else {
                    message.append("Check NO está seleccionado. \n")
            }


            if (mytoggleButton.isChecked ) {
                message.append("ToggleButton seleccionado. \n")
            }else {
                message.append("ToggleButton NO está seleccionado. \n")
            }


            if (myswitch.isChecked ) {
                message.append("Switch seleccionado. \n")
            }else {
                message.append("Switch NO está seleccionado. \n")
            }

            Toast.makeText(this, message.toString(), Toast.LENGTH_SHORT).show()
        }
    }


}