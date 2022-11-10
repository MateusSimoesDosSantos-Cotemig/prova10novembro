package com.example.minhasfinancas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Nome: SEU NOME AQUI
 */

class MainActivity : AppCompatActivity() {

    private val transacoes: MutableList<Transacao> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getTransacoes(): List<Transacao> {
        return transacoes
    }

    fun getTotal(): String {
        return "R\$${transacoes.sumBy { if(it.retirada) it.valor.toInt() * -1 else it.valor.toInt() }}"
    }

    fun salvarTransacao(transacao: Transacao) {
        transacoes.add(transacao)
    }
}