window.onload=function(){
    var input1=document.querySelector(".input1");
    var input2=document.querySelector(".input2");
    var log=document.querySelector(".denglu");
    log.addEventListener("click",function(){
        var content1=input1.value;
        var content2=input2.value;
        console.log(content1);
        console.log(content2);
        $.ajax({
            type:"POST",
            url:"http://localhost:8080/users/save",
            data:{"c1":content1,"c2":content2},
            success: function (xhr) {
                alert("传输成功");
            },
            error: function (xhr) {
                console.log(xhr.status);
            }
        })  
    })
}