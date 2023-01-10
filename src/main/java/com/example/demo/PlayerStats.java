package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStats {

    private Player player;
    private int goals;
    private int games;



    public PlayerStats(Player player, int games, int goals) {
        this.player = player;
        this.goals = games;
        this.goals = goals;
    }

    public double gamesPerGoal(){
     return(double)this.games/(double)this.goals;

    }

    public Double[]createCSVRecord(){
        if(games==0){
            return null;
        }
        else return new Double[]{goalsPergame(),gamesPerGoal()};
    }
    public double goalsPergame(){
       return (double)this.goals /(double)this.games;
    }
    public boolean underThirty(){
        return this.player.getAge()<30;
    }

        public static Player getYoungerPlayer(Player player1,Player player2){
        if (player2.getAge() <player1.getAge()){
            return player2;
        }
            return player1;
        }

        public Player getPlayer(){
        return player;
        }
}
