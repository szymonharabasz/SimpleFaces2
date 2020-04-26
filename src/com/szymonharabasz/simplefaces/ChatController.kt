package com.szymonharabasz.simplefaces

import java.io.Serializable
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.context.SessionScoped
import javax.faces.push.Push
import javax.faces.push.PushContext
import javax.inject.Inject
import javax.inject.Named

@Named
@SessionScoped
class ChatController(var message: String = "") : Serializable {

    @Inject
    private lateinit var jsfWebSocketMessageSender: JsfWebSocketMessageSender

    fun sendMessage() {
        jsfWebSocketMessageSender.send("${message}")
    }

}

@Named
@ApplicationScoped
open class JsfWebSocketMessageSender : Serializable {

    @Inject
    @Push
    private lateinit var pushContext: PushContext

    open fun send(message: String) {
        pushContext.send(message)
    }

}
