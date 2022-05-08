// var script = document.createElement('script');
// script.src = 'https://code.jquery.com/jquery-3.6.0.min.js';
// document.getElementsByTagName('head')[0].appendChild(script);


var btn = document.getElementById('btn');


btn.addEventListener('click', e => {
    document.getElementById('btn').innerText = "bring back everyone";

    $("#head1").fadeToggle(2000);
});



///////
