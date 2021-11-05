package model

import (
	"github.com/gin-gonic/gin"
	"github.com/spf13/cast"
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

type Rule struct {
	gorm.Model
	//aid                 int
	Platform            string `gorm:"type:varchar(256);not null;"`
	Download_url        string
	Update_version_code string
	Md5                 string
	Device_id_list      string
	MinVersion          int
	MaxVersion          int
	Max_os_api          int
	Min_os_api          int
	Cpu_arch            string
	Channel             string
	Title               string
	Update_tips         string
}

//一条用例
//127.0.0.1:8080/save?platform=android&download_url=www.baidu.com&update_version_code=1.0.0&md5=1&device_id_list=a,b,c,d&minVersion=0&maxVersion=10&max_os_api=10&min_os_api=0&cpu_arch=s&channel=huawei&title=n&update_tips=no
func SaveRule(c *gin.Context) {
	dsn := "root:root@(127.0.0.1:3306)/db5?charset=utf8mb4&parseTime=True&loc=Local"
	db, err := gorm.Open(mysql.Open(dsn), &gorm.Config{})
	if err != nil {
		panic("failed to connect database")
	}
	platform := c.Query("platform")
	download_url := c.Query("download_url")
	update_version_code := c.Query("update_version_code")
	md5 := c.Query("Md5")
	device_id_list := c.Query("device_id_list")
	minVersion := c.Query("minVersion")
	maxVersion := c.Query("maxVersion")
	max_os_api := c.Query("max_os_api")
	min_os_api := c.Query("min_os_api")
	cpu_arch := c.Query("cpu_arch")
	channel := c.Query("channel")
	title := c.Query("title")
	update_tips := c.Query("update_tips")

	// 迁移 schema
	db.AutoMigrate(&Rule{})

	// Create
	one_rule := Rule{
		//aid:                 1,
		Platform:            platform,
		Download_url:        download_url,
		Update_version_code: update_version_code,
		Md5:                 md5,
		Device_id_list:      device_id_list,
		MinVersion:          cast.ToInt(minVersion),
		MaxVersion:          cast.ToInt(maxVersion),
		Max_os_api:          cast.ToInt(max_os_api),
		Min_os_api:          cast.ToInt(min_os_api),
		Cpu_arch:            cpu_arch,
		Channel:             channel,
		Title:               title,
		Update_tips:         update_tips}

	db.Create(&one_rule)
	c.JSON(200, gin.H{"message": "Successful saving!"})
	//// Read
	//var rule Rule
	//db.First(&rule, 1)                     // 根据整形主键查找
	//db.First(&rule, "Platform = ?", "ios") // 查找 code 字段值为 D42 的记录
	//
	//// Update - 将 product 的 price 更新为 200
	//db.Model(&rule).Update("Platform", "android")
}
