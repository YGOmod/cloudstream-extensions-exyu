// use an integer for version numbers
version = 1


cloudstream {
    language = "ba"
    // All of these properties are optional, you can safely remove them

    // description = "Lorem Ipsum"
     authors = listOf("YGOMod")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 3 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://turskeserije.tv/wp-content/themes/turskeserije/assets/css/img/favicon.png"
}
