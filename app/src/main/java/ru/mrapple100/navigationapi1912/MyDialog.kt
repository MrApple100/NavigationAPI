package ru.mrapple100.navigationapi1912

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.DialogCompat
import androidx.fragment.app.DialogFragment

class MyDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val games = arrayOf("Mario","TMNT","Terraria","Sims4","Minecraft")
        var number = 0
        return AlertDialog.Builder(activity)

            .setSingleChoiceItems(games,0) { dialog, which ->
                number = which
            }
            .setTitle("Какая игра будет популярна в 2025")
            .setPositiveButton("ОК") { dialog, which ->
                Toast.makeText(activity?.baseContext!!,games[number],Toast.LENGTH_SHORT).show()
            }
//            .setMessage("Вы охтите рыбов? Вам всего лишь нужно 3 пачка...")
//            .setPositiveButton("Да нужно!", null)
//            .setNegativeButton("Нет",null)
//            .setNeutralButton("Воздержусь", null)
            .create()



    }
}