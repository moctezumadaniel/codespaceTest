const express = require("express");
const app = express();

app.get("/", (req, res) => {
    
    res.json({
        res: "hello root"
    })
})

app.listen(3000, ()=> {
    console.log("listening")
})