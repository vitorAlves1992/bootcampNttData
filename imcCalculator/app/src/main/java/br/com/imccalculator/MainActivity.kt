package br.com.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.imccalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        binding.calcularBtn.setOnClickListener {

            calcularImc(binding.peso.text.toString(),binding.altura.text.toString())

        }

    }
    private fun calcularImc(peso:String, altura: String){

        val peso= peso.toFloatOrNull()
        val altura= altura.toFloatOrNull()

        if(peso!=null && altura!=null){

            val imc= peso/(altura*altura)
            binding.resultado.text="O Valor do IMC é: $imc"
        }

    }


}