package com.haydar.mynoteapps.database

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Entity
@Parcelize
data class Note (
 @PrimaryKey(autoGenerate = true)

 @ColumnInfo(name = "id")
 var id: Int? = null,

 @ColumnInfo(name = "date")
 var date: String? = null,

 @ColumnInfo(name = "description")
 var description : String? = null,

 @ColumnInfo(name = "title")
 var title : String? = null
) : Parcelable