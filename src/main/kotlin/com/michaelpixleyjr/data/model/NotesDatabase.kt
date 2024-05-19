package com.michaelpixleyjr.data.model

import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

class NotesDatabase : NoteDataAccessObject {

    private val client = KMongo.createClient().coroutine
    private val database = client.getDatabase("NoteDatabase")
    private val users = database.getCollection<User>()
    private val notes = database.getCollection<Note>()
}