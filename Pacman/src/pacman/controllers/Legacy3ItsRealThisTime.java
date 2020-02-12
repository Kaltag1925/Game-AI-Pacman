package pacman.controllers;

import java.util.EnumMap;
import java.util.Random;

import pacman.game.Game;
import pacman.game.Constants.DM;
import pacman.game.Constants.GHOST;
import pacman.game.Constants.MOVE;

public class Legacy3ItsRealThisTime extends Controller<EnumMap<GHOST,MOVE>>
{
	EnumMap<GHOST,MOVE> myMoves=new EnumMap<GHOST,MOVE>(GHOST.class);
	MOVE[] moves=MOVE.values();
	
	public enum Mode {
		CHASE, FRIGHTENED, SCATTER
	}
	
	private static class Vector {
		int x;
		int y;
		
		public Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void multiply(int i) {
			x *= i;
			y *= i;
		}
	}
	
	private MOVE lastPacMove = MOVE.NEUTRAL;
	
	public EnumMap<GHOST,MOVE> getMove(Game game,long timeDue)
	{
		myMoves.clear();
		
		if (game.getPacmanLastMoveMade() != MOVE.NEUTRAL) {
			lastPacMove = game.getPacmanLastMoveMade();
		}
		
		
		if(game.doesGhostRequireAction(GHOST.BLINKY)) {
			
		}
		
		if(game.doesGhostRequireAction(GHOST.INKY)) {
			
		}
		
		if(game.doesGhostRequireAction(GHOST.PINKY)) {
			
		}
		
		if(game.doesGhostRequireAction(GHOST.SUE)) {
			
		}
		
		return myMoves;
	}
	
	private MOVE pinky(Game game) {
		Vector offset = calcOffset();
		offset.multiply(4);
	}
	
	private Vector calcOffset() {
		if (lastPacMove == MOVE.UP) {
			return new Vector(1, -1);
		} else if (lastPacMove == MOVE.DOWN) {
			return new Vector(0, 1);
		} else if (lastPacMove == MOVE.RIGHT) {
			return new Vector(-1, 0);
		} else {
			return new Vector(1, 0);
	}
		
		
//		if (lastPacMove == MOVE.UP) {
//			return 0x00FF;
//		} else if (lastPacMove == MOVE.DOWN) {
//			return 0x0001;
//		} else if (lastPacMove == MOVE.RIGHT) {
//			return 0xFF00;
//		} else {
//			return 0x0100;
//		}
		
		//		return switch(lastPacMove) {
//			case MOVE.UP -> 0x00FF;
//			case MOVE.LEFT -> 0x0100;
//			case MOVE.RIGHT -> 0xFF00;
//			default -> 0x00FF;
//		}
	}
}
