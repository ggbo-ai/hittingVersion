package main

import "github.com/gin-gonic/gin"

func main() {
	r := gin.Default()
	router1(r)
	r.Run()

}
