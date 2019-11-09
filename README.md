# GEF-Tutorial

Graphical Editing Framework入门，Eclipse插件开发。

## 配置

Eclipse 3.6.2，JDK 1.6。

安装下述插件时，将`plugins`目录下内容拷贝到Eclipse的`plugins`目录下再重启即可。

选择[下载](https://www.eclipse.org/gef/downloads/index.php)GEF 3.1.0的SDK。

## 运行

打开`plugin.xml`，点击Overview下的"Launch an Eclipse application"。

## 概念

### Editor

GEF的图形要画在Editor上

### Action

菜单等类似控件的东西

### EditorInput

所有的Editor都要有一个EditorInput作为其内容的提供者

### Model

模型，不仅包含数据，还可以包含约束(Constraint)以限制其形状等

### EditPart

控制器，用于连接视图和模型，模型的变化要先通知作为监听者的控制器

### Viewer

视图，放在Editor里面作为其成员

