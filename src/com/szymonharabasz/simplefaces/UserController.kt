package com.szymonharabasz.simplefaces

import java.io.Serializable
import javax.enterprise.context.SessionScoped
import javax.faces.application.FacesMessage
import javax.faces.context.FacesContext
import javax.inject.Inject
import javax.inject.Named

@Named
@SessionScoped
class UserController : Serializable {
    @Inject
    private lateinit var facesContext: FacesContext
    fun saveData(): String {

        val facesMessage = FacesMessage(FacesMessage.SEVERITY_INFO, "All data successfully saved", "")
        facesContext.addMessage(null, facesMessage)

        return "confirmation"
    }
}