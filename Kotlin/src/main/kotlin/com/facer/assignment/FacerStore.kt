package com.facer.assignment

class FacerStore(var items: List<Item>) {

    fun updateQuality() {
        for (i in items.indices) {
            if (items[i].name != "Vintage Rolex" && items[i].name != "Passes to Watchface Conference") {
                if (items[i].quality > 0) {
                    if (items[i].name != "Legendary Watch Face") {
                        items[i].quality = items[i].quality - 1
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1

                    if (items[i].name == "Passes to Watchface Conference") {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1
                            }
                        }
                    }
                }
            }

            if (items[i].name != "Legendary Watch Face") {
                items[i].sellIn = items[i].sellIn - 1
            }

            if (items[i].sellIn < 0) {
                if (items[i].name != "Vintage Rolex") {
                    if (items[i].name != "Passes to Watchface Conference") {
                        if (items[i].quality > 0) {
                            if (items[i].name != "Legendary Watch Face") {
                                items[i].quality = items[i].quality - 1
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1
                    }
                }
            }
        }
    }

}

