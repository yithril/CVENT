interface UserProfile {
    id:number;
    name:string;
    age:number;
    email:string;
    address:string;
}

type CreateUserProfile = Partial<UserProfile>;

let profile:CreateUserProfile = {
    name: 'Bob',
    age: 32,
    email: 'Bob@bob.com',
    address: '123 Broadway'
}

type NewUserProfile = Omit<UserProfile, 'id'>;

let profile2:NewUserProfile = {
    name: 'Bob',
    age: 32,
    email: 'Bob@bob.com',
    address: '123 Broadway'
}

type ContactInfo = Pick<UserProfile, 'email' | 'address'>;

const contact:ContactInfo = {
    email: 'test@test.com',
    address: '123 Main St.',
}

type readOnlyProfile = Readonly<UserProfile>;

interface Name {
    name:string
}

interface Age {
    age: number;
}

type Person = Name & Age;

const person:Person = {
    name: 'Joe',
    age: 30
}