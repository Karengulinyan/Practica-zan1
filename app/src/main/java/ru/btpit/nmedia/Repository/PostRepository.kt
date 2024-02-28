package ru.btpit.nmedia.Repository

import androidx.lifecycle.LiveData
import ru.btpit.nmedia.MainActivity
import ru.btpit.nmedia.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun shareById(id: Long)

}