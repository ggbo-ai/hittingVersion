package main

import (
	"Goland/Service"
	"Goland/model"
	"github.com/gin-gonic/gin"
	_ "golang.org/x/sys/windows/svc"
)

func router1(r *gin.Engine) {
	//r.GET("/ping", Service.Pong)
	r.GET("/judge", Service.Hit)
	r.GET("/save", model.SaveRule)
}
