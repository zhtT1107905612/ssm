$(document).ready(function(){
    $("form").submit(function(){

        var user = {};
        user["userName"] = $("#userName").val()
        user["passWord"] = $("#passWord").val();
        $.ajax({
            type: "POST",
            url: "/user/text",
            async:false,
            dataType: "json",
            data: user,
            success: function(data){

                alert(data);
                // if(data.result ){
                //     if( data.data > 0){
                //         gAlert(data.message,"友情提示",function(){
                //             alert(data.data);//data.data= comparativePriceVo
                //         });
                //     }else{
                //         gAlert(data.message,"友情提示");
                //     }
                // }else{
                //     gAlert(data.message,"友情提示");
                // }
            }
        });







        //$.cookie('user', '122222222222');
        //alert($.cookie('user'));
    });
});