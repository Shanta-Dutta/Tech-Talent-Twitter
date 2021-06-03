
//when we are hovering over Follow button, we see the Unfollow button in red.
//This happens because of this block of code.
$(document).ready(function() {
  $('.unfollow_btn').hover(function(){
    $(this).removeClass('btn-primary');
    $(this).addClass('btn-danger');
    $(this).html("Unfollow");
  }, function(){
    $(this).html("Following");
    $(this).removeClass('btn-danger');
    $(this).addClass('btn-primary');
  });
})