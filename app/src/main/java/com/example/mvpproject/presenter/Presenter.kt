package com.example.mvpproject.presenter

import android.graphics.Color
import com.example.mvpproject.MainActivity
import com.example.mvpproject.model.CounterModel
import com.example.mvpproject.view.CounterView

class Presenter {

    private var model = CounterModel()

    private lateinit var view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.changeColor(Color.GREEN)
        }
    }

    fun decrementCount() {
        model.decrement()
        view.updateText(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count < 15) {
            view.changeColor(Color.BLACK)
        }
    }

    fun attachView(view: MainActivity) {
        this.view = view
    }
}
