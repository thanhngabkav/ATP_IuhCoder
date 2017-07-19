// JavaScript Document
$(document).ready(function(){
    $(".navbar-scroll").hide();

    $(function(){
        $(window).scroll(function(){
            if($(this).scrollTop() > 200){
                $(".navbar-scroll").fadeIn();
                $(".navbar-home").hide();
            }else{
                $(".navbar-scroll").fadeOut();
                $(".navbar-home").show();
            }
        });
    });
});

