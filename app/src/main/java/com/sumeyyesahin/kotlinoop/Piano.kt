package com.sumeyyesahin.kotlinoop

class Piano : HouseDecor, Instrument {

    override var roomName: String
        get() = "living room"
        set(value) {}

    var brand : String? = null
    var digital : Boolean? = null
}








