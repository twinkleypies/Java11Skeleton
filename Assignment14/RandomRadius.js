RandomRadius = document.querySelector(".RandomRadius");
randRctx = RandomRadius.getContext("2d");
//gets random circle position
for(let i = 0; i < 10; i++){
let xpos = Math.floor((Math.random() * 360) +20);
let ypos = Math.floor((Math.random()* 360)+20);
let rad = Math.floor((Math.random() * 20) + 5);
//prints cirlce 
randRctx.beginPath();
randRctx.arc(xpos, ypos, rad, 0, 2*Math.PI);
randRctx.stroke();
randRctx.closePath();
//geting random colour
let randomColour = 'hsl(' + 360 *Math.random() + ', 100%, 50%)';
randRctx.fillStyle = randomColour;
randRctx.fill();
randRctx.closePath();
}