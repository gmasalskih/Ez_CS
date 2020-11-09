package ru.gmasalskikh.ezcs.data.pojo

import ru.gmasalskikh.ezcs.data.enums.FirestoreCollections
import ru.gmasalskikh.ezcs.data.enums.RankTypes

data class Wingman(
    val collection: FirestoreCollections = FirestoreCollections.RANKS,
    val contentsPath: String,
    val description: String,
    val id: String,
    val logo: String,
    val name: String,
    val rankType: RankTypes = RankTypes.WINGMAN,
)