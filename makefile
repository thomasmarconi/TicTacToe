JCC = javac

default:	TicTacToe.class Player.class Human.class DumbComp.class AdvComp.class

TicTacToe.class:	TicTacToe.java
	$(JCC) TicTacToe.java

Player.class:	Player.java
	$(JCC) Player.java

Computer.class: Computer.java
	$(JCC) Computer.java

Human.class:	Human.java
	$(JCC) Human.java

DumbComp.class:	DumbComp.java
	$(JCC) DumbComp.java

AdvComp.class:	AdvComp.java
	$(JCC) AdvComp.java

clean:
	rm *.class; clear;
