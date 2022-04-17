package com.johnturkson.text

import java.util.Base64

fun ByteArray.encodeBase64(encoder: Base64.Encoder = Base64.getEncoder()): String {
    return encoder.encodeToString(this)
}

fun String.decodeBase64(decoder: Base64.Decoder = Base64.getDecoder()): ByteArray {
    return decoder.decode(this)
}
