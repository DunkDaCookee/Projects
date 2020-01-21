function makeX(cell){
  cell.innerHTML = "X";
}
function makeO(cell){
  cell.innerHTML = "O";
}
function checkWin(){

  //Horizontal Lines
  if(document.getElementById('0').innerHTML==document.getElementById('1').innerHTML && document.getElementById('1').innerHTML==document.getElementById('2').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('2').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('1').style.background = "green";
    document.getElementById('2').style.background = "green";
    finish();
  }

  else if(document.getElementById('3').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('5').innerHTML&&document.getElementById('3').innerHTML!=""&&document.getElementById('5').innerHTML!=""){
    document.getElementById('3').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('5').style.background = "green";
    finish();
  }

  else if(document.getElementById('6').innerHTML==document.getElementById('7').innerHTML && document.getElementById('7').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('6').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('6').style.background = "green";
    document.getElementById('7').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }

  //Verticle Lines
  else if(document.getElementById('0').innerHTML==document.getElementById('3').innerHTML && document.getElementById('3').innerHTML==document.getElementById('6').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('6').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('3').style.background = "green";
    document.getElementById('6').style.background = "green";
    finish();
  }

  else if(document.getElementById('1').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('7').innerHTML&&document.getElementById('1').innerHTML!=""&&document.getElementById('7').innerHTML!=""){
    document.getElementById('1').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('7').style.background = "green";
    finish();
  }

  else if(document.getElementById('2').innerHTML==document.getElementById('5').innerHTML && document.getElementById('5').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('2').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('2').style.background = "green";
    document.getElementById('5').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }
  //Diagonal Lines
  else if(document.getElementById('0').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }

  else if(document.getElementById('2').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('6').innerHTML&&document.getElementById('2').innerHTML!=""&&document.getElementById('6').innerHTML!=""){
    document.getElementById('2').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('6').style.background = "green";
    finish();
  }
}

function finish(){
  var p1w ="Winner: Player 1 (X)";
  var p2w ="Winner: Player 1 (O)";

  if(document.getElementById('player').innerHTML=="Current Player: Player 1"){
    document.getElementById('Winner').innerHTML=p1w;
  }
  else{
    document.getElementById('Winner').innerHTML=p2w;
  }
}

function swap(cell){
  if(document.getElementById('Winner').innerHTML=="___________"){
    if(cell.innerHTML==""){
      if(document.getElementById('player').innerHTML=="Current Player: Player 1"){
        makeX(cell);
        checkWin()
        document.getElementById('player').innerHTML="Current Player: Player 2";
      }
      else{
        makeO(cell);
        checkWin();
        document.getElementById('player').innerHTML="Current Player: Player 1";
      }
    }
  }
}

function reset(){
  location.reload(true);
}
