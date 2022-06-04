import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent{

  turnCount:number
  numberOfBalls:number
  randomNum:number
  balls:Array<Balls>=new Array<Balls>()
  isShown: boolean = false
  isShown2: boolean = false
  checkWiner:boolean=true
  result:string
  
  constructor() { 
    this.randomNum=0   
    this.numberOfBalls=30
    this.turnCount=4
    this.result=""
  }

  NumberOfBalls(e:any) {  
    this.numberOfBalls=e.target.value
    this.RandomNumGenerator(this.numberOfBalls)
  }

  BtnCreater(){ 
    for(var i=1;i<=this.numberOfBalls;i++){
      this.balls.push(new Balls(i,"#F7F9F9 ",i))
    }
  }

  btnHandler() {
  // let element: HTMLElement;
  // let element2: HTMLElement;
  // element= document.getElementById('container') as HTMLElement
  // element2= document.getElementById('container2') as HTMLElement
   this.isShown = ! this.isShown;
  this.BtnCreater()
  this.RandomNumGenerator(this.numberOfBalls)
  }
 
  GameLogic(id:number,$event:MouseEvent)
  {  
      let btn=this.balls.find(x=>x.id==id)
      if(btn&&this.checkWiner==true&&this.turnCount!=0){
        if(btn.id==this.randomNum){
          btn.color="#47F16E"
          this.checkWiner=false
          this.gameMessage(btn.id,"win")   
        }else if(btn.id<this.randomNum){
          btn.color="#F14747"
        }else if(btn.id>this.randomNum){
          btn.color="#4BB5EA"
        }
        console.log(this.randomNum)
        this.turnCount--
      }else if(btn&&this.turnCount>=0 && this.checkWiner==false){
        this.gameMessage(btn.id,"win")  
      }else if(btn && this.turnCount<=0 && this.checkWiner==true){
        this.gameMessage(btn.id,"lost")
      }
      ($event.target as HTMLButtonElement).disabled = true;
   //   alert(this.randomNum)
  }

  gameMessage(id:number,msg:string){
    this.result=`You ${msg}`
  }

  RandomNumGenerator(max:number){
    this.randomNum=  Math.floor(Math.random() * (max - 10 + 2)) + 10;
  }
}

export class Balls{
  constructor(public id:number,public color:string,public description:number){
  }
}
