//Arrange Act Assert

import { Calculator } from '../src/Calculator';

describe('Calculator Tests', () => {
    let calculator:Calculator;

    beforeEach(() => {
        calculator = new Calculator();
    });

    it('Add two numbers get correct sum', () => {
        let calculator = new Calculator();

        let result = calculator.add(1,2);

        //matchers
        expect(result).toBe(3);
    });

    //parameterized tests
    it.each([ 
        [1, 2, 3],
        [2, 5, 7],
        [10, 12, 22]
    ])('Adding %i and %i gives sum of %i', (a:number, b:number, c:number) => {
        expect(calculator.add(a, b)).toBe(c);
    });
});