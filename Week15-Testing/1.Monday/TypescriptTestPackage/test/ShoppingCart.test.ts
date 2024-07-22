import { PaymentService } from "../src/PaymentService";
import { ShoppingCart, Item } from "../src/ShoppingCart";

jest.mock('./src/PaymentService');

describe('Shopping Cart Tests', () => {
    let cart:ShoppingCart;
    let paymentService: jest.Mocked<PaymentService>;

    beforeEach(() => {
        //paymentService.processPayment.mockReturnValue(false);
        cart = new ShoppingCart(paymentService);
    });
});