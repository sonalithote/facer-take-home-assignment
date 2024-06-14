package com.facer.assignment

fun main(args: Array<String>) {

    val items = listOf(
            Item("Seiko Watch", 10, 20), //
            Item("Vintage Rolex", 2, 0), //
            Item("Casio Watch", 5, 7), //
            Item("Legendary Watch Face", 0, 80), //
            Item("Legendary Watch Face", -1, 80),
            Item("Passes to Watchface Conference", 15, 20),
            Item("Passes to Watchface Conference", 10, 49),
            Item("Passes to Watchface Conference", 5, 49),
            // this conjured item does not work properly yet
            Item("Fragile Watch", 3, 6)
    )

    val app = FacerStore(items)

    var days = 2
    if (args.size > 0) {
        days = Integer.parseInt(args[0]) + 1
    }

    for (i in 0..days - 1) {
        println("-------- day $i --------")
        println("name, sellIn, quality")
        for (item in items) {
            println(item)
        }
        println()
        app.updateQuality()
    }
}
