package Service

import (
	"github.com/gin-gonic/gin"
)

func Pong(c *gin.Context) {
	c.JSON(200, gin.H{"message": "pong"})

}

func Hit(c *gin.Context) {
	//TODO 客户端反馈的参数可以通过c.Query获得，所有的规则存储在本地数据库mysql中，要做的是查询客户端是否命中了规则库中的某条规则
	//TODO	如果命中了就通过c.JSON返回需要返回的参数（比如downloda_url等）
	//TODO  https://gorm.io/zh_CN/docs/   数据库相关操作可以看这篇文档，gin框架可以看字节训练营第一节课的视频
	//var respUrl string
	//appVersion := c.Query("appVersion")
	//userDID := c.Query("userDID")
	//rules := model.GetAllRules()
	//for index := 0; index < len(*rules); index++ {
	//	if cast.ToInt(userDID) < (*rules)[index].MinUserDID || cast.ToInt(userDID) > (*rules)[index].MaxUserDID {
	//		continue
	//	}
	//	if cast.ToInt(appVersion) < (*rules)[index].MinVersion || cast.ToInt(appVersion) > (*rules)[index].MaxVersion {
	//		continue
	//	}
	//	respUrl = (*rules)[index].GrayLink
	//	break
	//}
	//c.JSON(200, gin.H{"downloadURL": respUrl})

}
