package ru.rayanis.learningservices

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import ru.rayanis.learningservices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val b by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)
        b.simpleService.setOnClickListener {
            startService(MyService.newIntent(this , 25))
        }
        b.foregroundService.setOnClickListener {startForegroundService(MyForegroundService.newIntent(this))
        }
    }
}