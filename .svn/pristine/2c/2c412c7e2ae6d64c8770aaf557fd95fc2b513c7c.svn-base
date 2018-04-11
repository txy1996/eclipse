	$(function(){
		$.ajax({
			type:'post'
			,url:'searchLog.action'
			,dataType:'json'
			,success:function(data){
				var log = "";
				for(var i=0;i<data.length;i++){
					log += "<tr class='tab-content'>"+
	                			"<td>"+data[i].user.realname+"</td>"+
	                			"<td>"+data[i].role_name+"</td>"+
	                			"<td>"+data[i].login_time+"</td>"+
	                			"<td>"+data[i].project.project_name+"</td>"+
	                			"<td>"+data[i].opera_name+"</td>"+
	            		  "</tr>";
				}
				$("#log-info #log-table tbody").html(log);
			},error:function(){
				console.log('请求错误')
			}
		});
	});
	/* 选择查询 */
	function immediately(){
		var proType = $('#search-select #pro-select').find("option:selected").text();
		var roleName = $("#search-select #role-select").find("option:selected").text();
		var time = $("#search-select #time-select").find("option:selected").text();
		if(proType=='按项目选择查看' && roleName=='按用户选择查看' && time=='按时间选择查看'){
			layer.confirm('请选择一个条件', {
                btn: ['确认'] //按钮
            });
		}else{
			if (proType == '按项目选择查看') {
				proType = null;
			}
			if (roleName == '按用户选择查看') {
				roleName = null;
			}
			if (time == '按时间选择查看') {
				time = null;
			}
		}
		$.ajax({
			type : 'post',
			url : 'searchLogByProAndRoleAndTime.action',
			data : {
				'proType' : proType,
				'roleName' : roleName,
				'time' : time
			},
			dataType : 'json',
			success : function(data) {
				var log = "";
				for (var i = 0; i < data.length; i++) {
					log += "<tr class='tab-content'>" + "<td>"
							+ data[i].user.realname + "</td>" + "<td>"
							+ data[i].role_name + "</td>" + "<td>"
							+ data[i].login_time + "</td>" + "<td>"
							+ data[i].project.project_name + "</td>" + "<td>"
							+ data[i].opera_name + "</td>" + "</tr>";
				}
				$("#log-info #log-table tbody").html(log);
			},
			error : function() {
				console.log('请求失败')
			}
		});
	}