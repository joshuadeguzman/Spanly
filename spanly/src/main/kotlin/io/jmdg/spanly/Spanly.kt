package io.jmdg.spanly

import android.text.SpannableStringBuilder
import io.jmdg.spanly.internal.helpers.span

/**
 * Created by Joshua de Guzman on 2/11/19.
 */

class Spanly : SpannableStringBuilder() {

    companion object {
        val TAG = Spanly::class.java.simpleName
    }

    override fun append(text: CharSequence): Spanly {
        super.append(text)
        return this
    }

    fun append(text: CharSequence, vararg spans: Any): Spanly {
        var _text = text
        spans.forEach { span ->
            _text = span(_text, span)
        }
        super.append(_text)
        return this
    }

    fun space() : Spanly {
        super.append(" ")
        return this
    }

    fun next() : Spanly {
        super.append("\n")
        return this
    }
}