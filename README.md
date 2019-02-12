# Spanly
A fast and simplified spannable string builder.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.3.21-green.svg)](http://kotlinlang.org)
[![Build Status](https://travis-ci.com/joshuadeguzman/Spanly.svg?branch=master)](https://travis-ci.com/joshuadeguzman/Spanly)
[![GitHub (pre-)release](https://img.shields.io/github/release/joshuadeguzman/spanly/all.svg?style=flat-square)
](./../../releases)

### TODO's

- On-going development for `Spans` object

### Features

- Fast
- Simplified Spannable APIs
- Lightweight

### Demo

Beautifully designed typography posters made with Spanly!

![design-one](https://github.com/joshuadeguzman/Spanly/blob/master/screenshots/design_1.png)
![design-two](https://github.com/joshuadeguzman/Spanly/blob/master/screenshots/design_2.png)

### Spans

| Spanly Spans                                                                |
|-----------------------------------------------------------------------------|
| bold()                                                                      |
| italic()                                                                    |
| underline()                                                                 |
| strike()                                                                    |
| sup()                                                                       |
| sub()                                                                       |
| background(color: Int)                                                      |
| color(color: Int)                                                           |
| size(size: Float)                                                           |
| font(typeface: Typeface)                                                    |
| clickable(listener: View.OnClickListener, isUnderlineText: Boolean = false) |

### Usage

```kotlin
// MainActivity.kt
// Design 1

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Render sample font
    val fontAvenirBold = Typeface.createFromAsset(assets, "fonts/avenir_bold.ttc")
    val fontBrillianteRegular = Typeface.createFromAsset(assets, "fonts/brilliante_regular.ttf")

    // Sample usage
    tvMessage.text =
        Spanly()
            .append(
                "TALK",
                font(fontAvenirBold),
                size(1.5f),
                italic(),
                clickable(View.OnClickListener {
                    startActivity(Intent(this, SubActivity::class.java))
                    finish()
                }),
                color(ContextCompat.getColor(this, R.color.colorOrange))
            )
            .space()
            .append("IS", font(fontAvenirBold), color(Color.WHITE), underline(), size(1.5f))
            .next()
            .append(
                "Cheap",
                font(fontBrillianteRegular),
                size(5f),
                clickable(View.OnClickListener {
                    startActivity(Intent(this, SubActivity::class.java))
                    finish()
                }),
                color(ContextCompat.getColor(this, R.color.colorBlueLight))
            )

    // Important for the click to work
    // More on https://developer.android.com/reference/android/text/method/LinkMovementMethod
    tvMessage.movementMethod = LinkMovementMethod.getInstance()
}

```

### Installation

```gradle
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    // Replace version with release version, e.g. 1.0.0-alpha, -SNAPSHOT
    implementation 'io.jmdg:spanly:[VERSION]'
}
```

### License

Spanly is released under the MIT License. See [LICENSE](https://github.com/joshuadeguzman/Spanly/blob/master/LICENSE) for details.

### Contributing

1. Fork it (<https://github.com/joshuadeguzman/Spanly/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request
