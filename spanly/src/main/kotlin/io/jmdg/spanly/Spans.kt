package io.jmdg.spanly

import android.graphics.Typeface
import android.text.style.*

/**
 * Created by Joshua de Guzman on 2/11/19.
 */

fun bold() = StyleSpan(Typeface.BOLD)
fun italic() = StyleSpan(Typeface.ITALIC)
fun underline() = UnderlineSpan()
fun strike() = StrikethroughSpan()
fun sup() = SuperscriptSpan()
fun sub() = SubscriptSpan()
