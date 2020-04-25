package com.szymonharabasz.simplefaces.validator

import javax.enterprise.context.RequestScoped
import javax.faces.component.UIComponent
import javax.faces.context.FacesContext
import javax.inject.Named

import org.apache.commons.lang3.StringUtils
import javax.faces.application.FacesMessage
import javax.faces.component.html.HtmlInputText
import javax.faces.validator.ValidatorException

@Named
@RequestScoped
class AlphaValidator {
    fun validateAlpha(context: FacesContext?, component: UIComponent?, value: Any?) {
        if (!StringUtils.isAlphaSpace(value as String)) {
            val htmlInputText = component as HtmlInputText
            val facesMessage = FacesMessage("${htmlInputText.label}: only alphanumeric characters are allowed.")
            throw ValidatorException(facesMessage)
        }
    }
}