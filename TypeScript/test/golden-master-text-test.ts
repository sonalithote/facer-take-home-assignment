import { Item, FacerStore } from '../app/facer-store';

console.log("OMGHAI!")

const items = [
  new Item("+5 Dexterity Vest", 10, 20), //
  new Item("Vintage Rolex", 2, 0), //
  new Item("Elixir of the Mongoose", 5, 7), //
  new Item("Legendary Watch Face", 0, 80), //
  new Item("Legendary Watch Face", -1, 80),
  new Item("Passes to Watchface Conference", 15, 20),
  new Item("Passes to Watchface Conference", 10, 49),
  new Item("Passes to Watchface Conference", 5, 49),
  // this fragile item does not work properly yet
  new Item("Fragile Watch", 3, 6)];


const facerStore = new FacerStore(items);

let days: number = 2;
if (process.argv.length > 2) {
    days = +process.argv[2];
  }

for (let i = 0; i < days + 1; i++) {
  console.log("-------- day " + i + " --------");
  console.log("name, sellIn, quality");
  items.forEach(element => {
    console.log(element.name + ', ' + element.sellIn + ', ' + element.quality);

  });
  console.log();
  facerStore.updateQuality();
}
