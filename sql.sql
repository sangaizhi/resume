## 用户
CREATE TABLE  t_user (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL COMMENT '姓名',
  nick_name VARCHAR(25) DEFAULT '' COMMENT '昵称',
  phone VARCHAR(25) UNIQUE NOT NULL COMMENT '电话',
  email VARCHAR(100) UNIQUE  COMMENT '邮箱',
  sex SMALLINT  COMMENT '性别',
  head_img VARCHAR(255) COMMENT '头像',
	password varchar(255) NOT NULL COMMENT '密码',
	salt varchar(128) NOT NULL COMMENT '密码盐',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 个人信息表
CREATE TABLE t_person(
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(25) NOT NULL COMMENT '姓名',
  nick_name VARCHAR(25) DEFAULT '' COMMENT '昵称',
  phone VARCHAR(25) NOT NULL COMMENT '电话',
  email VARCHAR(100) NOT NULL COMMENT '邮箱',
  address VARCHAR(150) COMMENT '联系地址',
  native_addr VARCHAR(150) COMMENT '籍贯',
  sex SMALLINT NOT NULL COMMENT '性别',
  head_img VARCHAR(255) COMMENT '头像',
  image_1 VARCHAR(255) COMMENT '图片1',
  image_2 VARCHAR(255) COMMENT '图片2',
  image_3 VARCHAR(255) COMMENT '图片3',
  web_site VARCHAR(255) COMMENT '个人主页',
  weibo_addr VARCHAR(255) COMMENT '微博地址',
  blog_addr VARCHAR(255) COMMENT '博客地址',
  create_time DATETIME  COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 技能
CREATE TABLE t_skill (
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  name VARCHAR(50) NOT NULL COMMENT '名称',
  proficiency VARCHAR(50) NOT NULL COMMENT '熟练程度',
  description VARCHAR(255) NOT NULL COMMENT '描述',
  person_id BIGINT NOT NULL COMMENT '所属个人',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 经验
CREATE TABLE t_experience(
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  start_time DATETIME NOT NULL  COMMENT '开始时间',
  end_time VARCHAR(50) NOT NULL COMMENT '结束时间',
  company VARCHAR(100) NOT NULL  COMMENT '公司名称',
  position VARCHAR(50) NOT NULL COMMENT '职位',
  description VARCHAR(255) NOT NULL COMMENT '工作描述',
  person_id BIGINT NOT NULL COMMENT '所属个人',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 项目
CREATE TABLE t_project(
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  start_time DATETIME NOT NULL  COMMENT '开始时间',
  end_time DATETIME NOT NULL COMMENT '结束时间',
  name  VARCHAR(255) NOT NULL COMMENT '项目名称',
  descripttion VARCHAR(255) NOT NULL  COMMENT '项目描述',
  responsibility VARCHAR(255) NOT NULL COMMENT '责任描述',
  company VARCHAR(100) NOT NULL COMMENT '所属公司',
  person_id BIGINT NOT NULL COMMENT '所属个人',
  show_addr VARCHAR(255) COMMENT '项目展示地址',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 作品分类
CREATE TABLE t_works_category(
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  name VARCHAR(50) NOT NULL COMMENT '分类名称',
  person_id BIGINT NOT NULL COMMENT '所属个人',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);

## 作品
CREATE TABLE t_works (
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  detail TEXT NOT NULL COMMENT '作品详情',
  description VARCHAR(255) COMMENT '作品描述',
  cover_img VARCHAR(255) COMMENT '封面图片地址',
  title VARCHAR(100) COMMENT '作品标题',
  person_id BIGINT NOT NULL COMMENT '所属个人',
  works_category_id BIGINT NOT NULL COMMENT '分类ID',
  create_time DATETIME COMMENT '创建时间',
  update_time DATETIME COMMENT '更新时间'
);