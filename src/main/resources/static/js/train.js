//二维码
$(document).ready(function(){
  $("#qr-code").mouseenter(function(){
    $(".qr-code").fadeIn();
  });
  $(".qr-code").mouseleave(function(){
    $(".qr-code").fadeOut();
  });
});
