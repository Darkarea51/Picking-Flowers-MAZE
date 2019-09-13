method main()
{
   Jeroo C = new Jeroo(19,0);
   
   while(!C.isFlower(HERE))
   {
      C.oneLine();
      C.Safejump();
      C.checksys();
      C.pick();
   
         if(!C.isWater(AHEAD))
         {
            C.checksys();
            C.turn(LEFT);
            C.hop();
         }
     
     	 else if(!C.isWater(LEFT))
         {
            C.turn(LEFT);
            C.hop();
         }
     	 else if(C.isFacing(EAST) && C.isWater(AHEAD) && C.isWater(LEFT) && C.isWater(RIGHT))
     	 {
           C.turn(RIGHT);
           C.turn(RIGHT);
           C.hop();
     	 }
     	 else if (C.isFacing(EAST) && C.isWater(AHEAD) && C.isWater(LEFT))
     	{
          C.turn(RIGHT);
          
          C.hop();
     	}
     	
         
         else if(!C.isWater(AHEAD))
         {
            C.turn(LEFT);
            C.hop();
         }
         else if(C.isWater(RIGHT) && C.isWater(LEFT) && C.isWater(AHEAD))
         {
            C.oneLine();
            C.turn(LEFT);
            C.turn(LEFT);
            C.hop();
            
         }
         else if(C.isWater(RIGHT))
         {
           	C.oneLine();
            C.turn(LEFT);
            C.hop();
         }
         
         else if(C.isWater(AHEAD))
         {
            C.oneLine();
            C.turn(RIGHT);
         }
         else if(C.isWater(AHEAD) && C.isWater(RIGHT))
         {
            C.oneLine();
            C.turn(LEFT);
         }
         else if(!C.isWater(RIGHT) && !C.isWater(AHEAD))
         {
            C.oneLine();
            C.hop();
         }
         else
         {
            C.turn(RIGHT);
            C.turn(RIGHT);
         }
   }  
}


Jeroo Methods 


method Safejump()
{
   if (!isWater(AHEAD))
   {
      
      hop();
   }
}


method checkFlower() 
{
   if (isFlower(HERE))
   {
      pick();
   }
}

method checksys()
{
	if(!isWater(AHEAD) && !isWater(LEFT))
  	{
      turn(LEFT);
      hop();
  	}
  	
}
          
method oneLine ()
{
   while(!isWater(AHEAD)) 
   {
     
      checkFlower();
      if (!isWater(AHEAD) && !isWater(RIGHT))
      {
         turn(RIGHT);
     	 checksys();
         hop();
         
      }
      else if(isWater(AHEAD))
      {
        turn(LEFT);
        turn(LEFT);
        hop();
        
      }
      else if(isWater(AHEAD) && isWater(LEFT))
      {
        checksys();
        turn(RIGHT);
        Safejump();
        hop();
      }
      else if(!isWater(LEFT) && !isWater(RIGHT) && isWater(AHEAD))
     {
       turn(RIGHT);
       hop();
     }
      else if(!isWater(LEFT))
      {
        checksys();
        turn(LEFT);
        Safejump();
   
      }
      else if(!isWater(AHEAD))
     {
       hop();
     }
   }
}

