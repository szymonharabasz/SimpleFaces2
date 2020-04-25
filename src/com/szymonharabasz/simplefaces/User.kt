package com.szymonharabasz.simplefaces

import javax.enterprise.context.RequestScoped
import javax.faces.annotation.FacesConfig
import javax.inject.Named
import javax.faces.annotation.FacesConfig.Version.JSF_2_3
import javax.faces.bean.ManagedBean

@Named(value = "user")
@RequestScoped
@FacesConfig(version = JSF_2_3)
open class User(var firstName: String = "", var lastName: String = "", var email: String = "")