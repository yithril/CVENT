import { PaymentService } from "../src/PaymentService";
import { ShoppingCart, Item } from "../src/ShoppingCart";

jest.mock('../src/PaymentService');

describe('Shopping Cart Tests', () => {
    let cart:ShoppingCart;
    let paymentService: jest.Mocked<PaymentService>;

    beforeEach(() => {
        paymentService = new PaymentService() as jest.Mocked<PaymentService>;
        cart = new ShoppingCart(paymentService);
    });

    it('should add an item to the cart', () => {
        paymentService.processPayment.mockReturnValue(true);
        const item: Item = { id: 1, name: 'Laptop', price: 1000, quantity: 1 };
        cart.addItem(item);
        expect(cart.getItems()).toContainEqual(item);
      });
});