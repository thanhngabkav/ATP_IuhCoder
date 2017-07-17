// JavaScript Document
$(document).ready(function(){
    $(".navbar-scroll").hide();

    $(function(){
        $(window).scroll(function(){
            if($(this).scrollTop() > 200){
                $(".navbar-scroll").fadeIn();
            }else{
                $(".navbar-scroll").fadeOut();
            }
        });
    });
});

