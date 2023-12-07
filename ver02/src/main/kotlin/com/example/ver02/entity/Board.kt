package com.example.ver02.entity

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class Board {
    var bno: Long? = null
    var title: String? = null
    var contents: String? = null

    override fun toString(): String {
        return "Board(bno=$bno, title=$title, contents=$contents)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (bno != other.bno) return false
        if (title != other.title) return false
        return contents == other.contents
    }

    override fun hashCode(): Int {
        var result = bno?.hashCode() ?: 0
        result = 31 * result + (title?.hashCode() ?: 0)
        result = 31 * result + (contents?.hashCode() ?: 0)
        return result
    }
}

