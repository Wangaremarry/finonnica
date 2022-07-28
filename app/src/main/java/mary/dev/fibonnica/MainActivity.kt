package mary.dev.fibonnica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mary.dev.fibonnica.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumber()
    }

    fun displayNumber() {
        var fiblist = generate100fibonacci()
        val numberlist = NumberRecyclerViewAdater(fiblist)
        binding.rvnumber.layoutManager = LinearLayoutManager(this)
        binding.rvnumber.adapter = numberlist


    }

    fun generate100fibonacci(): MutableList<BigInteger> {
        var fiblist: MutableList<BigInteger> = mutableListOf(BigInteger.ZERO, BigInteger.ONE)
        while (fiblist.size < 100) {
            var last = fiblist.get(fiblist.lastIndex)
            var secondlast = fiblist.get(fiblist.lastIndex - 1)
            var next = last + secondlast
            fiblist.add(next)

        }
        return fiblist
    }
}

