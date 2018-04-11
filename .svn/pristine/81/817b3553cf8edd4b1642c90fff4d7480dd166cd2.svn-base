/**
 * 标签显示隐藏
 * @param obj
 * @returns
 */
	function show(obj) {
        obj.style.display = 'block';
    };

    function hidden(obj) {
        obj.style.display = 'none';
    };

    $("#fp_show").click(function () {
        console.log("im come ing")
        var div1 = document.getElementById("div1");
        var div2 = document.getElementById("div2");
        show(div1);
        hidden(div2);
        
       //获取全部的供应商
        $.ajax({
    		type : "post",
    		url : "zhiliaotang/Supplier.action",
    		cache : true,
    		dataType : "json",
    		success : function(data) {
    			alert(data[1].id);
    			Sup(data);
    		}
    	});
        
function Sup(data){
        	var str = '';
        	for(var i = 0;i<data.length;i++ ){
        	var supplier = new Supplier();
        	supplier.id=data[i].id;
        	supplier.supperlier_name=data[i].supperlier_name ;
        	
        	str += supplier.supPlay();
        	
      }
        var su = document.getElementById('supplier')
        su.innerHTML = str
 }
        
    });

    $("#otm_show").click(function () {
        console.log("im come ing")
        var div1 = document.getElementById("div1");
        var div2 = document.getElementById("div2");
        show(div2);
        hidden(div1);
    });
    
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
    };
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
    };