function fromsubmit() {
    var user = {};
    user["userName"] = $("#userName").val();
    user["passWord"] = $("#passWord").val();
    $.ajax({
        type: "POST",
        url: "/user/login",
        async:false,
        // dataType: "json",
        data: user,
        success: function(data){
            var code = data.code;
            if ( code ==  0){
                $.cookie('user', 0);
                $("#loginForm").attr("action","../index.html");
            }else{
                alert(data.remake);
            }
        },
        error:function(err){
            alert("系统异常!")
        }
    });
}