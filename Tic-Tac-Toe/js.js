//Make a given game cell x
function makeX(cell){
  cell.innerHTML = "X";
}
//Make a given game cell O
function makeO(cell){
  cell.innerHTML = "O";
}
//Check if the game has been won
function checkWin(){

  //Horizontal Lines
  //Horizontal line Top
  if(document.getElementById('0').innerHTML==document.getElementById('1').innerHTML && document.getElementById('1').innerHTML==document.getElementById('2').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('2').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('1').style.background = "green";
    document.getElementById('2').style.background = "green";
    finish();
  }
  //Horizontal line Mid
  else if(document.getElementById('3').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('5').innerHTML&&document.getElementById('3').innerHTML!=""&&document.getElementById('5').innerHTML!=""){
    document.getElementById('3').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('5').style.background = "green";
    finish();
  }
  //Horizontal line Bot
  else if(document.getElementById('6').innerHTML==document.getElementById('7').innerHTML && document.getElementById('7').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('6').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('6').style.background = "green";
    document.getElementById('7').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }

  //Verticle Lines
  //Verticle line Left
  else if(document.getElementById('0').innerHTML==document.getElementById('3').innerHTML && document.getElementById('3').innerHTML==document.getElementById('6').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('6').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('3').style.background = "green";
    document.getElementById('6').style.background = "green";
    finish();
  }
  //Verticle line Mid
  else if(document.getElementById('1').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('7').innerHTML&&document.getElementById('1').innerHTML!=""&&document.getElementById('7').innerHTML!=""){
    document.getElementById('1').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('7').style.background = "green";
    finish();
  }
  //Verticle line Right
  else if(document.getElementById('2').innerHTML==document.getElementById('5').innerHTML && document.getElementById('5').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('2').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('2').style.background = "green";
    document.getElementById('5').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }
  //Diagonal Lines
  //Top-left to Bottom-Right
  else if(document.getElementById('0').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('8').innerHTML&&document.getElementById('0').innerHTML!=""&&document.getElementById('8').innerHTML!=""){
    document.getElementById('0').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('8').style.background = "green";
    finish();
  }
  //Top-Right to Bottom-LEft
  else if(document.getElementById('2').innerHTML==document.getElementById('4').innerHTML && document.getElementById('4').innerHTML==document.getElementById('6').innerHTML&&document.getElementById('2').innerHTML!=""&&document.getElementById('6').innerHTML!=""){
    document.getElementById('2').style.background = "green";
    document.getElementById('4').style.background = "green";
    document.getElementById('6').style.background = "green";
    finish();
  }
}
//When the game has finished display a message stating who won and prevent any more changes to the game grid.
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
//If the game hasn't finsihed change the content of a given cell to the active player's symbol and then swap active player. Checking for a win before active player swao.
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
//Reloads the page to allow for the game to be reset.
function reset(){
  location.reload(true);
}
