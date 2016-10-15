package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import java.io.*;
import java.lang.*;
class Game
{
    char [][]table =new char[3][3];
    void initializeGame()       //initialize 3x3 matrix by placing space
    {
        for(int i =0;i<3;i++)
            for (int j=0;j<3;j++)
                table[i][j]=' ';
    }
    
    boolean checkIfLeagal(int row , int column)
    {
        if((row>2 || column>2) ||(row<0 || column<0))  //if roes and column less than or greater than 0 or 2 then give true value
            return true;
        if(table[row][column]=='x' || table[row][column]=='o')      //if character present in given row and column give true
            return true;
        return false;       //exit the method
    }


    char changePlayer(char player)
    {
        char newterm=' ';   //initialize char
        if(player=='x')     //change player
            newterm='o';
        if(player=='o')
            newterm='x';
        return newterm;
    }
    void changeBoard(char player, int row , int column)
    {
        table[row][column]= player;     //place char in 3x3 table
    }

    void displayBoard()     //show the board
    {
        System.out.println(" 0 " + table[0][0] + "|" +table[0][1] + "|" + table[0][2]);
        System.out.println("  --+-+--");
        System.out.println(" 1 " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("  --+-+--");
        System.out.println(" 2 " + table[2][0] + "|" +table[2][1] + "|" + table[2][2] );
        System.out.println("   0 1 2");
    }
    boolean checkIfWinner()
    {
        //if char matches in any same row and column then return true
        if( table [0][0]==table[1][0] && table[1][0] == table[2][0] && (table [0][0]=='x' || table [0][0]=='o'))
            return true;
            else if( table [0][1]==table[1][1] && table[1][1] == table[2][1] && (table [0][1]=='x' || table [0][1]=='o'))
            return true;
            else if( table [0][2]==table[1][2] && table[1][2] == table[2][2] && (table [0][2]=='x' || table [0][2]=='o'))
            return true;
            else if( table [0][0]==table[0][1] && table[0][1] == table[0][2] && (table [0][0]=='x' || table [0][0]=='o'))
            return true;
            else if( table [1][0]==table[1][1] && table[1][1] == table[1][2] && (table [1][0]=='x' || table [1][0]=='o'))
            return true;
            else if( table [2][0]==table[2][1] && table[2][1] == table[2][2] && (table [2][0]=='x' || table [2][0]=='o'))
            return true;
            else if( table [0][0]==table[1][1] && table[1][1] == table[2][2] && (table [0][0]=='x' || table [0][0]=='o'))
            return true;
            else if( table [2][0]==table[1][1] && table[1][1] == table[0][2] && (table [2][0]=='x' || table [2][0]=='o'))
            return true;
        else
            return false; 
    }
    boolean checkIfTie()
    {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(table[i][j]==' ')
                    return false;
        return true;
    }
}
class TicTac
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        Game g =new Game();
        int row;
        int column;
        char player='o';
        g.initializeGame();     //call initialize method
        System.out.println("Lets start");
        while(true)     //chanege player
        {
            player=g.changePlayer(player);
            System.out.print("\n" + player +" Select row and colum u want to take");
            row=u.InputInt();
            column=u.InputInt();
    
        while(g.checkIfLeagal(row, column))    //check availability of row and column 
        {
            System.out.println("given colum or row can not be accesesed..please look for another option");
            g.displayBoard();
            System.out.println("please choose another row and column");
            row=u.InputInt();
            column=u.InputInt();
    
        }
        g.changeBoard(player, row,column);
        g.displayBoard();
        if(g.checkIfWinner())
        {
            System.out.println("winner is " + player+ "!!!!!!!!!!!!");
            break;
        }

        if(g.checkIfTie())
        {
            System.out.println("this is tie");
            break;

        }

        }


    }

} 


