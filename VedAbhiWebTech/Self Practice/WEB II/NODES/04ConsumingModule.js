

const shoppingcart = require('./03module');


shoppingcart.addToCart({name:"Apple", price: 100});


shoppingcart.addToCart({name:"Banana", price: 50});


const bill = shoppingcart.billAmount();
console.log(`The total bill amount is ${bill}`);


const items = shoppingcart.getAll();
console.log("The items in the cart are: ", items);