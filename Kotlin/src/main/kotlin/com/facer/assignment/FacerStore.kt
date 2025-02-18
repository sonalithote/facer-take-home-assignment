package com.facer.assignment

/**
* Manages the in store items and updates their quality and sellIn values
* @param items the list of items in the store
*/
class FacerStore(var items: List<Item>) {

    companion object {
        private const val MAX_QUALITY = 50
        private const val MIN_QUALITY = 0
        private const val LEGENDARY_QUALITY = 80
    }

    /**
    * Updates the quality and sellIn values of the items in the store
    * - Vintage Rolex: increases in quality as it gets older
    * - Passes to Watchface Conference: increases in quality as the event approaches
    * - Fragile Watch: decreases in quality twice as fast as normal items
    * - Default item: decreases in quality as it gets older
    */
    fun updateQuality() {
        for (item in items) {
            when (item.name) {
                "Legendary Watch Face" -> {
                    // do nothing
                }
                "Vintage Rolex" -> updateVintageRolex(item)
                "Passes to Watchface Conference" -> updatePassesToWatchfaceConference(item)
                "Fragile Watch" -> updateFragileWatch(item)
                else -> updateDefaultItem(item)
            }
            if (item.name != "Legendary Watch Face") {
                item.sellIn--
            }
        }
    }

    private fun updateVintageRolex(item: Item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++
            if (item.sellIn <= 0 && item.quality < MAX_QUALITY) {
                item.quality++
            }
        }
    }

    private fun updatePassesToWatchfaceConference(item: Item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++
            if (item.sellIn <= 10 && item.quality < MAX_QUALITY) {
                item.quality++
            }
            if (item.sellIn <= 5 && item.quality < MAX_QUALITY) {
                item.quality++
            }
        }
        if (item.sellIn <= 0) {
            item.quality = MIN_QUALITY
        }
    }

    /** 
    * Fragile Watch: decreases in quality twice as fast as normal items
    * - check if quality is greater than 0
    * - decrease quality by 2
    * - if sellIn is less than or equal to 0, decrease quality by 2
    * - set quality to 0 if it is less than 0
     */
    private fun updateFragileWatch(item: Item) {
        if (item.quality > 0) {
            item.quality -= 2
            if (item.sellIn <= 0) {
                item.quality -= 2
            }
        }
        item.quality = Math.max(MIN_QUALITY, item.quality)
    }

    private fun updateDefaultItem(item: Item) {
        if (item.quality > 0) {
            item.quality--
            if (item.sellIn <= 0) {
                item.quality--
            }
        }
    }
}



