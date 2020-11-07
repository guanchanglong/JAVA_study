var join = document.querySelector('#join');
var lg = document.querySelector('.login');
var closebtn = document.querySelector('#closeBtn');
var pic3 = document.querySelector('#pic3');
var pic4 = document.querySelector('#pic4');
var mengban  = document.querySelector(".mengban");
var join_click=function(){
  lg.style.display = "block";
  mengban.style.display = "block";
}
join.addEventListener('click',join_click);
closebtn.addEventListener('click',function(){
  lg.style.display = 'none';
  mengban.style.display = "none";
})
//判断专业班级输入格式是否正确(中文和数字,但是现在不能保证第一个是中文)
var major = document.querySelector(".label1>input");
var majorspan = document.querySelector("#pic1");
major.addEventListener("blur",function (){
  let regex1 = /[^0-9\u4E00-\u9FA5]/g;
  let regex1_1 = /^[\u4E00-\u9FA5]/;
  if ((regex1.test(this.value) != false || regex1_1.test(this.value) != true) && this.value !="" )
  {
    majorspan.style.display = "block";
  }
  else
  {
    majorspan.style.display="none";
  }
})
//判断性名输入格式是否正确
var aaa = document.querySelector(".label2>input");
var aaaspan = document.querySelector("#pic2");
aaa.addEventListener("blur",function () {
  let regex2 = /[^\u4E00-\u9FA5]/g;
  if(regex2.test(this.value) !=false)
  {
    aaaspan.style.display = "block";
  }else
  {
    aaaspan.style.display="none";
  }
})
//判断学号输入格式是否正确
var number = document.querySelector(".label3>input");
var numberspan = document.querySelector("#pic3");
number.addEventListener("blur",function (){
  let regex3  = /\d{8}/g;
  if (regex3.test(this.value)==false &&this.value != "")
  {
    numberspan.innerHTML="<img src='img/error.png'>请输入8位的学号";
    numberspan.style.display = "block";
  }
  else
  {
    numberspan.style.display = "none";
    if(this.value != "")
    {
      $.ajax({
        type: "POST",
        url: "http://localhost:8080/member/findAllByNumber",
        data:{
          number:number.value,
        },
        success:function () {
          return 0;
        },
        error:function (xhr) {
          numberspan.innerHTML="<img src='img/error.png'>该学号已经报名了";
          numberspan.style.display="block";

        }
      })
    }
  }
})
//判断手机号输入格式是否正确
var phone = document.querySelector(".label4>input");
var phonespan = document.querySelector("#pic4");
phone.addEventListener("blur",function () {
  let regex4 = /^1[3-9]\d{9}$/;
  if (regex4.test(this.value) == false &&this.value !="")
  {
    phonespan.style.display = "block";
  }else
  {
    phonespan.style.display="none";
  }
})
var submit = document.querySelector(".login-button");
var intention = document.querySelector(".intention");
var sex = document.querySelector(".labelsex>input");
submit.onclick = function (){
  //input表单非空
  if (aaa.value !="" && major.value !="" && number.value != "" && phone.value !="" &&aaaspan.style.display =="none" && majorspan.style.display == "none" && numberspan.style.display =="none" && phonespan.style.display == "none")
  {
    $.ajax({
      type: "POST",
      url: "http://localhost:8080/member/save",
      dataType:"json",
      contentType:'application/json',

      data:JSON.stringify({
        name:aaa.value,
        sex:$("input:radio:checked").val(),
        number:number.value,
        phone:phone.value,
        intention:intention.value,
        major:major.value
      }),
      success: function(xhr){
        alert("恭喜您已报名成功！");
        //报名成功后
        lg.style.display ="none";
        mengban.style.display = "none";
        major.value = "";
        intention.value="后台组";
        aaa.value="";
        number.value="";
        phone.value="";
        numberspan.innerHTML="<img src='img/error.png'>请输入8位的学号";
        $("input:radio:nth-child(1)").prop("checked","checked");
        ;
      },
      error: function (xhr){
        alert("报名失败，请您稍后重试！！！");
      },
      beforeSend:function (){
        $(".login-button").attr({disabled:"disabled"});
      },
      complete:function () {
        $(".login-button").removeAttr("disabled");
      }
      //清空输入框
    });
  }
  else
  {
    alert("请输入您的所有信息(并且保证信息正确)");
  }
}
