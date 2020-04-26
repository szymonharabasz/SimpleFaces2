package com.szymonharabasz.simplefaces

import javax.enterprise.context.RequestScoped
import javax.inject.Named

@Named
@RequestScoped
class User(var firstName: String = "", var lastName: String = "", var email: String = "")