package com.szymonharabasz.simplefaces.validator

import javax.faces.application.FacesMessage
import javax.faces.component.UIComponent
import javax.faces.component.html.HtmlInputText
import javax.faces.context.FacesContext
import javax.faces.validator.FacesValidator
import javax.faces.validator.Validator
import javax.faces.validator.ValidatorException

@FacesValidator(value = "emailValidator")
class EmailValidator : Validator<String> {
    override fun validate(context: FacesContext?, component: UIComponent?, value: String?) {
        val emailValidator = org.apache.commons.validator.routines.EmailValidator.getInstance()

        if (!value!!.isEmpty()) {
            if (!emailValidator.isValid(value)) {
                val htmlInputText = component as HtmlInputText
                val facesMessage = FacesMessage("${htmlInputText.label}: email format is not valid.")
                throw ValidatorException(facesMessage)
            }
        }
    }
}