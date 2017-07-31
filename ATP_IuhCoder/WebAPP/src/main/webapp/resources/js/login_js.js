// JavaScript Document
$(document).ready(function(){

	$("#lb-tab-2").click(function(){
		$("#lb-tab-1").css('color','#3391EB');
		$("#lb-tab-1").css('background-color','white');
		$("#lb-tab-2").css('color','white');
		$("#lb-tab-2").css('background-color','#3391EB');
	});
	$("#lb-tab-1").click(function(){
		$("#lb-tab-2").css('color','#3391EB');
		$("#lb-tab-2").css('background-color','white');
		$("#lb-tab-1").css('color','white');
		$("#lb-tab-1").css('background-color','#3391EB');
	});
});