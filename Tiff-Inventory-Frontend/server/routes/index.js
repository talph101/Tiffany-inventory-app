const express = require("express")
const router = express.Router()

//added middleware
router.use(express.json())
router.use(express.urlencoded({ extended: true }))
// different model routers
router.use("/items", require("./items"))
router.use("/users", require("./users"))

module.exports = router
