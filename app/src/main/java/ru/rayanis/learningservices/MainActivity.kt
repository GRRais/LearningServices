package ru.rayanis.learningservices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.rayanis.learningservices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val b by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)
        b.simpleService.setOnClickListener {
            startService(MyService.newIntent(this))
        }
    }
}