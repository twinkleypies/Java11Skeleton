let SnowmanCanvas = document.querySelector(".Snowman")
let ctx = SnowmanCanvas.getContext("2d")
//draw horizon
ctx.beginPath();
ctx.fillStyle = "black"
ctx.fillRect(0, SnowmanCanvas.height/2, SnowmanCanvas.width, 5);
ctx.fill();
ctx.closePath();
//snowman body
ctx.beginPath();
ctx.fillStyle = "lightgrey"
ctx.arc(SnowmanCanvas.width/2, 320, 60, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();
//snowman middle
ctx.beginPath();
ctx.fillStyle = "lightgrey"
ctx.arc(SnowmanCanvas.width/2, 250, 40, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();
//snowman head
ctx.beginPath();
ctx.fillStyle = "lightgrey"
ctx.arc(SnowmanCanvas.width/2, 190, 30, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();
//snowman buttons
ctx.beginPath();
ctx.fillStyle = "black"
ctx.arc(SnowmanCanvas.width/2, 234, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

ctx.beginPath();
ctx.fillStyle = "black"
ctx.arc(SnowmanCanvas.width/2, 255, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//snowman face
ctx.beginPath();
ctx.fillStyle = "purple"
ctx.arc(SnowmanCanvas.width/2 + 10, 185, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();
ctx.beginPath();
ctx.fillStyle = "purple"
ctx.arc(SnowmanCanvas.width/2 -10, 185, 5, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();