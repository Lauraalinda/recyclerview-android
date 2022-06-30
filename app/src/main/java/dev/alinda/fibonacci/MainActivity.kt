package dev.alinda.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.alinda.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var numberslist = fibonacciNumbers(100)
        println (numberslist)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numbersAdapter = NumbersRecyclerViewAdapter(numberslist)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numbersAdapter




    }


    fun fibonacciNumbers(size: Int): List<Int> {
        var list = ArrayList<Int>()
        var first = 0
        var second = 1
        var sum = 0
        while (sum <= size) {
            print("$first")
            val next = first + second
            first = second
            second = next
            sum++
            list += next
        }
        return list
    }
}


