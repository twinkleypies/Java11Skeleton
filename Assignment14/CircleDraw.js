let CircleDrawCanvas = document.querySelector(".CircleDraw")
let context = CircleDrawCanvas.getContext("2d")
//Draw Circle
context.beginPath();
context.arc(CircleDrawCanvas.width/2, CircleDrawCanvas.height/2, 60, 0, 2*Math.PI);
context.fillStyle = "green";
context.fill();
context.stroke();
context.closePath();
//Draw name
context.fillStyle = "pink";
context.textAlign = "center";
context.textBaseline = "middle";
context.font = "30px Arial";
context.fillText("Jess", CircleDrawCanvas.width/2, CircleDrawCanvas.height/2);