package com.example.a17_alertdialog_backpress

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickIBTN.setOnClickListener {
           alertFunction()

        }
        clickBTN.setOnClickListener {
           alertFunction()

        }
    }

    override fun onBackPressed() {
        alertFunction()
    }

    private fun alertFunction() {
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Exit Alert")
        builder.setMessage("Are you Sure want to Exit?")
        builder.setPositiveButton("YES",{dialogInterface:DialogInterface,i:Int ->
            finish()

        })
        builder.setNegativeButton("NO",{dialogInterface:DialogInterface,i:Int ->
            Toast.makeText(this,"You are on the Application",Toast.LENGTH_SHORT).show()
        })
        builder.show()
    }
}