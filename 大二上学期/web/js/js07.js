console.log('in js07.js...');

let imgUrls = [
  'image/th (1).jpg',
  'image/th (2).jpg',
  'image/t8908h.jpg',
  'image/205856-1581166736a416.jpg',
  'image/ChMkJ1iz12aIalGWAAMr23mYwksAAaO8gDQWAAAAyvz288.jpg',
];

let eimages = document.querySelector('.images');
// querySelector querySelectorALL
/*
<div class="move-in">
        <img src="image/th (1).jpg" alt="">
      </div> --> 
*/
for (let i = 0; i < imgUrls.length; i++) {
  let div = document.createElement('div');
  let img = document.createElement('img');
  img.setAttribute('src', imgUrls[i]);
  div.append(img);
  eimages.append(div);
}

let imgDivs = document.querySelectorAll('.images > div');
console.log(imgDivs);
imgDivs[0].setAttribute('class', 'move-out');
imgDivs[1].setAttribute('class', 'move-in');
