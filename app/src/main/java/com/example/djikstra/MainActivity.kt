package com.example.djikstra

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var graphTb = findViewById<TextView>(R.id.graphTb)

        var xval = findViewById<TextView>(R.id.xval)
        var yval = findViewById<TextView>(R.id.yval)
        var xup = findViewById<Button>(R.id.Xup)
        var xdown = findViewById<Button>(R.id.Xdown)
        var yup = findViewById<Button>(R.id.Yup)
        var ydown = findViewById<Button>(R.id.Ydown)
        var changeB = findViewById<Button>(R.id.changeB)

        val mat = arrayOf(
            intArrayOf(1, 0, 1, 1, 1, 1, 0, 1, 1, 1),
            intArrayOf(1, 0, 1, 0, 1, 1, 1, 0, 1, 1),
            intArrayOf(1, 1, 1, 0, 1, 1, 0, 1, 0, 1),
            intArrayOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 1),
            intArrayOf(1, 1, 1, 0, 1, 1, 1, 0, 1, 0),
            intArrayOf(1, 0, 1, 1, 1, 1, 0, 1, 0, 0),
            intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 1),
            intArrayOf(1, 0, 1, 1, 1, 1, 0, 1, 1, 1),
            intArrayOf(1, 1, 0, 0, 0, 0, 1, 0, 0, 1)
        )
        graphTb.setText(mat[0][0].toString())


        xup.setOnClickListener(){
           var x = xval.text.toString().toInt() + 1
            var y = yval.text.toString().toInt()
            graphTb.setText(mat[x][y].toString())
            xval.setText(x.toString())


        }
        xdown.setOnClickListener(){
            var x = xval.text.toString().toInt() -1
            var y = yval.text.toString().toInt()
            graphTb.setText(mat[x][y].toString())
            xval.setText(x.toString())
        }
        yup.setOnClickListener(){
            var x = xval.text.toString().toInt()
            var y = yval.text.toString().toInt() +1
            graphTb.setText(mat[x][y].toString())
            yval.setText(y.toString())
        }
        ydown.setOnClickListener(){
            var x = xval.text.toString().toInt()
            var y = yval.text.toString().toInt()-1
            graphTb.setText(mat[x][y].toString())
            yval.setText(y.toString())
        }
        changeB.setOnClickListener(){
            var x = xval.text.toString().toInt()
            var y = yval.text.toString().toInt()
            mat[x][y] = graphTb.text.toString().toInt()
            graphTb.setText(mat[x][y].toString());
        }
    }


}
