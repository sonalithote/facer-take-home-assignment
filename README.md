## Facer Technical Assignment - Introduction

For this technical assignment, your free to choose to execute it in any language we have provided. Currently it's either Kotlin or Typescript. If you're applying for a front-end position, we encourage you to pick Typescript, if you're applying for an Android position we encourage you to choose Kotlin.

Each language contains a readme file with some context on how to run the program provided.

Feel free to fork this repository for your solution. Below you'll find the requirements for the exercise. 


## Facer Store Requirements

Imagine we are a small watch shop in the mountains of Switzerland. We have a nice shop in one of the valleys, and we sell all kinds of products. Unfortunately the climate isn't well suited for keeping watches in a great condition though. Due to this, our watches degrade in quality every day we don't sell them.

A nice local fellow by the name of Gunther wrote a system for us that allows us to track our inventory. Each item in our inventory has a sell by date, and a quality value. As each day passes, and the sell by date gets closer, the quality of our watches degrade. Here are some specifics:

All items have a SellIn value which denotes the number of days we have to sell the items

All items have a Quality value which denotes how valuable the item is

At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:


Once the sell by date has passed, Quality degrades twice as fast

The Quality of an item is never negative

"Vintage Rolex" actually increases in Quality the older it gets

The Quality of an item is never more than 50

"Legendary Watch Face", being a legendary item, never has to be sold or decreases in Quality

"Passes to Watchface Conference", like the vintage rolex, increases in Quality as its SellIn value approaches;

Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but

Quality drops to 0 after the conference

We have recently signed a supplier of fragile items. This requires an update to our system:


"Fragile" items degrade in Quality twice as fast as normal items
Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover for you).

Just for clarification, an item can never have its Quality increase above 50, however "Legendary Watch Face" is a legendary item and as such its Quality is 80 and it never alters.