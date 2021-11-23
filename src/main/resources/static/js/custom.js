$('document').ready(function(){

$('.metode_select').click(function(){
	$('form#main_form').submit();
});

$('.dorsal_select:contains(15)').css({
	"background-color" : "#808080",
	"color": "#ffffff"
});
	
$('.dorsal_select:contains(15), .metode_select:contains(gol_encaixat), .metode_select:contains(aturada)').css({
	"background-color" : "#808080",
	"color": "#ffffff"
});

$(".dorsal_select").filter(function() {
    return $(this).text() === "1";
}).css({
	"background-color" : "#808080",
	"color": "#ffffff"
});

});