RandomCircles = document.querySelector(".RandomCircles");
randctx = RandomCircles.getContext("2d");
//gets random circle position
for(let i = 0; i < 10; i++){
let xpos = Math.floor((Math.random() * 360) +20);
let ypos = Math.floor((Math.random()* 360)+20);
//prints cirlce 
randctx.beginPath();
randctx.arc(xpos, ypos, 20, 0, 2*Math.PI);
randctx.stroke();
randctx.closePath();

}