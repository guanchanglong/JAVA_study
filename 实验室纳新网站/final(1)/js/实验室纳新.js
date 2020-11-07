window.onload=function(){
    document.addEventListener("scroll",function(){
        var scrolltop=window.pageYOffset;
        if(scrolltop>=0 && scrolltop<800)
        {
            var first_section_left = document.querySelector(".first_section_left");
            first_section_left.style.marginTop=-scrolltop*0.6+300+"px";

            var first_section_right = document.querySelector(".first_section_right");
            first_section_right.style.marginTop=-scrolltop*1.5+150+"px";
        }
        if(scrolltop>80 && scrolltop<1060)
        {
            var second_section_left = document.querySelector(".second_section_left");
            second_section_left.style.marginTop=scrolltop*0.7-760+480+"px";

            var second_section_right = document.querySelector(".second_section_right");
            second_section_right.style.marginTop=scrolltop*0.6-800+400+"px";
        }
        if(scrolltop>80 && scrolltop<530)
        {
            var second_section = document.querySelector(".second_section");
            second_section.style.marginTop=scrolltop-150-400+"px";
        }

        if(scrolltop>840 && scrolltop<1350)
        {
            var third_section_left = document.querySelector(".third_section_left");
            third_section_left.style.marginTop=scrolltop*0.7+321.6-1072+100+"px";

            var third_section_right = document.querySelector(".third_section_right");
            third_section_right.style.marginTop=scrolltop*0.6+428.8-1072+"px";
        }
        if(scrolltop>870 && scrolltop<1370)
        {
            var third_section = document.querySelector(".third_section");
            third_section.style.marginTop=scrolltop-870-500+"px";
        }

        if(scrolltop>1640 && scrolltop<2320)
        {
            var forth_section_left = document.querySelector(".forth_section_left");
            forth_section_left.style.marginTop=scrolltop*0.7+540-1800+"px";

            var forth_section_right = document.querySelector(".forth_section_right");
            forth_section_right.style.marginTop=scrolltop*0.6+720-1800-200+"px";
        }
        if(scrolltop>1680 && scrolltop<1997)
        {
            var forth_section = document.querySelector(".forth_section");
            forth_section.style.marginTop=scrolltop-2000+"px";
        }


    


    })
}