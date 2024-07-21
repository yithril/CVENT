//variables
//string, number, boolean, null, undefined, bigint, symbol

let myName:string = "Jonathan";
let isPremiumMember:boolean = false;
let stadiumPeople:number = 100;

let thisIsAString = "This is a string";

let thisCouldBeWhatever:any = "This is anything";
thisCouldBeWhatever = false;
thisCouldBeWhatever = 50;

//what if something is either one of two types
//union types
let stringOrNumber:(string | number) = 50;
stringOrNumber = "String";
//stringOrNumber = false;

function addTwoNumbers(a:number, b:number) : number {
    return a + b;
}

function sayHello(message:string) : void {
    console.log(message);
}

const sayMessage = (message:string) : void => console.log(message);

interface Car {
    make:string,
    model:string,
    year:number
}

let car:Car = {
    model: 'Charger',
    make: 'Dodge',
    year: 2020
}

let dealership:Car[] = [
    { make: 'Ford', model: 'F150', year: 2010 }
];

console.log('NPX is running');