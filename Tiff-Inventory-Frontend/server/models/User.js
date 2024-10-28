const { Model, DataTypes } = require("sequelize");
const { sequelize } = require("../db");

class User extends Model {}

User.init(
  {
    name: DataTypes.STRING,
    lastName: DataTypes.STRING,
    email: DataTypes.STRING,
    location: DataTypes.STRING,
  },
  {
    sequelize,
    modelName: "User",
  }
);

module.exports = { User };
