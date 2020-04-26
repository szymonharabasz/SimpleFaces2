package com.szymonharabasz.simplefaces

import javax.enterprise.context.RequestScoped
import javax.faces.event.ActionEvent
import javax.inject.Named

@Named
@RequestScoped
class Controller(
        var text: String = "",
        var firstOperand: Int = 0,
        var secondOperand: Int = 0,
        var total: Int = 0
) {
    fun calculateTotal(actionEvent: ActionEvent) { total = firstOperand + secondOperand }
}