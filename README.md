# Spanly
A fast and simplified spannable string builder.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.3.21-green.svg?style=flat-square)](http://kotlinlang.org)
[![Spanly](https://img.shields.io/badge/Support-28.0.0-6ab344.svg?style=flat-square)](https://github.com/ReactiveX/RxJava/releases/tag/v2.1.10)
[![Build Status](https://img.shields.io/travis/joshuadeguzman/Spanly.svg?style=flat-square)](https://travis-ci.com/joshuadeguzman/Spanly)
[![GitHub (pre-)release](https://img.shields.io/github/release/joshuadeguzman/spanly/all.svg?style=flat-square)
](./../../releases)

### TODO's

- On-going development for `Spans` object

### Features

- Simple
- Fast
- Lightweight

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

### Usage

```kotlin
// MainActivity.kt

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Sample usage
    tvHelloWorld.text =
         Spanly()
             .append("The", italic())
             .append(" ")
             .append("Quick Brown", bold())
             .append(" ")
             .append("Fox", italic(), background(Color.YELLOW))
             .append(" ")
             .append("Jumps", bold(), strike(), sup(), italic())
             .append(" ")
             .append("Over", strike(), size(2f), bold())
             .append(" ")
             .append("The", strike(), underline())
             .append(" ")
             .append("Lazy", sup(), color(Color.BLUE))
             .append(" ")
             .append("Dog", underline())
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
