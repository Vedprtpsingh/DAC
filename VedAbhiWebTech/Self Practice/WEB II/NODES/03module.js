

module.exports = function (){
    console.log("This is a test function");
}


module.exports = (function (){
    const cart = [];

    function addToCart(item){
        cart.push(item);
    }

    function billAmount(){
        let bill =0.0;
        for(const item of cart){
            bill += item.price;
        }
        return bill;
    }

    function getAll(){
        return cart;
    }
    return{
        addToCart,
        billAmount,
        getAll
    }
})();
