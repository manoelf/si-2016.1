$(document).ready(function() {
	$("#categoria").change(function(){          
	    var valor = $("#categoria option:selected").val();
	    if(valor === 'outra'){
	    	$("#input-categoria").slideDown().removeClass("hidden-input");
		    $("#categoria option:selected").attr('disabled','disabled');
	    }
	});
});

function changeSizeFont(option){
    if(option == 'plus'){
        $('*').css({"font-size":"17px"});
    }
    if(option == 'minus'){
        $('*').css({"font-size":"13px"});
    }
}


function changeBackGroundColour(){
    $('body').css({"background":"#ddd"});
}

function restoreSettings(){
	$('body').css({"background":"#fafafa"});
	 $('*').css({"font-size":"14px"});
    
}