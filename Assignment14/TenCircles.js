let TenCircleCanvas = document.querySelector(".TenCircles");
let tenctx = TenCircleCanvas.getContext("2d");


//prints ten circles
for (let i = 0; i < 10; i++){
    tenctx.beginPath();
    tenctx.fillStyle = "yellow";
    tenctx.arc(TenCircleCanvas.width/2, (i * 40) + 20, 20, 0, 2* Math.PI);
    tenctx.fill();
    tenctx.closePath();
}
