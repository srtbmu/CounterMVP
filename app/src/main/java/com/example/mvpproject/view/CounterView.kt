package com.example.mvpproject.view

interface CounterView {

    fun updateText(count: String)

    fun changeColor(color: Int)

    fun showToast()
}