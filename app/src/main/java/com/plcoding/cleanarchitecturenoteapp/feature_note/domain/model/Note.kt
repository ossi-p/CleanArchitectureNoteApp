package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.BabyBlue
import com.plcoding.cleanarchitecturenoteapp.ui.LightGreen
import com.plcoding.cleanarchitecturenoteapp.ui.RedOrange
import com.plcoding.cleanarchitecturenoteapp.ui.RedPink
import com.plcoding.cleanarchitecturenoteapp.ui.Violet

@Entity
data class Note(
  val title: String,
  val content: String,
  val timestamp: Long,
  val color: Int,
  @PrimaryKey val id: Int? = null
) {
  companion object {
    val noteColors = listOf(
      RedOrange,
      LightGreen,
      Violet,
      BabyBlue,
      RedPink
    )
  }
}

class InvalidNoteException(message: String): Exception(message)
