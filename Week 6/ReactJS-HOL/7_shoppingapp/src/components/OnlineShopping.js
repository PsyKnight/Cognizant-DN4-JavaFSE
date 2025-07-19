import { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
  render() {
    const CartInfo = [
      { itemName: "Laptop", price: 80_000 },
      { itemName: "TV", price: 1_20_000 },
      { itemName: "Washing Machine", price: 30_000 },
      { itemName: "Fridge", price: 70_000 },
    ];
    return (
      <div className="mydiv">
        <h1>Items Ordered: </h1>
        <Cart items={CartInfo} />
      </div>
    );
  }
}

export default OnlineShopping;
