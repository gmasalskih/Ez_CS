package ru.gmasalskikh.ezcs.data.pojo

import ru.gmasalskikh.ezcs.data.enums.FirestoreCollections

data class MapHolder(
    val collection: FirestoreCollections = FirestoreCollections.MAPS,
    val contentsPath: String,
    val id: String,
    @field:JvmField
    val isCompetitive: Boolean = true,
    val logo: String,
    val map: String,
    val name: String,
    val wallpaper: String,
)