// src/ShoppingCart.ts

export interface Item {
    id: number;
    name: string;
    price: number;
    quantity: number;
}
  
  export class ShoppingCart {
    private items: Item[] = [];
  
    addItem(item: Item): void {
      const existingItem = this.items.find(i => i.id === item.id);
      if (existingItem) {
        existingItem.quantity += item.quantity;
      } else {
        this.items.push(item);
      }
    }
  
    removeItem(itemId: number): void {
      this.items = this.items.filter(item => item.id !== itemId);
    }
  
    updateItemQuantity(itemId: number, quantity: number): void {
      const item = this.items.find(i => i.id === itemId);
      if (item) {
        item.quantity = quantity;
        if (item.quantity <= 0) {
          this.removeItem(itemId);
        }
      }
    }
  
    getTotal(): number {
      return this.items.reduce((total, item) => total + item.price * item.quantity, 0);
    }
  
    applyDiscount(discount: number): number {
      if (discount < 0 || discount > 100) {
        throw new Error('Invalid discount value');
      }
      const total = this.getTotal();
      return total - (total * (discount / 100));
    }
  
    getItems(): Item[] {
      return this.items;
    }
  }
  