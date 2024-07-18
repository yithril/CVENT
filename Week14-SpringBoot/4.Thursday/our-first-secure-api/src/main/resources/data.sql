CREATE TABLE IF NOT EXISTS recipe (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    instructions TEXT,
    cooking_time_in_minutes INT NOT NULL,
    is_vegan BOOLEAN,
    is_nut_free BOOLEAN,
    is_gluten_free BOOLEAN,
    created_date TIMESTAMP,
    last_modified_date TIMESTAMP,
    created_by VARCHAR(255),
    last_modified_by VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS app_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    roles VARCHAR(255),
    created_date TIMESTAMP,
    last_modified_date TIMESTAMP
);

INSERT INTO app_user (username, password, roles, created_date, last_modified_date)
VALUES ('admin', 'password', 'ROLE_ADMIN', NOW(), NOW());

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Vegan Pancakes', 'Mix all ingredients and cook on a skillet.', 15, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Nut-Free Cookies', 'Bake in the oven at 350 degrees for 12 minutes.', 12, false, true, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Gluten-Free Bread', 'Mix ingredients and bake for 30 minutes.', 30, false, false, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Tomato Soup', 'Simmer tomatoes with onions and blend.', 20, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Chicken Stir Fry', 'Stir fry chicken with vegetables.', 25, false, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Beef Tacos', 'Cook beef and serve in tacos.', 15, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Quinoa Salad', 'Mix quinoa with vegetables and dressing.', 10, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Spaghetti Bolognese', 'Cook spaghetti and bolognese sauce.', 30, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Vegan Burger', 'Grill vegan patties and assemble burgers.', 20, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Chicken Curry', 'Cook chicken with curry sauce.', 40, false, true, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Lentil Soup', 'Cook lentils with vegetables.', 35, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Pancakes', 'Mix ingredients and cook on a skillet.', 10, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Vegetable Stir Fry', 'Stir fry mixed vegetables.', 15, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Chocolate Cake', 'Bake chocolate cake in the oven.', 45, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Vegan Brownies', 'Bake vegan brownies in the oven.', 25, true, true, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Mushroom Risotto', 'Cook rice with mushrooms and broth.', 30, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Grilled Cheese Sandwich', 'Grill bread with cheese in between.', 10, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Fish Tacos', 'Cook fish and serve in tacos.', 20, false, false, false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Greek Salad', 'Mix vegetables with feta and olives.', 10, false, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO recipe (name, instructions, cooking_time_in_minutes, is_vegan, is_nut_free, is_gluten_free, created_date, last_modified_date, created_by, last_modified_by)
VALUES ('Vegan Chili', 'Cook beans with vegetables and spices.', 40, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');
