package com.github.aliakseikaraliou.masterapp.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.github.aliakseikaraliou.masterapp.db.entity.ClientEntity

@Dao
interface ClientDao {
    @Query("SELECT * FROM client")
    fun getAll(): List<ClientEntity>

    @Insert
    fun insert(client: ClientEntity)

    @Delete
    fun delete(client: ClientEntity)
}