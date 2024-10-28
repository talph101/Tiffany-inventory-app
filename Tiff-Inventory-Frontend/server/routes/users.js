const express = require("express")
const userRouter = express.Router()
const { User } = require("../models/index")




userRouter.get("/", async (req, res, next) => {
	try {
		const users = await User.findAll()
		res.send(users)
	} catch (error) {
		next(error)
	}
})

//GET one item
userRouter.get("/:id", async (req, res) => {
    try{
        const oneUser = await User.findByPk(req.params.id)
        res.json(oneUser);
    } catch (error) {
        console.error
        next(error)
    }
})

//Create item to inventory
userRouter.post('/', async (req, res, next) => {
	try {
		const users = await User.create(req.body);
		res.send(users);
	} catch (error) {
		next(error);
	}
});

//delete/an Item from the inventory
userRouter.delete("/:id", async (req, res, next) => {
  try {
    const userId = req.params.id;
    const findUser = await User.findByPk(userId);
    await findUser.destroy();
    const allUsers = await User.findAll();
    res.json(allUsers);
  } catch (error) {
    console.error(error);
    next(error);
  }
});

module.exports = userRouter;

