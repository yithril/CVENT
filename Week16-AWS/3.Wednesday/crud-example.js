//Get and Get by ID
const recipes = [
    { id: 1, instructions: "Mix all ingredients and cook for 20 minutes.", cookingTimeInMinutes: 20, name: "Vegan Pancakes", isVegan: true },
    { id: 2, instructions: "Chop veggies, stir fry for 10 minutes.", cookingTimeInMinutes: 10, name: "Stir Fry Vegetables", isVegan: true },
    { id: 3, instructions: "Boil pasta, add sauce and simmer for 15 minutes.", cookingTimeInMinutes: 15, name: "Pasta Marinara", isVegan: false }
];

export const handler = async (event) => {
    const id = event.pathParameters ? event.pathParameters.id : null;

    if (id) {
        const recipe = recipes.find(recipe => recipe.id == id);
        
        if (!recipe) {
            return {
                statusCode: 404,
                body: JSON.stringify({ error: 'Recipe not found' }),
                headers: {
                    'Content-Type': 'application/json'
                }
            };
        }

        return {
            statusCode: 200,
            body: JSON.stringify(recipe),
            headers: {
                'Content-Type': 'application/json'
            }
        };
    } else {
        return {
            statusCode: 200,
            body: JSON.stringify(recipes),
            headers: {
                'Content-Type': 'application/json'
            }
        };
    }
};

//FOR the state changing verbs, the state wont last from invocation to invocation
//But it's good for practice
//CREATE
let recipes = [
    { id: 1, instructions: "Mix all ingredients and cook for 20 minutes.", cookingTimeInMinutes: 20, name: "Vegan Pancakes", isVegan: true },
    { id: 2, instructions: "Chop veggies, stir fry for 10 minutes.", cookingTimeInMinutes: 10, name: "Stir Fry Vegetables", isVegan: true },
    { id: 3, instructions: "Boil pasta, add sauce and simmer for 15 minutes.", cookingTimeInMinutes: 15, name: "Pasta Marinara", isVegan: false }
];

const generateId = () => {
    return recipes.length > 0 ? Math.max(...recipes.map(r => r.id)) + 1 : 1;
};

export const handler = async (event) => {
    const newRecipe = JSON.parse(event.body);
    newRecipe.id = generateId();
    recipes.push(newRecipe);

    return {
        statusCode: 201,
        body: JSON.stringify(newRecipe),
    };
};

//UPDATE
let recipes = [
    { id: 1, instructions: "Mix all ingredients and cook for 20 minutes.", cookingTimeInMinutes: 20, name: "Vegan Pancakes", isVegan: true },
    { id: 2, instructions: "Chop veggies, stir fry for 10 minutes.", cookingTimeInMinutes: 10, name: "Stir Fry Vegetables", isVegan: true },
    { id: 3, instructions: "Boil pasta, add sauce and simmer for 15 minutes.", cookingTimeInMinutes: 15, name: "Pasta Marinara", isVegan: false }
];

export const handler = async (event) => {
    const id = parseInt(event.pathParameters.id);
    const updatedRecipe = JSON.parse(event.body);
    const index = recipes.findIndex(r => r.id === id);

    if (index === -1) {
        return {
            statusCode: 404,
            body: JSON.stringify({ message: "Recipe not found" }),
        };
    }

    recipes[index] = { id, ...updatedRecipe };

    return {
        statusCode: 200,
        body: JSON.stringify(recipes[index]),
    }
};

//DELETE
let recipes = [
    { id: 1, instructions: "Mix all ingredients and cook for 20 minutes.", cookingTimeInMinutes: 20, name: "Vegan Pancakes", isVegan: true },
    { id: 2, instructions: "Chop veggies, stir fry for 10 minutes.", cookingTimeInMinutes: 10, name: "Stir Fry Vegetables", isVegan: true },
    { id: 3, instructions: "Boil pasta, add sauce and simmer for 15 minutes.", cookingTimeInMinutes: 15, name: "Pasta Marinara", isVegan: false }
];

export const handler = async (event) => {
    const id = parseInt(event.pathParameters.id);
    const index = recipes.findIndex(r => r.id === id);

    if (index === -1) {
        return {
            statusCode: 404,
            body: JSON.stringify({ message: "Recipe not found" }),
        };
    }

    recipes = recipes.filter(r => r.id !== id);

    return {
        statusCode: 204,
        body: null,
    }
};