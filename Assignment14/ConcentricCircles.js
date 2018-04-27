let ConcentricCirclesCanvas = document.querySelector(".ConcentricCircles");
let conctx = ConcentricCirclesCanvas.getContext("2d");


//makes the 10 circles smaller and smaller
for (let i = 10; i> 0; i--){
    conctx.beginPath();
    conctx.fillStyle = "blue";
    conctx.arc(ConcentricCirclesCanvas.width/2, ConcentricCirclesCanvas.height/2, (i * 10) + 20, 0, 2* Math.PI);
    conctx.fill();
    conctx.stroke();
    conctx.closePath();
}