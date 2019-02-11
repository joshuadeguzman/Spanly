package io.jmdg.spanly

import android.graphics.Typeface
import android.text.style.*
import io.jmdg.spanly.internal.spans.FontSpan

/**
 * Created by Joshua de Guzman on 2/11/19.
 */

fun bold() = StyleSpan(Typeface.BOLD)
fun italic() = StyleSpan(Typeface.ITALIC)
fun underline() = UnderlineSpan()
fun strike() = StrikethroughSpan()
fun sup() = SuperscriptSpan()
fun sub() = SubscriptSpan()
fun background(color: Int) = BackgroundColorSpan(color)
fun color(color: Int) = ForegroundColorSpan(color)
fun size(size: Float) = RelativeSizeSpan(size)
fun font(typeface: Typeface) = FontSpan(typeface)
