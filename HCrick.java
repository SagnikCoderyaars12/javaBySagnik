import java.util.Scanner;

public class HCrick {
    public static int getRandomNumber() {
		return 1+(int) (Math.random() *(6-1+1));
	}

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
var pr =System.out;
int choice=0,c=0,rbatus=0,rbatcomp=0,wballus=0,wballcomp=0;
int user=0,outus=0,comp=0;

System.out.println("Hi! What is your name?");
String nam = sc.nextLine();
System.out.println("Hi "+nam+" I am Sagnik and we will have fun playing this game\nLet's toss . What's your call\nHeads or Tails (Choose 1 for Heads and 2 for Tails)");
 int toss = sc.nextInt();
 
 int b = 1+(int)(Math.random()*(2-1+1));
 if(b==toss){
 pr.println("Woah! You have won the toss. What do you choose to \nPress 1 to bat first\nPress 2 to ball first");
 choice=sc.nextInt();

}
else if(toss>2||toss<1)
pr.println("Oh no! choose between 1 and 2");
else if(b!=toss){
pr.println("Oops! Luck didn't favour you and I choose to ball first");
c++;}
if(choice==1||c==1){
    System.out.println("Whoah! Be careful my sharp yorkers may break your wickets!");
    while(true){
        wballcomp=getRandomNumber();
        
        pr.println("Enter your choice:");
        user=sc.nextInt();
        pr.println("I have attempted "+wballcomp);
        if(user>6||user<1){
        pr.println("Your game gets over as your input is not between 1 and 6");
        System.exit(0);}
        else if(user>wballcomp||user<wballcomp){
            rbatus+=user;
            
        }
        else if(wballcomp==user){
            System.out.println("Well played! But you are out now\n Your total runs are: "+rbatus+" and you have given me a target of "+ ++rbatus);
            outus++;
            break;
            
        }}
if(outus==1){
    comp=getRandomNumber();
pr.println("\n\nGet a good grip on your ball");
while(true){
pr.println("Enter your choice:");
wballus=sc.nextInt();
pr.println("I have attempted: "+comp);
if(wballus>6||wballus<1){
    pr.println("Your game gets over a your input is not between 1 and 6");
    System.exit(0);
}


else if(comp==wballus){

break;
}
else if(rbatcomp==rbatus||rbatcomp>rbatus){
   
    break;
}
else{
    
        rbatcomp=rbatcomp+comp;
}
}
}
if(rbatcomp==rbatus||rbatcomp>=rbatus){
    System.out.println("Sorry "+nam+" I won the match. Better luck next time");
    System.exit(0);}
    if (rbatcomp<rbatus){
        pr.println("Congrats "+nam+" you have defeated me");
    }
    else if(rbatcomp==rbatus-1){
        pr.println("It's a draw, "+nam);
    }
}


if(choice==2){
    comp=getRandomNumber();
pr.println("\n\nGet a good grip on your ball");
while(true){
pr.println("Enter your choice:");
wballus=sc.nextInt();
pr.println("I have attempted "+comp);
if(wballus>6||wballus<1){
    pr.println("Your game gets over as your input is not between 1 and 6");
    System.exit(0);
}


else if(comp==wballus){
pr.println("Whoah! You took my wicket.Total run by me= "+rbatcomp+" and you need to make "+ ++rbatcomp);
break;
}

else{
    
        rbatcomp=rbatcomp+comp;
}
}
System.out.println("Whoah! Be careful my sharp yorkers may break your wickets!");
    while(true){
        wballcomp=getRandomNumber();
        
        pr.println("Enter your choice:");
        user=sc.nextInt();
        pr.println("I have attempted: "+wballcomp);
        if(user>6||user<1){
        pr.println("Your game gets over as your input is not between 1 and 6");
        System.exit(0);}
        else if(user>wballcomp||user<wballcomp){
            rbatus+=user;
            
        }
        else if(wballcomp==user){
            
            break;
            
        }
    else if(rbatus==rbatcomp||rbatus>rbatcomp)

break;}
if(rbatus==rbatcomp||rbatus>rbatcomp){
pr.println("Congrats! "+nam+" you have defeated me");
System.exit(0);}

 if(rbatus==rbatcomp-1){
    pr.println(nam+" It's a draw");
System.exit(0);}
    if(rbatus<rbatcomp) {
        
pr.println("Oops! "+nam+" better luck next time");
System.exit(0);}
}
sc.close();

}
    }


    






    




