https://www.hackerrank.com/challenges/one-week-preparation-kit-zig-zag-sequence/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-three


In this challenge, the task is to debug the existing code to successfully execute all provided test files.

Given an array of
distinct integers, transform the array into a zig zag sequence by permuting the array elements. A sequence will be called a zig zag sequence if the first elements in the sequence are in increasing order and the last elements are in decreasing order, where

. You need to find the lexicographically smallest zig zag sequence of the given array.

Example.

Now if we permute the array as

, the result is a zig zag sequence.

Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.

Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.

To restore the original code, click on the icon to the right of the language selector.

Input Format

The first line contains
the number of test cases. The first line of each test case contains an integer , denoting the number of array elements. The next line of the test case contains elements of array

.

Constraints


( is always odd)

Output Format

For each test cases, print the elements of the transformed zig zag sequence in a single line.


https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-three


Two players are playing a game of Tower Breakers! Player

always moves first, and both players always play optimally.The rules of the game are as follows:

    Initially there are 

towers.
Each tower is of height
.
The players move in alternating turns.
In each turn, a player can choose a tower of height
and reduce its height to , where and evenly divides

    .
    If the current player is unable to make a move, they lose the game.

Given the values of
and , determine which player will win. If the first player wins, return . Otherwise, return

.

Example.

There are towers, each units tall. Player has a choice of two moves:
- remove pieces from a tower to leave as
- remove pieces to leave Let Player remove . Now the towers are and

units tall.

Player
matches the move. Now the towers are both

units tall.

Now Player

has only one move.

Player
removes pieces leaving . Towers are and units tall.
Player matches again. Towers are both

unit tall.

Player
has no move and loses. Return

.

Function Description

Complete the towerBreakers function in the editor below.

towerBreakers has the following paramter(s):

    int n: the number of towers
    int m: the height of each tower

Returns

    int: the winner of the game

Input Format

The first line contains a single integer
, the number of test cases.
Each of the next lines describes a test case in the form of space-separated integers, and

.

Constraints

Sample Input

STDIN   Function
-----   --------
2       t = 2
2 2     n = 2, m = 2
1 4     n = 1, m = 4

Sample Output

2
1

Explanation

We'll refer to player
as and player as In the first test case, chooses one of the two towers and reduces it to . Then reduces the remaining tower to a height of . As both towers now have height , cannot make a move so

is the winner.

In the second test case, there is only one tower of height
. can reduce it to a height of either or . chooses as both players always choose optimally. Because has no possible move, wins.