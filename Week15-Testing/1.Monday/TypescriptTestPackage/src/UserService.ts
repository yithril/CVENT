export interface User {
    id:number,
    name:string,
    email:string
}

export class UserService {
    async getUser(id:number) : Promise<User> {
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                if(id === 1){
                    resolve({id: 1, name: 'Bob', email: 'bob@bob.com'});
                }
                else{
                    reject(new Error('User not found'));
                }
            }, 1000);
        });
    }
}