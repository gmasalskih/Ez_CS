package ru.gmasalskikh.ezcs.data.pojo

import ru.gmasalskikh.ezcs.data.enums.FirestoreCollections
import ru.gmasalskikh.ezcs.data.enums.GrenadeTypes
import ru.gmasalskikh.ezcs.data.enums.TickRate

data class MapPoint(
    val collection: FirestoreCollections = FirestoreCollections.MAP_POINTS,
    val contentImages: List<String>,
    val contentVideos: List<String>,
    val contentsPath: String,
    val grenadeType: GrenadeTypes,
    val id: String,
    val mapId: String,
    val name: String,
    val previewEndImg: String,
    val previewStartImg: String,
    val tickRate: List<TickRate>,
)