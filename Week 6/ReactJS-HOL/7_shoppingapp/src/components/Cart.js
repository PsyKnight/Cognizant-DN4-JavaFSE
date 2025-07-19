import { Component } from "react";

class Cart extends Component {
  render() {
    return (
      <table>
        <tbody>
          {this.props.items.map((item, idx) => (
            <tr key={`${idx}-${item.itemName}`}>
              <td>{item.itemName}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }
}

export default Cart;
