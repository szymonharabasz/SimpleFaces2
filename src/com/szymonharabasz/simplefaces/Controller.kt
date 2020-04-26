package com.szymonharabasz.simplefaces

import javax.enterprise.context.RequestScoped
import javax.faces.event.ActionEvent
import javax.faces.event.AjaxBehaviorEvent
import javax.inject.Named

@Named
@RequestScoped
class Controller(
        var text: String = "",
        var firstOperand: Int = 0,
        var secondOperand: Int = 0,
        var total: Int = 0
) {
    private fun calculateTotal() { total = firstOperand + secondOperand }
    fun calculateTotal(actionEvent: ActionEvent) { calculateTotal() }
    fun calculateTotal(ajaxBehaviorEvent: AjaxBehaviorEvent) { calculateTotal() }
}