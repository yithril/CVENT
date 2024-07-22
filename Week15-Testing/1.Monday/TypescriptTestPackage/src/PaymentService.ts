export class PaymentService {
    processPayment(amount: number): boolean {
      // Simulate a call to an external payment processor
      console.log(`Processing payment of $${amount}`);
      return true;
    }
}