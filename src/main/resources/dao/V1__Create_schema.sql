CREATE SCHEMA daoRestaurant;

CREATE SEQUENCE daoRestaurant.chef_seq;

CREATE TABLE daoRestaurant.chef (
  id INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE SEQUENCE daoRestaurant.critic_seq;

CREATE TABLE daoRestaurant.critic (
  id INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE SEQUENCE daoRestaurant.restaurant_seq;

CREATE TABLE daoRestaurant.restaurant (
  id INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  chef_id INTEGER NOT NULL,
  FOREIGN KEY (chef_id) REFERENCES unit8schema.author(id)
);
