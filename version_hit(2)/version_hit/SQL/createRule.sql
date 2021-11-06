drop database if  exists db6;
create database db6;


use db6;
CREATE TABLE if not exists `rules`(
    `id`          int unsigned NOT NULL AUTO_INCREMENT,
    `aid` int,
    `platform` varchar(255),
    `download_url` varchar(255) not null,
    `update_version_code` varchar(255) not null,
    `md5` varchar(255),
#     `device_id_list` varchar(255) not null,
    `min_version` varchar(255),
    `max_version` varchar(255),
    `max_os_api` int,
    `min_os_api` int,
    `cpu_arch` int,
    `channel` varchar(255),
    `title` varchar(255),
    `update_tips` varchar(255),
    PRIMARY KEY (`id`)

);


CREATE table IF NOT EXISTS `device_id_list`(
    `id` int unsigned NOT NULL AUTO_INCREMENT,
    `device_id` varchar(255) not null ,
    `hit_times` int  default 0,
    PRIMARY KEY (`id`)

);

# ALTER TABLE device_id_list ADD INDEX index_name(device_id(5));

