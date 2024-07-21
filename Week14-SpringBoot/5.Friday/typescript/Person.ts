export class Person {
    name:string;
    age:number;
    phoneNumber:string = '123-456-7890';

    constructor(name:string, age:number){
        this.name = name;
        this.age = age;
    }

    introduce(){
        console.log(`Hi my name is ${this.name}`);
    }
}