<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BBS-SMS</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<body>
<!--主体内容显示区-->
    <div id="main">
        <!--头部，项目logo显示区-->
        <div class="header">
            <div id="logo"><img src="image/LOGO.png"></div>
            <div id="title">
                数联铭品软件开发资源管理系统  v1.0
            </div>
            <div id="login">
                <i class="layui-icon" style="color: white">&#xe623;</i>
                <a href="#">${user.realname}</a>
            </div>
        </div>
        <!--上部内容显示区-->
        <div id="content">
            <!--菜单显示区-->
            <div id="meau">
                <div id="icon"><img src="image/menuicon.png" style="float: left;">主菜单</div>
                <ul class="menulist">
                    <li id="menu1" onclick="sel(this);"><a href="javascript:;" ><i class="layui-icon" style="float: left;padding-left: 15px">&#xe63c;</i>项目库</a></li>
                    <li id="menu2" onclick="sel(this);"><a href="javascript:;" ><i class="layui-icon" style="float: left;padding-left: 15px">&#xe63c;</i>我的项目</a></li>
                    <li id="menu3" onclick="sel(this);"><a href="javascript:;" ><i class="layui-icon" style="float: left;padding-left: 15px">&#xe63c;</i>OTM管理</a></li>
                </ul>
            </div>
            <!--表格数据显示区-->
                <!--表格列名-->
            <div class="message">
                    <table class="list">
                        <thead>
                            <tr>
                                <th>创建时间</th>
                                <th>项目名称</th>
                                <th>项目阶段</th>
                                <th>项目金额</th>
                                <th>所属部门</th>
                                <th>产品</th>
                                <th>项目</th>
                                <th>技术</th>
                                <th>Mode</th>
                                <th>供应商</th>
                                <th>高</th>
                                <th>中</th>
                                <th>低</th>
                                <th>总</th>
                                <th>人天</th>
                            </tr>
                        </thead>
                        <tbody class="detail">
                        <tr class="detail">
                            <td>2018年3月22日</td>
                            <td>外包商</td>
                            <td>合同流程</td>
                            <td>36000</td>
                            <td>技术部门</td>
                            <td>吴经理</td>
                            <td>唐经理</td>
                            <td>谭经理</td>
                            <td>FP模式</td>
                            <td>软通动力</td>
                            <td>2</td>
                            <td>2</td>
                            <td>4</td>
                            <td>8</td>
                            <td>100</td>
                        </tr>
                        <tr class="detail">
                            <td>2018年3月22日</td>
                            <td>外包商</td>
                            <td>合同流程</td>
                            <td>36000</td>
                            <td>技术部门</td>
                            <td>吴经理</td>
                            <td>唐经理</td>
                            <td>谭经理</td>
                            <td>FP模式</td>
                            <td>软通动力</td>
                            <td>2</td>
                            <td>2</td>
                            <td>4</td>
                            <td>8</td>
                            <td>100</td>
                        </tr>
                        <tr class="detail">
                            <td>2018年3月22日</td>
                            <td>外包商</td>
                            <td>合同流程</td>
                            <td>36000</td>
                            <td>技术部门</td>
                            <td>吴经理</td>
                            <td>唐经理</td>
                            <td>谭经理</td>
                            <td>FP模式</td>
                            <td>软通动力</td>
                            <td>2</td>
                            <td>2</td>
                            <td>4</td>
                            <td>8</td>
                            <td>100</td>
                        </tr>
                        <tr class="detail">
                            <td>2018年3月22日</td>
                            <td>外包商</td>
                            <td>合同流程</td>
                            <td>36000</td>
                            <td>技术部门</td>
                            <td>吴经理</td>
                            <td>唐经理</td>
                            <td>谭经理</td>
                            <td>FP模式</td>
                            <td>软通动力</td>
                            <td>2</td>
                            <td>2</td>
                            <td>4</td>
                            <td>8</td>
                            <td>100</td>
                        </tr>
                        </tbody>
                    </table>
              </div>
        </div>
        <!--数据详情显示区-->
        <div id="content1">
            <div id="add">
                <img src="image/增加.png">
            </div>
            <div id="project">&nbsp;&nbsp;&nbsp;&nbsp;
                <div class="msg">项目名称：
                    <input type="text" value="" placeholder="项目名称"/>
                </div>&nbsp;&nbsp;&nbsp;
                <div class="msg">项目预算金额：
                    ￥<input type="text" value="" placeholder="项目预算金额"/>
                </div>&nbsp;&nbsp;&nbsp;
                <div class="msg mode">项目执行模式：
                    <input type="text" readonly="readonly" value=""/>
                    <input type="text" readonly="readonly" value=""/>
                    <input type="text" readonly="readonly" value=""/>
                </div>
            </div>
        </div>
        <!--仪表盘区域-->
        <div id="content2">
            <!--左部仪表盘-->
            <div class="dashboard">
                <div id="dash">仪表盘</div>
                <ul class="menulist1">
                    <li id="menu4" onclick="sel1(this);"><a href="javascript:;" ><i class="layui-icon" style="float: left;padding-left: 15px">&#xe63c;</i>项目透视</a></li>
                    <li id="menu5" onclick="sel1(this);"><a href="javascript:;" ><i class="layui-icon" style="float: left;padding-left: 15px">&#xe63c;</i>预算分析</a></li>
                </ul>
            </div>
            <!--上部信息分类栏-->
            <div class="upmessage">
                <table class="list1" style="color: white;">
                    <thead>
                        <tr>
                            <th>&lt;销售合同扫描件&gt;</th>
                            <th>&lt;PRD文档&gt;</th>
                            <th>&lt;立项确认书&gt;</th>
                            <th>&lt;外包商确认书&gt;</th>
                            <th>&lt;外包合同扫描件&gt;</th>
                            <th>&lt;项目中期验收单&gt;</th>
                            <th>&lt;项目验收单&gt;</th>
                            <th>&lt;服务评价表&gt;</th>
                        </tr>
                    </thead>
                </table>
            </div>
            <!--下部信息显示栏-->
            <div class="downmessage">
                <div class="down"><img src="image/增加.png"></div>
                <div class="down"><img src="image/增加.png"></div>
                <div class="down"><img src="image/增加灰.png"></div>
                <div class="down"><img src="image/增加灰.png"></div>
                <div class="down"><img src="image/增加.png"></div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
function sel(obj) {
    var menu = $(".menulist li")
    for(var i=0;i<menu.length;i++)
    {
        if(menu[i]!=obj)
        {
            $(menu[i]).css('background-color','#000000')
        }
        else
            $(menu[i]).css('background-color','#b7b7b7')
    }
}
function sel1(obj) {
    var menu1 = $(".menulist1 li")
    for(var i=0;i<menu1.length;i++)
    {
        if(menu1[i]!=obj)
        {
            $(menu1[i]).css('background-color','#000000')
        }
        else
            $(menu1[i]).css('background-color','#b7b7b7')
    }
}
/* 页面加载刷新界面 */
$(function(){
	$.ajax({
		url:"findAuth.action",
		type:"post",
		dataType:"json",
		success:function(data){
			var menu = "";
			for(var i=0;i<data.length;i++){
				menu += "<li id='menu1' onclick='sel(this);'><a href='javascript:;' ><i class='layui-icon' style='float: left;padding-left: 15px'>&#xe63c;</i>'"+data[i].auth_name+"'</a></li>"
			}
			$(".menulist").html(menu);
		}		
	})
});
</script>
</html>