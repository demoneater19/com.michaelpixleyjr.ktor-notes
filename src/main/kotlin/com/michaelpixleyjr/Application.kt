package com.michaelpixleyjr

import com.michaelpixleyjr.data.model.NoteDataAccessObject
import com.michaelpixleyjr.data.model.NotesDatabase
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.slf4j.event.Level

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

val database: NoteDataAccessObject = NotesDatabase()

fun Application.module() {

    install(DefaultHeaders)
    install(CallLogging){
        level = Level.INFO
    }

    install(Authentication){

    }

    install(Routing){
        route("/"){
            get {
                call.respondText("HELLO WORLD!")
            }
        }
    }
}
