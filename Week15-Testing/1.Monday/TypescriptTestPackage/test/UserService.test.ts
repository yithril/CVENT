import { UserService } from "../src/UserService";

describe('User Service tests', () => {
    let userService:UserService;

    beforeEach(() => {
        userService = new UserService();
    });

    it('should return user for valid id', async () => {
        const result = await userService.getUser(1);

        expect(result).toEqual({
            id: 1,
            name: 'Bob',
            email: 'bob@bob.com'
        });

        // expect(result).resolves.toEqual({
        //          id: 1,
        //          name: 'Bob',
        //          email: 'bob@bob.com'
        //      });
    });

    it('User not found throws error', async () => {
        expect(userService.getUser(2)).rejects.toThrow('User not found');
    });
});